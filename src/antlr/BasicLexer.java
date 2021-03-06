// Generated from ./BasicLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COMMA=2, WS=3, COMMENT=4, OPEN_PARENTHESES=5, CLOSE_PARENTHESES=6, 
		ASSIGN=7, BEGIN=8, END=9, IS=10, SKIP=11, RETURN=12, READ=13, FREE=14, 
		EXIT=15, PRINT=16, PRINTLN=17, FOR=18, BREAK=19, IF=20, THEN=21, ELSE=22, 
		FI=23, WHILE=24, DO=25, DONE=26, NEWPAIR=27, CALL=28, FST=29, SND=30, 
		INT=31, BOOL=32, CHAR=33, STRING=34, PAIR=35, LSBRACKET=36, RSBRACKET=37, 
		CHARLITERAL=38, MUL=39, DIV=40, MOD=41, PLUS=42, MINUS=43, GREATER=44, 
		GREATEREQU=45, LESS=46, LESSEQU=47, EQUAL=48, NOTEQUAL=49, AND=50, OR=51, 
		STRLITERAL=52, POSITIVEINTLITERAL=53, JUSTINTLITERAL=54, NOTNEGUNARYOPER=55, 
		TRUE=56, FALSE=57, NULL=58, IDENT=59, ESCAPECHARACTER=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'"
	};
	public static final String[] ruleNames = {
		"SEMICOLON", "COMMA", "WS", "COMMENT", "HASH", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
		"DIGIT", "ASSIGN", "BEGIN", "END", "IS", "SKIP", "RETURN", "READ", "FREE", 
		"EXIT", "PRINT", "PRINTLN", "FOR", "BREAK", "IF", "THEN", "ELSE", "FI", 
		"WHILE", "DO", "DONE", "NEWPAIR", "CALL", "FST", "SND", "INT", "BOOL", 
		"CHAR", "STRING", "PAIR", "LSBRACKET", "RSBRACKET", "UNDERSCORE", "UPPERCASE", 
		"LOWERCASE", "CHARLITERAL", "MUL", "DIV", "MOD", "PLUS", "MINUS", "GREATER", 
		"GREATEREQU", "LESS", "LESSEQU", "EQUAL", "NOTEQUAL", "AND", "OR", "CHARACTER", 
		"STRLITERAL", "HexDigit", "EscapeSequence", "OctalEscape", "UnicodeEscape", 
		"POSITIVEINTLITERAL", "JUSTINTLITERAL", "NOT", "NOTNEGUNARYOPER", "LENGTH", 
		"ORDER", "TOCHAR", "TRUE", "FALSE", "NULL", "IDENT", "ESCAPECHARACTER"
	};


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BasicLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u021b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00a2\n\5"+
		"\f\5\16\5\u00a5\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3-\5-\u0151\n-\3"+
		".\3.\3.\5.\u0156\n.\3/\3/\3/\5/\u015b\n/\3\60\3\60\3\60\5\60\u0160\n\60"+
		"\3\61\3\61\3\61\5\61\u0165\n\61\3\62\3\62\3\62\5\62\u016a\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0171\n\63\3\64\3\64\3\64\5\64\u0176\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u017d\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0184"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u018b\n\67\38\38\38\38\38\58\u0192"+
		"\n8\39\39\39\39\39\59\u0199\n9\3:\7:\u019c\n:\f:\16:\u019f\13:\3:\3:\5"+
		":\u01a3\n:\3;\3;\3;\7;\u01a8\n;\f;\16;\u01ab\13;\3;\3;\3<\3<\3=\3=\3="+
		"\3=\5=\u01b5\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01c0\n>\3?\3?\3?\3?\3?"+
		"\3?\3?\3@\5@\u01ca\n@\3@\6@\u01cd\n@\r@\16@\u01ce\3A\6A\u01d2\nA\rA\16"+
		"A\u01d3\3B\3B\3B\5B\u01d9\nB\3C\3C\3C\3C\5C\u01df\nC\3D\3D\3D\3D\3D\3"+
		"D\3D\5D\u01e8\nD\3E\3E\3E\3E\3E\3E\3E\5E\u01f1\nE\3F\3F\3F\3F\3F\3F\3"+
		"F\5F\u01fa\nF\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\5J\u020f\nJ\3J\3J\3J\3J\7J\u0215\nJ\fJ\16J\u0218\13J\3K\3K\2\2L\3\3"+
		"\5\4\7\5\t\6\13\2\r\7\17\b\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q\2S\2U\2W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65"+
		"s\2u\66w\2y\2{\2}\2\177\67\u00818\u0083\2\u00859\u0087\2\u0089\2\u008b"+
		"\2\u008d:\u008f;\u0091<\u0093=\u0095>\3\2\13\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\5\2$$))^^\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3"+
		"\2\629\13\2$$))\62\62^^ddhhppttvv\u0232\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2u\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2\2\t\u009f\3\2\2\2\13"+
		"\u00a8\3\2\2\2\r\u00aa\3\2\2\2\17\u00ac\3\2\2\2\21\u00ae\3\2\2\2\23\u00b0"+
		"\3\2\2\2\25\u00b2\3\2\2\2\27\u00b8\3\2\2\2\31\u00bc\3\2\2\2\33\u00bf\3"+
		"\2\2\2\35\u00c4\3\2\2\2\37\u00cb\3\2\2\2!\u00d0\3\2\2\2#\u00d5\3\2\2\2"+
		"%\u00da\3\2\2\2\'\u00e0\3\2\2\2)\u00e8\3\2\2\2+\u00ec\3\2\2\2-\u00f2\3"+
		"\2\2\2/\u00f5\3\2\2\2\61\u00fa\3\2\2\2\63\u00ff\3\2\2\2\65\u0102\3\2\2"+
		"\2\67\u0108\3\2\2\29\u010b\3\2\2\2;\u0110\3\2\2\2=\u0118\3\2\2\2?\u011d"+
		"\3\2\2\2A\u0121\3\2\2\2C\u0125\3\2\2\2E\u0129\3\2\2\2G\u012e\3\2\2\2I"+
		"\u0133\3\2\2\2K\u013a\3\2\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2"+
		"\2\2S\u0145\3\2\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u0150\3\2\2\2[\u0155"+
		"\3\2\2\2]\u015a\3\2\2\2_\u015f\3\2\2\2a\u0164\3\2\2\2c\u0169\3\2\2\2e"+
		"\u0170\3\2\2\2g\u0175\3\2\2\2i\u017c\3\2\2\2k\u0183\3\2\2\2m\u018a\3\2"+
		"\2\2o\u0191\3\2\2\2q\u0198\3\2\2\2s\u01a2\3\2\2\2u\u01a4\3\2\2\2w\u01ae"+
		"\3\2\2\2y\u01b4\3\2\2\2{\u01bf\3\2\2\2}\u01c1\3\2\2\2\177\u01c9\3\2\2"+
		"\2\u0081\u01d1\3\2\2\2\u0083\u01d8\3\2\2\2\u0085\u01de\3\2\2\2\u0087\u01e7"+
		"\3\2\2\2\u0089\u01f0\3\2\2\2\u008b\u01f9\3\2\2\2\u008d\u01fb\3\2\2\2\u008f"+
		"\u0200\3\2\2\2\u0091\u0206\3\2\2\2\u0093\u020e\3\2\2\2\u0095\u0219\3\2"+
		"\2\2\u0097\u0098\7=\2\2\u0098\4\3\2\2\2\u0099\u009a\7.\2\2\u009a\6\3\2"+
		"\2\2\u009b\u009c\t\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\4\2\2\u009e"+
		"\b\3\2\2\2\u009f\u00a3\5\13\6\2\u00a0\u00a2\n\3\2\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\5\2\2\u00a7\n\3\2\2\2\u00a8"+
		"\u00a9\7%\2\2\u00a9\f\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\16\3\2\2\2\u00ac"+
		"\u00ad\7+\2\2\u00ad\20\3\2\2\2\u00ae\u00af\4\62;\2\u00af\22\3\2\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7i\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\26\3\2\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\30\3\2\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7m\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7r\2\2\u00c3\34\3\2\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7w\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\u00ca\7p\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7"+
		"t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7f\2\2\u00cf "+
		"\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7z\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7v\2\2\u00d9$\3\2\2\2\u00da\u00db\7r\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2"+
		"\u00df&\3\2\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2"+
		"\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7m\2\2\u00f1,\3\2\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7h\2\2\u00f4.\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\7j\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\60\3\2\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\62\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7k\2\2\u0101\64\3\2\2\2\u0102"+
		"\u0103\7y\2\2\u0103\u0104\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106\7n\2\2"+
		"\u0106\u0107\7g\2\2\u0107\66\3\2\2\2\u0108\u0109\7f\2\2\u0109\u010a\7"+
		"q\2\2\u010a8\3\2\2\2\u010b\u010c\7f\2\2\u010c\u010d\7q\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7g\2\2\u010f:\3\2\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7y\2\2\u0113\u0114\7r\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7t\2\2\u0117<\3\2\2\2\u0118\u0119\7e\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\u011c\7n\2\2\u011c>\3\2\2\2\u011d"+
		"\u011e\7h\2\2\u011e\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120@\3\2\2\2\u0121"+
		"\u0122\7u\2\2\u0122\u0123\7p\2\2\u0123\u0124\7f\2\2\u0124B\3\2\2\2\u0125"+
		"\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127\u0128\7v\2\2\u0128D\3\2\2\2\u0129"+
		"\u012a\7d\2\2\u012a\u012b\7q\2\2\u012b\u012c\7q\2\2\u012c\u012d\7n\2\2"+
		"\u012dF\3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130\7j\2\2\u0130\u0131\7c\2"+
		"\2\u0131\u0132\7t\2\2\u0132H\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7"+
		"v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7i\2\2\u0139J\3\2\2\2\u013a\u013b\7r\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7k\2\2\u013d\u013e\7t\2\2\u013eL\3\2\2\2\u013f\u0140\7]\2\2\u0140N\3"+
		"\2\2\2\u0141\u0142\7_\2\2\u0142P\3\2\2\2\u0143\u0144\7a\2\2\u0144R\3\2"+
		"\2\2\u0145\u0146\4C\\\2\u0146T\3\2\2\2\u0147\u0148\4c|\2\u0148V\3\2\2"+
		"\2\u0149\u014a\7)\2\2\u014a\u014b\5s:\2\u014b\u014c\7)\2\2\u014cX\3\2"+
		"\2\2\u014d\u0151\7,\2\2\u014e\u014f\7,\2\2\u014f\u0151\7\"\2\2\u0150\u014d"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151Z\3\2\2\2\u0152\u0156\7\61\2\2\u0153"+
		"\u0154\7\61\2\2\u0154\u0156\7\"\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3"+
		"\2\2\2\u0156\\\3\2\2\2\u0157\u015b\7\'\2\2\u0158\u0159\7\'\2\2\u0159\u015b"+
		"\7\"\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015b^\3\2\2\2\u015c"+
		"\u0160\7-\2\2\u015d\u015e\7-\2\2\u015e\u0160\7\"\2\2\u015f\u015c\3\2\2"+
		"\2\u015f\u015d\3\2\2\2\u0160`\3\2\2\2\u0161\u0165\7/\2\2\u0162\u0163\7"+
		"/\2\2\u0163\u0165\7\"\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"b\3\2\2\2\u0166\u016a\7@\2\2\u0167\u0168\7@\2\2\u0168\u016a\7\"\2\2\u0169"+
		"\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u016ad\3\2\2\2\u016b\u016c\7@\2\2\u016c"+
		"\u0171\7?\2\2\u016d\u016e\7@\2\2\u016e\u016f\7?\2\2\u016f\u0171\7\"\2"+
		"\2\u0170\u016b\3\2\2\2\u0170\u016d\3\2\2\2\u0171f\3\2\2\2\u0172\u0176"+
		"\7>\2\2\u0173\u0174\7>\2\2\u0174\u0176\7\"\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176h\3\2\2\2\u0177\u0178\7>\2\2\u0178\u017d\7?\2\2\u0179"+
		"\u017a\7>\2\2\u017a\u017b\7?\2\2\u017b\u017d\7\"\2\2\u017c\u0177\3\2\2"+
		"\2\u017c\u0179\3\2\2\2\u017dj\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0184\7"+
		"?\2\2\u0180\u0181\7?\2\2\u0181\u0182\7?\2\2\u0182\u0184\7\"\2\2\u0183"+
		"\u017e\3\2\2\2\u0183\u0180\3\2\2\2\u0184l\3\2\2\2\u0185\u0186\7#\2\2\u0186"+
		"\u018b\7?\2\2\u0187\u0188\7#\2\2\u0188\u0189\7?\2\2\u0189\u018b\7\"\2"+
		"\2\u018a\u0185\3\2\2\2\u018a\u0187\3\2\2\2\u018bn\3\2\2\2\u018c\u018d"+
		"\7(\2\2\u018d\u0192\7(\2\2\u018e\u018f\7(\2\2\u018f\u0190\7(\2\2\u0190"+
		"\u0192\7\"\2\2\u0191\u018c\3\2\2\2\u0191\u018e\3\2\2\2\u0192p\3\2\2\2"+
		"\u0193\u0194\7~\2\2\u0194\u0199\7~\2\2\u0195\u0196\7~\2\2\u0196\u0197"+
		"\7~\2\2\u0197\u0199\7\"\2\2\u0198\u0193\3\2\2\2\u0198\u0195\3\2\2\2\u0199"+
		"r\3\2\2\2\u019a\u019c\n\4\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a3\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a1\7^\2\2\u01a1\u01a3\5\u0095K\2\u01a2\u019d\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3t\3\2\2\2\u01a4\u01a9\7$\2\2\u01a5\u01a8\5y"+
		"=\2\u01a6\u01a8\n\5\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7$\2\2\u01adv\3\2\2\2\u01ae\u01af"+
		"\t\6\2\2\u01afx\3\2\2\2\u01b0\u01b1\7^\2\2\u01b1\u01b5\t\7\2\2\u01b2\u01b5"+
		"\5}?\2\u01b3\u01b5\5{>\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5z\3\2\2\2\u01b6\u01b7\7^\2\2\u01b7\u01b8\t\b\2\2\u01b8"+
		"\u01b9\t\t\2\2\u01b9\u01c0\t\t\2\2\u01ba\u01bb\7^\2\2\u01bb\u01bc\t\t"+
		"\2\2\u01bc\u01c0\t\t\2\2\u01bd\u01be\7^\2\2\u01be\u01c0\t\t\2\2\u01bf"+
		"\u01b6\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0|\3\2\2\2"+
		"\u01c1\u01c2\7^\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\5w<\2\u01c4\u01c5\5"+
		"w<\2\u01c5\u01c6\5w<\2\u01c6\u01c7\5w<\2\u01c7~\3\2\2\2\u01c8\u01ca\7"+
		"-\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01cd\5\21\t\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0080\3\2\2\2\u01d0\u01d2\5\21\t\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u0082\3\2\2\2\u01d5\u01d9\7#\2\2\u01d6\u01d7\7#\2\2\u01d7\u01d9"+
		"\7\"\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u0084\3\2\2\2\u01da"+
		"\u01df\5\u0083B\2\u01db\u01df\5\u0087D\2\u01dc\u01df\5\u0089E\2\u01dd"+
		"\u01df\5\u008bF\2\u01de\u01da\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u0086\3\2\2\2\u01e0\u01e1\7n\2\2\u01e1"+
		"\u01e2\7g\2\2\u01e2\u01e8\7p\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7g\2\2"+
		"\u01e5\u01e6\7p\2\2\u01e6\u01e8\7\"\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e3"+
		"\3\2\2\2\u01e8\u0088\3\2\2\2\u01e9\u01ea\7q\2\2\u01ea\u01eb\7t\2\2\u01eb"+
		"\u01f1\7f\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7f\2\2"+
		"\u01ef\u01f1\7\"\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1\u008a"+
		"\3\2\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7j\2\2\u01f4\u01fa\7t\2\2\u01f5"+
		"\u01f6\7e\2\2\u01f6\u01f7\7j\2\2\u01f7\u01f8\7t\2\2\u01f8\u01fa\7\"\2"+
		"\2\u01f9\u01f2\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa\u008c\3\2\2\2\u01fb\u01fc"+
		"\7v\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7g\2\2\u01ff"+
		"\u008e\3\2\2\2\u0200\u0201\7h\2\2\u0201\u0202\7c\2\2\u0202\u0203\7n\2"+
		"\2\u0203\u0204\7u\2\2\u0204\u0205\7g\2\2\u0205\u0090\3\2\2\2\u0206\u0207"+
		"\7p\2\2\u0207\u0208\7w\2\2\u0208\u0209\7n\2\2\u0209\u020a\7n\2\2\u020a"+
		"\u0092\3\2\2\2\u020b\u020f\5Q)\2\u020c\u020f\5S*\2\u020d\u020f\5U+\2\u020e"+
		"\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u0216\3\2"+
		"\2\2\u0210\u0215\5Q)\2\u0211\u0215\5S*\2\u0212\u0215\5U+\2\u0213\u0215"+
		"\5\21\t\2\u0214\u0210\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2"+
		"\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0094\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\t\n\2\2\u021a"+
		"\u0096\3\2\2\2\"\2\u00a3\u0150\u0155\u015a\u015f\u0164\u0169\u0170\u0175"+
		"\u017c\u0183\u018a\u0191\u0198\u019d\u01a2\u01a7\u01a9\u01b4\u01bf\u01c9"+
		"\u01ce\u01d3\u01d8\u01de\u01e7\u01f0\u01f9\u020e\u0214\u0216\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}