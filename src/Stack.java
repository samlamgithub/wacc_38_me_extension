import java.util.Iterator;
import java.util.LinkedList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Stack {

	private int sp, currentScopeGroup;
	private LinkedList<VariableData> stack;
	private LinkedList<Integer> scopeSpace;
	private LinkedList<Boolean> isFunc;
	private LinkedList<Integer> scopeTakeup;

	public Stack() {
		sp = 0;
		stack = new LinkedList<>();
		scopeSpace = new LinkedList<Integer>();
		isFunc = new LinkedList<Boolean>();
		scopeTakeup = new LinkedList<Integer>();
		currentScopeGroup = -1;
	}

	public int getSp() {
		return sp;
	}

	public VariableData getVarFromOffset(int offset) {
		System.out.println("get car from offset: " + offset);
		int position = sp + offset;
		for (VariableData v : stack) {
			if (v != null) {
				if (v.getPosition() == position) {
					return v;
				}
			}
		}
		return null;
	}

	public void JustIncreaseSp(int x) {
		System.out.println("sp before increase:  :::::::::::::::::::" + sp);
		sp += x;
		System.out.println("sp after increase:  :::::::::::::::::::" + sp);
	}

	public void enterScope(int space) {
		System.out.println("enter stack with:            " + space);
		System.out
				.println(" before enter scope group : ------------------------------"
						+ currentScopeGroup);
		currentScopeGroup++; // new scope group
		this.JustIncreaseSp(-space); // new space
		scopeSpace.add(space); // add scope sapces
		isFunc.add(false); // add scope sapces
		scopeTakeup.add(0);
	}

	public void exitScope(int space) {
		System.out.println("exit with: " + space);
		this.printStack();
		System.out
				.println(" before exit scope group : ------------------------------"
						+ currentScopeGroup);
		System.out.println("before exit sp : ------------------------------"
				+ sp);
		currentScopeGroup--; // delete scope group
		this.JustIncreaseSp(space); // delete space
		int count = 0;
		boolean passNull = false;
		Iterator<VariableData> it = stack.descendingIterator();
		while (it.hasNext()) {
			VariableData v = it.next();
			if (v == null) {
				if (!passNull) {
					count++;
					passNull = true;
				} else {
					break;
				}
			} else if (v.getScopeGroup() == currentScopeGroup + 1) {
				count++;
			}
		}
		System.out.println("count is : " + count);
		for (int x = 0; x < count; x++) {
			if (stack.getLast() == null) {
				System.out.println("remove null thing");
			} else {
				System.out.println("remove " + stack.getLast().getName());
			}
			stack.removeLast();
		}
		if (stack.size() != 0) {
			if (stack.getLast() == null) {
				stack.removeLast();
			}
		}
		scopeSpace.removeLast(); // delete scope spaces
		isFunc.removeLast();
		scopeTakeup.removeLast();
		System.out
				.println(" after exit scope group : ------------------------------"
						+ currentScopeGroup);
		System.out.println("after exitr sp: ------------------------------"
				+ sp);
		this.printStack();
	}

	public int exitScopeToRetunFunction() {
		System.out.println("exit scope to return function: ");
		this.printStack();
		System.out
				.println(" before exit scope group : ------------------------------"
						+ currentScopeGroup);
		System.out.println("before exit sp : ------------------------------"
				+ sp);
		Iterator<Boolean> its = isFunc.descendingIterator();
		int funcScope = currentScopeGroup;
		while (its.hasNext()) {
			Boolean v = its.next();
			if (!v) {
				funcScope--;
			}
		}
		System.out.println("func scope is: " + funcScope);
		int count = 0;
		boolean mark = false;
		for (VariableData v : stack) {
			if (v != null) {
				if (!mark) {
					if (v.getScopeGroup() == funcScope) {
						mark = true;
					}
				} else {
					if (v.getScopeGroup() == funcScope) {
						count += getSpace(v.getType());
						System.out.println("add : " + v.getName());
					}
				}
			}
		}
		return count;
	}

	public void addVariable(String name, Type type) {
		int posi = getStorePo();
		System.out.println("posi: " + posi);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ add var to sp , name: "
				+ name + " type: " + type + " position: "
				+ (-posi - getSpace(type)) + "  gourp: " + currentScopeGroup
				+ "  sp: " + sp);
		stack.add(new VariableData(name, -posi - getSpace(type), type,
				currentScopeGroup));
		int get = scopeTakeup.get(currentScopeGroup) + getSpace(type);
		scopeTakeup.removeLast();
		scopeTakeup.add(get);
	}

	public void addPUSH() {
		System.out.println(" STACK ADD PUSH");
		stack.add(null);
		int get = scopeTakeup.get(currentScopeGroup) + 4;
		scopeTakeup.removeLast();
		scopeTakeup.add(get);
		isFunc.removeLast();
		isFunc.add(true);
	}

	public int getStorePo() {
		int group = currentScopeGroup;
		int count = 0;
		for (int i = 0; i < group; i++) {
			System.out.println("posi count: i" + i);
			count += scopeSpace.get(i);
		}
		System.out.println("posi count: " + count);
		return count + scopeTakeup.get(group);
	}

	public int getTotalSpace() {
		int total = 0;
		for (VariableData v : stack) {
			if (v != null) {
				total += getSpace(v.getType());
			}

		}
		return total;
	}

	public int getSpace(Type type) {
		if (type instanceof IntType || type instanceof StringType
				|| type instanceof ArrayType || type instanceof PairType) {
			return 4;
		} else {
			return 1;
		}
	}

	public LinkedList<VariableData> getScopeGroup(int g) {
		if (g > currentScopeGroup || g < 0) {
			return null;
		} else {
			LinkedList<VariableData> list = new LinkedList<VariableData>();
			for (VariableData v : stack) {
				if (v != null) {
					if (v.getScopeGroup() == g) {
						list.add(v);
					}
				}

			}
			return list;
		}
	}

	public boolean lookUpLocal(String name) {
		return lookUpInGroup(name, currentScopeGroup);
	}

	public boolean lookUpInGroup(String name, int group) {
		for (VariableData v : stack) {
			if (v != null) {
				if (v.getName().equals(name) && v.getScopeGroup() == group) {
					return true;
				}
			}

		}
		return false;
	}

	public boolean lookUpAll(String name) {
		for (int i = currentScopeGroup; i >= 0; i--) {
			if (lookUpInGroup(name, i)) {
				return true;
			}
		}
		return false;
	}

	public int getOffsetGlobal(String name) {
		for (int i = currentScopeGroup; i >= 0; i--) {
			if (lookUpInGroup(name, i)) {
				VariableData x = getOffsetInGroup(name, i);
				System.out.println("name get offset: " + x.getName()
						+ ":: scope group: " + x.getScopeGroup()
						+ ":: position: " + x.getPosition() + "::   sp: " + sp
						+ "  offset : " + (x.getPosition() - sp));
				return (x.getPosition() - sp);
			}
		}
		return (Integer) null;
	}

	public VariableData get(String name) {
		for (VariableData v : stack) {
			if (v != null) {
				if (v.getName().equals(name)
						&& v.getScopeGroup() == currentScopeGroup) {
					return v;
				}
			}

		}
		return null;
	}

	public int getOffsetLocal(String name) {
		for (VariableData v : stack) {
			if (v != null) {
				if (v.getName().equals(name)
						&& v.getScopeGroup() == currentScopeGroup) {
					return (v.getPosition() - sp);
				}
			}

		}
		return (Integer) null;
	}

	public int getScopeSpaces() {
		int re = 0;
		for (int v : scopeSpace) {
			re += v;
		}
		return re;
	}

	public VariableData getOffsetInGroup(String name, int g) {
		for (VariableData v : stack) {
			if (v != null) {
				if (v.getName().equals(name) && v.getScopeGroup() == g) {
					System.out.println("name: " + v.getName() + " has offset: "
							+ (v.getPosition() - sp));
					return v;
				}
			}

		}
		return null;
	}

	public void push() {
		JustIncreaseSp(-4);
	}

	public void pop() {
		JustIncreaseSp(4);
	}

	public void printStack() {
		System.out.println("$$$$$$$$$$$$$$$$ print stack:::::   current Scope group is "
				+ currentScopeGroup + " - sp is: " + sp);
		for (VariableData v : stack) {
			if (v == null) {
				System.out.println("$$$$$$$$$$$$ null thing");
			} else {
				System.out.println("$$$$$$$$$$$$$ name: " + v.getName()
						+ ":: scope group: " + v.getScopeGroup()
						+ ":: position: " + v.getPosition() + "::   sp: " + sp
						+ "  offset : " + (v.getPosition() - sp));
			}

		}
	}

}