// Generated from n3.g4 by ANTLR 4.6
// jshint ignore: start
var antlr4 = require('antlr4/index');
var n3Listener = require('./n3Listener').n3Listener;
var n3Visitor = require('./n3Visitor').n3Visitor;


//    package parser.antlr;

var grammarFileName = "n3.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003=\u00fc\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t",
    "\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004",
    "\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t",
    "\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004",
    "\u001f\t\u001f\u0004 \t \u0004!\t!\u0003\u0002\u0003\u0002\u0003\u0002",
    "\u0003\u0002\u0007\u0002G\n\u0002\f\u0002\u000e\u0002J\u000b\u0002\u0003",
    "\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005",
    "\u0003R\n\u0003\u0003\u0004\u0003\u0004\u0005\u0004V\n\u0004\u0003\u0005",
    "\u0003\u0005\u0005\u0005Z\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0005\nl\n\n\u0003",
    "\n\u0005\no\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0005\u000bw\n\u000b\u0007\u000by\n\u000b\f\u000b",
    "\u000e\u000b|\u000b\u000b\u0003\f\u0003\f\u0003\f\u0007\f\u0081\n\f",
    "\f\f\u000e\f\u0084\u000b\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0005\r\u0098\n\r\u0003\u000e\u0003\u000e",
    "\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u009f\n\u000f\u0003",
    "\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003",
    "\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00aa\n\u0012\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013",
    "\u0005\u0013\u00b3\n\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0005",
    "\u0014\u00b8\n\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u00bc\n\u0015",
    "\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0007\u0016\u00c2\n",
    "\u0016\f\u0016\u000e\u0016\u00c5\u000b\u0016\u0003\u0016\u0003\u0016",
    "\u0003\u0017\u0003\u0017\u0005\u0017\u00cb\n\u0017\u0003\u0017\u0003",
    "\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u00d2\n\u0018",
    "\u0005\u0018\u00d4\n\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u00d8",
    "\n\u0018\u0005\u0018\u00da\n\u0018\u0003\u0019\u0003\u0019\u0003\u001a",
    "\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u00e2\n\u001a\u0003",
    "\u001b\u0003\u001b\u0005\u001b\u00e6\n\u001b\u0003\u001c\u0003\u001c",
    "\u0003\u001c\u0007\u001c\u00eb\n\u001c\f\u001c\u000e\u001c\u00ee\u000b",
    "\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003",
    "\u001f\u0003 \u0003 \u0003 \u0003!\u0003!\u0003!\u0003!\u0002\u0002",
    "\"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a",
    "\u001c\u001e \"$&(*,.02468:<>@\u0002\u0005\u0003\u0002&(\u0003\u0002",
    "\"#\u0004\u0002$$11\u0106\u0002H\u0003\u0002\u0002\u0002\u0004Q\u0003",
    "\u0002\u0002\u0002\u0006U\u0003\u0002\u0002\u0002\bY\u0003\u0002\u0002",
    "\u0002\n[\u0003\u0002\u0002\u0002\f^\u0003\u0002\u0002\u0002\u000eb",
    "\u0003\u0002\u0002\u0002\u0010f\u0003\u0002\u0002\u0002\u0012k\u0003",
    "\u0002\u0002\u0002\u0014p\u0003\u0002\u0002\u0002\u0016}\u0003\u0002",
    "\u0002\u0002\u0018\u0097\u0003\u0002\u0002\u0002\u001a\u0099\u0003\u0002",
    "\u0002\u0002\u001c\u009e\u0003\u0002\u0002\u0002\u001e\u00a0\u0003\u0002",
    "\u0002\u0002 \u00a2\u0003\u0002\u0002\u0002\"\u00a4\u0003\u0002\u0002",
    "\u0002$\u00b2\u0003\u0002\u0002\u0002&\u00b7\u0003\u0002\u0002\u0002",
    "(\u00b9\u0003\u0002\u0002\u0002*\u00bf\u0003\u0002\u0002\u0002,\u00c8",
    "\u0003\u0002\u0002\u0002.\u00d9\u0003\u0002\u0002\u00020\u00db\u0003",
    "\u0002\u0002\u00022\u00dd\u0003\u0002\u0002\u00024\u00e5\u0003\u0002",
    "\u0002\u00026\u00e7\u0003\u0002\u0002\u00028\u00ef\u0003\u0002\u0002",
    "\u0002:\u00f1\u0003\u0002\u0002\u0002<\u00f3\u0003\u0002\u0002\u0002",
    ">\u00f5\u0003\u0002\u0002\u0002@\u00f8\u0003\u0002\u0002\u0002BC\u0005",
    "\u0004\u0003\u0002CD\u0007\u0003\u0002\u0002DG\u0003\u0002\u0002\u0002",
    "EG\u0005\b\u0005\u0002FB\u0003\u0002\u0002\u0002FE\u0003\u0002\u0002",
    "\u0002GJ\u0003\u0002\u0002\u0002HF\u0003\u0002\u0002\u0002HI\u0003\u0002",
    "\u0002\u0002IK\u0003\u0002\u0002\u0002JH\u0003\u0002\u0002\u0002KL\u0007",
    "\u0002\u0002\u0003L\u0003\u0003\u0002\u0002\u0002MR\u0005\u0006\u0004",
    "\u0002NR\u0005\u0012\n\u0002OR\u0005> \u0002PR\u0005@!\u0002QM\u0003",
    "\u0002\u0002\u0002QN\u0003\u0002\u0002\u0002QO\u0003\u0002\u0002\u0002",
    "QP\u0003\u0002\u0002\u0002R\u0005\u0003\u0002\u0002\u0002SV\u0005\u000e",
    "\b\u0002TV\u0005\u0010\t\u0002US\u0003\u0002\u0002\u0002UT\u0003\u0002",
    "\u0002\u0002V\u0007\u0003\u0002\u0002\u0002WZ\u0005\n\u0006\u0002XZ",
    "\u0005\f\u0007\u0002YW\u0003\u0002\u0002\u0002YX\u0003\u0002\u0002\u0002",
    "Z\t\u0003\u0002\u0002\u0002[\\\u00076\u0002\u0002\\]\u0007!\u0002\u0002",
    "]\u000b\u0003\u0002\u0002\u0002^_\u00077\u0002\u0002_`\u0007\"\u0002",
    "\u0002`a\u0007!\u0002\u0002a\r\u0003\u0002\u0002\u0002bc\u0007\u0004",
    "\u0002\u0002cd\u0007\"\u0002\u0002de\u0007!\u0002\u0002e\u000f\u0003",
    "\u0002\u0002\u0002fg\u0007\u0005\u0002\u0002gh\u0007!\u0002\u0002h\u0011",
    "\u0003\u0002\u0002\u0002il\u0005\u001a\u000e\u0002jl\u0005(\u0015\u0002",
    "ki\u0003\u0002\u0002\u0002kj\u0003\u0002\u0002\u0002ln\u0003\u0002\u0002",
    "\u0002mo\u0005\u0014\u000b\u0002nm\u0003\u0002\u0002\u0002no\u0003\u0002",
    "\u0002\u0002o\u0013\u0003\u0002\u0002\u0002pq\u0005\u0018\r\u0002qz",
    "\u0005\u0016\f\u0002rv\u0007\u0006\u0002\u0002st\u0005\u0018\r\u0002",
    "tu\u0005\u0016\f\u0002uw\u0003\u0002\u0002\u0002vs\u0003\u0002\u0002",
    "\u0002vw\u0003\u0002\u0002\u0002wy\u0003\u0002\u0002\u0002xr\u0003\u0002",
    "\u0002\u0002y|\u0003\u0002\u0002\u0002zx\u0003\u0002\u0002\u0002z{\u0003",
    "\u0002\u0002\u0002{\u0015\u0003\u0002\u0002\u0002|z\u0003\u0002\u0002",
    "\u0002}\u0082\u0005\u001e\u0010\u0002~\u007f\u0007\u0007\u0002\u0002",
    "\u007f\u0081\u0005\u001e\u0010\u0002\u0080~\u0003\u0002\u0002\u0002",
    "\u0081\u0084\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002",
    "\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0017\u0003\u0002\u0002\u0002",
    "\u0084\u0082\u0003\u0002\u0002\u0002\u0085\u0098\u0005\u001c\u000f\u0002",
    "\u0086\u0098\u0007\b\u0002\u0002\u0087\u0098\u0007\t\u0002\u0002\u0088",
    "\u0089\u0007\n\u0002\u0002\u0089\u0098\u0005 \u0011\u0002\u008a\u008b",
    "\u0007\u000b\u0002\u0002\u008b\u0098\u0005 \u0011\u0002\u008c\u008d",
    "\u0007\f\u0002\u0002\u008d\u008e\u0005 \u0011\u0002\u008e\u008f\u0007",
    "\r\u0002\u0002\u008f\u0098\u0003\u0002\u0002\u0002\u0090\u0091\u0007",
    "\u000e\u0002\u0002\u0091\u0092\u0005 \u0011\u0002\u0092\u0093\u0007",
    "\u000f\u0002\u0002\u0093\u0098\u0003\u0002\u0002\u0002\u0094\u0098\u0007",
    "\u0010\u0002\u0002\u0095\u0098\u0007\u0011\u0002\u0002\u0096\u0098\u0007",
    "\u0012\u0002\u0002\u0097\u0085\u0003\u0002\u0002\u0002\u0097\u0086\u0003",
    "\u0002\u0002\u0002\u0097\u0087\u0003\u0002\u0002\u0002\u0097\u0088\u0003",
    "\u0002\u0002\u0002\u0097\u008a\u0003\u0002\u0002\u0002\u0097\u008c\u0003",
    "\u0002\u0002\u0002\u0097\u0090\u0003\u0002\u0002\u0002\u0097\u0094\u0003",
    "\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0096\u0003",
    "\u0002\u0002\u0002\u0098\u0019\u0003\u0002\u0002\u0002\u0099\u009a\u0005",
    " \u0011\u0002\u009a\u001b\u0003\u0002\u0002\u0002\u009b\u009f\u0005",
    " \u0011\u0002\u009c\u009d\u0007\u0013\u0002\u0002\u009d\u009f\u0005",
    " \u0011\u0002\u009e\u009b\u0003\u0002\u0002\u0002\u009e\u009c\u0003",
    "\u0002\u0002\u0002\u009f\u001d\u0003\u0002\u0002\u0002\u00a0\u00a1\u0005",
    " \u0011\u0002\u00a1\u001f\u0003\u0002\u0002\u0002\u00a2\u00a3\u0005",
    "\"\u0012\u0002\u00a3!\u0003\u0002\u0002\u0002\u00a4\u00a9\u0005$\u0013",
    "\u0002\u00a5\u00a6\u0007\u0014\u0002\u0002\u00a6\u00aa\u0005\"\u0012",
    "\u0002\u00a7\u00a8\u0007\u0013\u0002\u0002\u00a8\u00aa\u0005\"\u0012",
    "\u0002\u00a9\u00a5\u0003\u0002\u0002\u0002\u00a9\u00a7\u0003\u0002\u0002",
    "\u0002\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa#\u0003\u0002\u0002",
    "\u0002\u00ab\u00b3\u00054\u001b\u0002\u00ac\u00b3\u0005:\u001e\u0002",
    "\u00ad\u00b3\u0005<\u001f\u0002\u00ae\u00b3\u0005*\u0016\u0002\u00af",
    "\u00b3\u0005(\u0015\u0002\u00b0\u00b3\u0005&\u0014\u0002\u00b1\u00b3",
    "\u0005,\u0017\u0002\u00b2\u00ab\u0003\u0002\u0002\u0002\u00b2\u00ac",
    "\u0003\u0002\u0002\u0002\u00b2\u00ad\u0003\u0002\u0002\u0002\u00b2\u00ae",
    "\u0003\u0002\u0002\u0002\u00b2\u00af\u0003\u0002\u0002\u0002\u00b2\u00b0",
    "\u0003\u0002\u0002\u0002\u00b2\u00b1\u0003\u0002\u0002\u0002\u00b3%",
    "\u0003\u0002\u0002\u0002\u00b4\u00b8\u00052\u001a\u0002\u00b5\u00b8",
    "\u00050\u0019\u0002\u00b6\u00b8\u0007\u001f\u0002\u0002\u00b7\u00b4",
    "\u0003\u0002\u0002\u0002\u00b7\u00b5\u0003\u0002\u0002\u0002\u00b7\u00b6",
    "\u0003\u0002\u0002\u0002\u00b8\'\u0003\u0002\u0002\u0002\u00b9\u00bb",
    "\u0007\u0015\u0002\u0002\u00ba\u00bc\u0005\u0014\u000b\u0002\u00bb\u00ba",
    "\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u00bd",
    "\u0003\u0002\u0002\u0002\u00bd\u00be\u0007\u0016\u0002\u0002\u00be)",
    "\u0003\u0002\u0002\u0002\u00bf\u00c3\u0007\u0017\u0002\u0002\u00c0\u00c2",
    "\u0005\u001e\u0010\u0002\u00c1\u00c0\u0003\u0002\u0002\u0002\u00c2\u00c5",
    "\u0003\u0002\u0002\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c4",
    "\u0003\u0002\u0002\u0002\u00c4\u00c6\u0003\u0002\u0002\u0002\u00c5\u00c3",
    "\u0003\u0002\u0002\u0002\u00c6\u00c7\u0007\u0018\u0002\u0002\u00c7+",
    "\u0003\u0002\u0002\u0002\u00c8\u00ca\u0007\u0019\u0002\u0002\u00c9\u00cb",
    "\u0005.\u0018\u0002\u00ca\u00c9\u0003\u0002\u0002\u0002\u00ca\u00cb",
    "\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00cd",
    "\u0007\u001a\u0002\u0002\u00cd-\u0003\u0002\u0002\u0002\u00ce\u00d3",
    "\u0005\u0004\u0003\u0002\u00cf\u00d1\u0007\u0003\u0002\u0002\u00d0\u00d2",
    "\u0005.\u0018\u0002\u00d1\u00d0\u0003\u0002\u0002\u0002\u00d1\u00d2",
    "\u0003\u0002\u0002\u0002\u00d2\u00d4\u0003\u0002\u0002\u0002\u00d3\u00cf",
    "\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00da",
    "\u0003\u0002\u0002\u0002\u00d5\u00d7\u0005\b\u0005\u0002\u00d6\u00d8",
    "\u0005.\u0018\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8",
    "\u0003\u0002\u0002\u0002\u00d8\u00da\u0003\u0002\u0002\u0002\u00d9\u00ce",
    "\u0003\u0002\u0002\u0002\u00d9\u00d5\u0003\u0002\u0002\u0002\u00da/",
    "\u0003\u0002\u0002\u0002\u00db\u00dc\t\u0002\u0002\u0002\u00dc1\u0003",
    "\u0002\u0002\u0002\u00dd\u00e1\u0007 \u0002\u0002\u00de\u00e2\u0007",
    "%\u0002\u0002\u00df\u00e0\u0007\u001b\u0002\u0002\u00e0\u00e2\u0005",
    "4\u001b\u0002\u00e1\u00de\u0003\u0002\u0002\u0002\u00e1\u00df\u0003",
    "\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e23\u0003",
    "\u0002\u0002\u0002\u00e3\u00e6\u0007!\u0002\u0002\u00e4\u00e6\u0005",
    "8\u001d\u0002\u00e5\u00e3\u0003\u0002\u0002\u0002\u00e5\u00e4\u0003",
    "\u0002\u0002\u0002\u00e65\u0003\u0002\u0002\u0002\u00e7\u00ec\u0005",
    "4\u001b\u0002\u00e8\u00e9\u0007\u0007\u0002\u0002\u00e9\u00eb\u0005",
    "4\u001b\u0002\u00ea\u00e8\u0003\u0002\u0002\u0002\u00eb\u00ee\u0003",
    "\u0002\u0002\u0002\u00ec\u00ea\u0003\u0002\u0002\u0002\u00ec\u00ed\u0003",
    "\u0002\u0002\u0002\u00ed7\u0003\u0002\u0002\u0002\u00ee\u00ec\u0003",
    "\u0002\u0002\u0002\u00ef\u00f0\t\u0003\u0002\u0002\u00f09\u0003\u0002",
    "\u0002\u0002\u00f1\u00f2\t\u0004\u0002\u0002\u00f2;\u0003\u0002\u0002",
    "\u0002\u00f3\u00f4\u00072\u0002\u0002\u00f4=\u0003\u0002\u0002\u0002",
    "\u00f5\u00f6\u0007\u001c\u0002\u0002\u00f6\u00f7\u00056\u001c\u0002",
    "\u00f7?\u0003\u0002\u0002\u0002\u00f8\u00f9\u0007\u001d\u0002\u0002",
    "\u00f9\u00fa\u00056\u001c\u0002\u00faA\u0003\u0002\u0002\u0002\u001b",
    "FHQUYknvz\u0082\u0097\u009e\u00a9\u00b2\u00b7\u00bb\u00c3\u00ca\u00d1",
    "\u00d3\u00d7\u00d9\u00e1\u00e5\u00ec"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'.'", "'@prefix'", "'@base'", "';'", "','", 
                     "'a'", "'@a'", "'has'", "'@has'", "'is'", "'of'", "'@is'", 
                     "'@of'", "'='", "'<='", "'=>'", "'^'", "'!'", "'['", 
                     "']'", "'('", "')'", "'{'", "'}'", "'^^'", "'@forSome'", 
                     "'@forAll'" ];

var symbolicNames = [ null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, null, null, null, null, 
                      null, "COMMENT", "BooleanLiteral", "String", "IRIREF", 
                      "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", 
                      "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
                      "STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", 
                      "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", "WS", 
                      "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
                      "PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", 
                      "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC" ];

var ruleNames =  [ "n3Doc", "n3Statement", "n3Directive", "sparqlDirective", 
                   "sparqlBase", "sparqlPrefix", "prefixID", "base", "triples", 
                   "predicateObjectList", "objectList", "verb", "subject", 
                   "predicate", "object", "expression", "path", "pathItem", 
                   "literal", "blankNodePropertyList", "collection", "formula", 
                   "formulaContent", "numericLiteral", "rdfLiteral", "iri", 
                   "iriList", "prefixedName", "blankNode", "quickVar", "existential", 
                   "universal" ];

function n3Parser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

n3Parser.prototype = Object.create(antlr4.Parser.prototype);
n3Parser.prototype.constructor = n3Parser;

Object.defineProperty(n3Parser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

n3Parser.EOF = antlr4.Token.EOF;
n3Parser.T__0 = 1;
n3Parser.T__1 = 2;
n3Parser.T__2 = 3;
n3Parser.T__3 = 4;
n3Parser.T__4 = 5;
n3Parser.T__5 = 6;
n3Parser.T__6 = 7;
n3Parser.T__7 = 8;
n3Parser.T__8 = 9;
n3Parser.T__9 = 10;
n3Parser.T__10 = 11;
n3Parser.T__11 = 12;
n3Parser.T__12 = 13;
n3Parser.T__13 = 14;
n3Parser.T__14 = 15;
n3Parser.T__15 = 16;
n3Parser.T__16 = 17;
n3Parser.T__17 = 18;
n3Parser.T__18 = 19;
n3Parser.T__19 = 20;
n3Parser.T__20 = 21;
n3Parser.T__21 = 22;
n3Parser.T__22 = 23;
n3Parser.T__23 = 24;
n3Parser.T__24 = 25;
n3Parser.T__25 = 26;
n3Parser.T__26 = 27;
n3Parser.COMMENT = 28;
n3Parser.BooleanLiteral = 29;
n3Parser.String = 30;
n3Parser.IRIREF = 31;
n3Parser.PNAME_NS = 32;
n3Parser.PNAME_LN = 33;
n3Parser.BLANK_NODE_LABEL = 34;
n3Parser.LANGTAG = 35;
n3Parser.INTEGER = 36;
n3Parser.DECIMAL = 37;
n3Parser.DOUBLE = 38;
n3Parser.EXPONENT = 39;
n3Parser.STRING_LITERAL_LONG_SINGLE_QUOTE = 40;
n3Parser.STRING_LITERAL_LONG_QUOTE = 41;
n3Parser.STRING_LITERAL_QUOTE = 42;
n3Parser.STRING_LITERAL_SINGLE_QUOTE = 43;
n3Parser.UCHAR = 44;
n3Parser.ECHAR = 45;
n3Parser.WS = 46;
n3Parser.ANON = 47;
n3Parser.QuickVarName = 48;
n3Parser.PN_CHARS_U = 49;
n3Parser.PN_CHARS_BASE = 50;
n3Parser.PN_CHARS = 51;
n3Parser.BASE = 52;
n3Parser.PREFIX = 53;
n3Parser.PN_PREFIX = 54;
n3Parser.PN_LOCAL = 55;
n3Parser.PLX = 56;
n3Parser.PERCENT = 57;
n3Parser.HEX = 58;
n3Parser.PN_LOCAL_ESC = 59;

n3Parser.RULE_n3Doc = 0;
n3Parser.RULE_n3Statement = 1;
n3Parser.RULE_n3Directive = 2;
n3Parser.RULE_sparqlDirective = 3;
n3Parser.RULE_sparqlBase = 4;
n3Parser.RULE_sparqlPrefix = 5;
n3Parser.RULE_prefixID = 6;
n3Parser.RULE_base = 7;
n3Parser.RULE_triples = 8;
n3Parser.RULE_predicateObjectList = 9;
n3Parser.RULE_objectList = 10;
n3Parser.RULE_verb = 11;
n3Parser.RULE_subject = 12;
n3Parser.RULE_predicate = 13;
n3Parser.RULE_object = 14;
n3Parser.RULE_expression = 15;
n3Parser.RULE_path = 16;
n3Parser.RULE_pathItem = 17;
n3Parser.RULE_literal = 18;
n3Parser.RULE_blankNodePropertyList = 19;
n3Parser.RULE_collection = 20;
n3Parser.RULE_formula = 21;
n3Parser.RULE_formulaContent = 22;
n3Parser.RULE_numericLiteral = 23;
n3Parser.RULE_rdfLiteral = 24;
n3Parser.RULE_iri = 25;
n3Parser.RULE_iriList = 26;
n3Parser.RULE_prefixedName = 27;
n3Parser.RULE_blankNode = 28;
n3Parser.RULE_quickVar = 29;
n3Parser.RULE_existential = 30;
n3Parser.RULE_universal = 31;

function N3DocContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_n3Doc;
    return this;
}

N3DocContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
N3DocContext.prototype.constructor = N3DocContext;

N3DocContext.prototype.EOF = function() {
    return this.getToken(n3Parser.EOF, 0);
};

N3DocContext.prototype.n3Statement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(N3StatementContext);
    } else {
        return this.getTypedRuleContext(N3StatementContext,i);
    }
};

N3DocContext.prototype.sparqlDirective = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SparqlDirectiveContext);
    } else {
        return this.getTypedRuleContext(SparqlDirectiveContext,i);
    }
};

N3DocContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterN3Doc(this);
	}
};

N3DocContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitN3Doc(this);
	}
};

N3DocContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitN3Doc(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.N3DocContext = N3DocContext;

n3Parser.prototype.n3Doc = function() {

    var localctx = new N3DocContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, n3Parser.RULE_n3Doc);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 70;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__1) | (1 << n3Parser.T__2) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.T__25) | (1 << n3Parser.T__26) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)) | (1 << (n3Parser.BASE - 32)) | (1 << (n3Parser.PREFIX - 32)))) !== 0)) {
            this.state = 68;
            this._errHandler.sync(this);
            switch(this._input.LA(1)) {
            case n3Parser.T__1:
            case n3Parser.T__2:
            case n3Parser.T__18:
            case n3Parser.T__20:
            case n3Parser.T__22:
            case n3Parser.T__25:
            case n3Parser.T__26:
            case n3Parser.BooleanLiteral:
            case n3Parser.String:
            case n3Parser.IRIREF:
            case n3Parser.PNAME_NS:
            case n3Parser.PNAME_LN:
            case n3Parser.BLANK_NODE_LABEL:
            case n3Parser.INTEGER:
            case n3Parser.DECIMAL:
            case n3Parser.DOUBLE:
            case n3Parser.ANON:
            case n3Parser.QuickVarName:
                this.state = 64;
                this.n3Statement();
                this.state = 65;
                this.match(n3Parser.T__0);
                break;
            case n3Parser.BASE:
            case n3Parser.PREFIX:
                this.state = 67;
                this.sparqlDirective();
                break;
            default:
                throw new antlr4.error.NoViableAltException(this);
            }
            this.state = 72;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 73;
        this.match(n3Parser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function N3StatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_n3Statement;
    return this;
}

N3StatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
N3StatementContext.prototype.constructor = N3StatementContext;

N3StatementContext.prototype.n3Directive = function() {
    return this.getTypedRuleContext(N3DirectiveContext,0);
};

N3StatementContext.prototype.triples = function() {
    return this.getTypedRuleContext(TriplesContext,0);
};

N3StatementContext.prototype.existential = function() {
    return this.getTypedRuleContext(ExistentialContext,0);
};

N3StatementContext.prototype.universal = function() {
    return this.getTypedRuleContext(UniversalContext,0);
};

N3StatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterN3Statement(this);
	}
};

N3StatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitN3Statement(this);
	}
};

N3StatementContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitN3Statement(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.N3StatementContext = N3StatementContext;

n3Parser.prototype.n3Statement = function() {

    var localctx = new N3StatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, n3Parser.RULE_n3Statement);
    try {
        this.state = 79;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.T__1:
        case n3Parser.T__2:
            this.enterOuterAlt(localctx, 1);
            this.state = 75;
            this.n3Directive();
            break;
        case n3Parser.T__18:
        case n3Parser.T__20:
        case n3Parser.T__22:
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
        case n3Parser.ANON:
        case n3Parser.QuickVarName:
            this.enterOuterAlt(localctx, 2);
            this.state = 76;
            this.triples();
            break;
        case n3Parser.T__25:
            this.enterOuterAlt(localctx, 3);
            this.state = 77;
            this.existential();
            break;
        case n3Parser.T__26:
            this.enterOuterAlt(localctx, 4);
            this.state = 78;
            this.universal();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function N3DirectiveContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_n3Directive;
    return this;
}

N3DirectiveContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
N3DirectiveContext.prototype.constructor = N3DirectiveContext;

N3DirectiveContext.prototype.prefixID = function() {
    return this.getTypedRuleContext(PrefixIDContext,0);
};

N3DirectiveContext.prototype.base = function() {
    return this.getTypedRuleContext(BaseContext,0);
};

N3DirectiveContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterN3Directive(this);
	}
};

N3DirectiveContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitN3Directive(this);
	}
};

N3DirectiveContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitN3Directive(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.N3DirectiveContext = N3DirectiveContext;

n3Parser.prototype.n3Directive = function() {

    var localctx = new N3DirectiveContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, n3Parser.RULE_n3Directive);
    try {
        this.state = 83;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.T__1:
            this.enterOuterAlt(localctx, 1);
            this.state = 81;
            this.prefixID();
            break;
        case n3Parser.T__2:
            this.enterOuterAlt(localctx, 2);
            this.state = 82;
            this.base();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SparqlDirectiveContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_sparqlDirective;
    return this;
}

SparqlDirectiveContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SparqlDirectiveContext.prototype.constructor = SparqlDirectiveContext;

SparqlDirectiveContext.prototype.sparqlBase = function() {
    return this.getTypedRuleContext(SparqlBaseContext,0);
};

SparqlDirectiveContext.prototype.sparqlPrefix = function() {
    return this.getTypedRuleContext(SparqlPrefixContext,0);
};

SparqlDirectiveContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterSparqlDirective(this);
	}
};

SparqlDirectiveContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitSparqlDirective(this);
	}
};

SparqlDirectiveContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitSparqlDirective(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.SparqlDirectiveContext = SparqlDirectiveContext;

n3Parser.prototype.sparqlDirective = function() {

    var localctx = new SparqlDirectiveContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, n3Parser.RULE_sparqlDirective);
    try {
        this.state = 87;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.BASE:
            this.enterOuterAlt(localctx, 1);
            this.state = 85;
            this.sparqlBase();
            break;
        case n3Parser.PREFIX:
            this.enterOuterAlt(localctx, 2);
            this.state = 86;
            this.sparqlPrefix();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SparqlBaseContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_sparqlBase;
    return this;
}

SparqlBaseContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SparqlBaseContext.prototype.constructor = SparqlBaseContext;

SparqlBaseContext.prototype.BASE = function() {
    return this.getToken(n3Parser.BASE, 0);
};

SparqlBaseContext.prototype.IRIREF = function() {
    return this.getToken(n3Parser.IRIREF, 0);
};

SparqlBaseContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterSparqlBase(this);
	}
};

SparqlBaseContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitSparqlBase(this);
	}
};

SparqlBaseContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitSparqlBase(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.SparqlBaseContext = SparqlBaseContext;

n3Parser.prototype.sparqlBase = function() {

    var localctx = new SparqlBaseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, n3Parser.RULE_sparqlBase);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 89;
        this.match(n3Parser.BASE);
        this.state = 90;
        this.match(n3Parser.IRIREF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SparqlPrefixContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_sparqlPrefix;
    return this;
}

SparqlPrefixContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SparqlPrefixContext.prototype.constructor = SparqlPrefixContext;

SparqlPrefixContext.prototype.PREFIX = function() {
    return this.getToken(n3Parser.PREFIX, 0);
};

SparqlPrefixContext.prototype.PNAME_NS = function() {
    return this.getToken(n3Parser.PNAME_NS, 0);
};

SparqlPrefixContext.prototype.IRIREF = function() {
    return this.getToken(n3Parser.IRIREF, 0);
};

SparqlPrefixContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterSparqlPrefix(this);
	}
};

SparqlPrefixContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitSparqlPrefix(this);
	}
};

SparqlPrefixContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitSparqlPrefix(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.SparqlPrefixContext = SparqlPrefixContext;

n3Parser.prototype.sparqlPrefix = function() {

    var localctx = new SparqlPrefixContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, n3Parser.RULE_sparqlPrefix);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 92;
        this.match(n3Parser.PREFIX);
        this.state = 93;
        this.match(n3Parser.PNAME_NS);
        this.state = 94;
        this.match(n3Parser.IRIREF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PrefixIDContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_prefixID;
    return this;
}

PrefixIDContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrefixIDContext.prototype.constructor = PrefixIDContext;

PrefixIDContext.prototype.PNAME_NS = function() {
    return this.getToken(n3Parser.PNAME_NS, 0);
};

PrefixIDContext.prototype.IRIREF = function() {
    return this.getToken(n3Parser.IRIREF, 0);
};

PrefixIDContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPrefixID(this);
	}
};

PrefixIDContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPrefixID(this);
	}
};

PrefixIDContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPrefixID(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PrefixIDContext = PrefixIDContext;

n3Parser.prototype.prefixID = function() {

    var localctx = new PrefixIDContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, n3Parser.RULE_prefixID);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 96;
        this.match(n3Parser.T__1);
        this.state = 97;
        this.match(n3Parser.PNAME_NS);
        this.state = 98;
        this.match(n3Parser.IRIREF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BaseContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_base;
    return this;
}

BaseContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BaseContext.prototype.constructor = BaseContext;

BaseContext.prototype.IRIREF = function() {
    return this.getToken(n3Parser.IRIREF, 0);
};

BaseContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterBase(this);
	}
};

BaseContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitBase(this);
	}
};

BaseContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitBase(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.BaseContext = BaseContext;

n3Parser.prototype.base = function() {

    var localctx = new BaseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, n3Parser.RULE_base);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 100;
        this.match(n3Parser.T__2);
        this.state = 101;
        this.match(n3Parser.IRIREF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function TriplesContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_triples;
    return this;
}

TriplesContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TriplesContext.prototype.constructor = TriplesContext;

TriplesContext.prototype.subject = function() {
    return this.getTypedRuleContext(SubjectContext,0);
};

TriplesContext.prototype.blankNodePropertyList = function() {
    return this.getTypedRuleContext(BlankNodePropertyListContext,0);
};

TriplesContext.prototype.predicateObjectList = function() {
    return this.getTypedRuleContext(PredicateObjectListContext,0);
};

TriplesContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterTriples(this);
	}
};

TriplesContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitTriples(this);
	}
};

TriplesContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitTriples(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.TriplesContext = TriplesContext;

n3Parser.prototype.triples = function() {

    var localctx = new TriplesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, n3Parser.RULE_triples);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 105;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
        switch(la_) {
        case 1:
            this.state = 103;
            this.subject();
            break;

        case 2:
            this.state = 104;
            this.blankNodePropertyList();
            break;

        }
        this.state = 108;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__5) | (1 << n3Parser.T__6) | (1 << n3Parser.T__7) | (1 << n3Parser.T__8) | (1 << n3Parser.T__9) | (1 << n3Parser.T__11) | (1 << n3Parser.T__13) | (1 << n3Parser.T__14) | (1 << n3Parser.T__15) | (1 << n3Parser.T__16) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)))) !== 0)) {
            this.state = 107;
            this.predicateObjectList();
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PredicateObjectListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_predicateObjectList;
    return this;
}

PredicateObjectListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PredicateObjectListContext.prototype.constructor = PredicateObjectListContext;

PredicateObjectListContext.prototype.verb = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(VerbContext);
    } else {
        return this.getTypedRuleContext(VerbContext,i);
    }
};

PredicateObjectListContext.prototype.objectList = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ObjectListContext);
    } else {
        return this.getTypedRuleContext(ObjectListContext,i);
    }
};

PredicateObjectListContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPredicateObjectList(this);
	}
};

PredicateObjectListContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPredicateObjectList(this);
	}
};

PredicateObjectListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPredicateObjectList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PredicateObjectListContext = PredicateObjectListContext;

n3Parser.prototype.predicateObjectList = function() {

    var localctx = new PredicateObjectListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, n3Parser.RULE_predicateObjectList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 110;
        this.verb();
        this.state = 111;
        this.objectList();
        this.state = 120;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===n3Parser.T__3) {
            this.state = 112;
            this.match(n3Parser.T__3);
            this.state = 116;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__5) | (1 << n3Parser.T__6) | (1 << n3Parser.T__7) | (1 << n3Parser.T__8) | (1 << n3Parser.T__9) | (1 << n3Parser.T__11) | (1 << n3Parser.T__13) | (1 << n3Parser.T__14) | (1 << n3Parser.T__15) | (1 << n3Parser.T__16) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)))) !== 0)) {
                this.state = 113;
                this.verb();
                this.state = 114;
                this.objectList();
            }

            this.state = 122;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ObjectListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_objectList;
    return this;
}

ObjectListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ObjectListContext.prototype.constructor = ObjectListContext;

ObjectListContext.prototype.object = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ObjectContext);
    } else {
        return this.getTypedRuleContext(ObjectContext,i);
    }
};

ObjectListContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterObjectList(this);
	}
};

ObjectListContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitObjectList(this);
	}
};

ObjectListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitObjectList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.ObjectListContext = ObjectListContext;

n3Parser.prototype.objectList = function() {

    var localctx = new ObjectListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, n3Parser.RULE_objectList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 123;
        this.object();
        this.state = 128;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===n3Parser.T__4) {
            this.state = 124;
            this.match(n3Parser.T__4);
            this.state = 125;
            this.object();
            this.state = 130;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function VerbContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_verb;
    return this;
}

VerbContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VerbContext.prototype.constructor = VerbContext;

VerbContext.prototype.predicate = function() {
    return this.getTypedRuleContext(PredicateContext,0);
};

VerbContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

VerbContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterVerb(this);
	}
};

VerbContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitVerb(this);
	}
};

VerbContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitVerb(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.VerbContext = VerbContext;

n3Parser.prototype.verb = function() {

    var localctx = new VerbContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, n3Parser.RULE_verb);
    try {
        this.state = 149;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.T__16:
        case n3Parser.T__18:
        case n3Parser.T__20:
        case n3Parser.T__22:
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
        case n3Parser.ANON:
        case n3Parser.QuickVarName:
            this.enterOuterAlt(localctx, 1);
            this.state = 131;
            this.predicate();
            break;
        case n3Parser.T__5:
            this.enterOuterAlt(localctx, 2);
            this.state = 132;
            this.match(n3Parser.T__5);
            break;
        case n3Parser.T__6:
            this.enterOuterAlt(localctx, 3);
            this.state = 133;
            this.match(n3Parser.T__6);
            break;
        case n3Parser.T__7:
            this.enterOuterAlt(localctx, 4);
            this.state = 134;
            this.match(n3Parser.T__7);
            this.state = 135;
            this.expression();
            break;
        case n3Parser.T__8:
            this.enterOuterAlt(localctx, 5);
            this.state = 136;
            this.match(n3Parser.T__8);
            this.state = 137;
            this.expression();
            break;
        case n3Parser.T__9:
            this.enterOuterAlt(localctx, 6);
            this.state = 138;
            this.match(n3Parser.T__9);
            this.state = 139;
            this.expression();
            this.state = 140;
            this.match(n3Parser.T__10);
            break;
        case n3Parser.T__11:
            this.enterOuterAlt(localctx, 7);
            this.state = 142;
            this.match(n3Parser.T__11);
            this.state = 143;
            this.expression();
            this.state = 144;
            this.match(n3Parser.T__12);
            break;
        case n3Parser.T__13:
            this.enterOuterAlt(localctx, 8);
            this.state = 146;
            this.match(n3Parser.T__13);
            break;
        case n3Parser.T__14:
            this.enterOuterAlt(localctx, 9);
            this.state = 147;
            this.match(n3Parser.T__14);
            break;
        case n3Parser.T__15:
            this.enterOuterAlt(localctx, 10);
            this.state = 148;
            this.match(n3Parser.T__15);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SubjectContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_subject;
    return this;
}

SubjectContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SubjectContext.prototype.constructor = SubjectContext;

SubjectContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

SubjectContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterSubject(this);
	}
};

SubjectContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitSubject(this);
	}
};

SubjectContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitSubject(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.SubjectContext = SubjectContext;

n3Parser.prototype.subject = function() {

    var localctx = new SubjectContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, n3Parser.RULE_subject);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 151;
        this.expression();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PredicateContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_predicate;
    return this;
}

PredicateContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PredicateContext.prototype.constructor = PredicateContext;

PredicateContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

PredicateContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPredicate(this);
	}
};

PredicateContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPredicate(this);
	}
};

PredicateContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPredicate(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PredicateContext = PredicateContext;

n3Parser.prototype.predicate = function() {

    var localctx = new PredicateContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, n3Parser.RULE_predicate);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 156;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.T__18:
        case n3Parser.T__20:
        case n3Parser.T__22:
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
        case n3Parser.ANON:
        case n3Parser.QuickVarName:
            this.state = 153;
            this.expression();
            break;
        case n3Parser.T__16:
            this.state = 154;
            this.match(n3Parser.T__16);
            this.state = 155;
            this.expression();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ObjectContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_object;
    return this;
}

ObjectContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ObjectContext.prototype.constructor = ObjectContext;

ObjectContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

ObjectContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterObject(this);
	}
};

ObjectContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitObject(this);
	}
};

ObjectContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitObject(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.ObjectContext = ObjectContext;

n3Parser.prototype.object = function() {

    var localctx = new ObjectContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, n3Parser.RULE_object);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 158;
        this.expression();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_expression;
    return this;
}

ExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpressionContext.prototype.constructor = ExpressionContext;

ExpressionContext.prototype.path = function() {
    return this.getTypedRuleContext(PathContext,0);
};

ExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterExpression(this);
	}
};

ExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitExpression(this);
	}
};

ExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.ExpressionContext = ExpressionContext;

n3Parser.prototype.expression = function() {

    var localctx = new ExpressionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, n3Parser.RULE_expression);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 160;
        this.path();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PathContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_path;
    return this;
}

PathContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PathContext.prototype.constructor = PathContext;

PathContext.prototype.pathItem = function() {
    return this.getTypedRuleContext(PathItemContext,0);
};

PathContext.prototype.path = function() {
    return this.getTypedRuleContext(PathContext,0);
};

PathContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPath(this);
	}
};

PathContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPath(this);
	}
};

PathContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPath(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PathContext = PathContext;

n3Parser.prototype.path = function() {

    var localctx = new PathContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, n3Parser.RULE_path);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 162;
        this.pathItem();
        this.state = 167;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
        if(la_===1) {
            this.state = 163;
            this.match(n3Parser.T__17);
            this.state = 164;
            this.path();

        } else if(la_===2) {
            this.state = 165;
            this.match(n3Parser.T__16);
            this.state = 166;
            this.path();

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PathItemContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_pathItem;
    return this;
}

PathItemContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PathItemContext.prototype.constructor = PathItemContext;

PathItemContext.prototype.iri = function() {
    return this.getTypedRuleContext(IriContext,0);
};

PathItemContext.prototype.blankNode = function() {
    return this.getTypedRuleContext(BlankNodeContext,0);
};

PathItemContext.prototype.quickVar = function() {
    return this.getTypedRuleContext(QuickVarContext,0);
};

PathItemContext.prototype.collection = function() {
    return this.getTypedRuleContext(CollectionContext,0);
};

PathItemContext.prototype.blankNodePropertyList = function() {
    return this.getTypedRuleContext(BlankNodePropertyListContext,0);
};

PathItemContext.prototype.literal = function() {
    return this.getTypedRuleContext(LiteralContext,0);
};

PathItemContext.prototype.formula = function() {
    return this.getTypedRuleContext(FormulaContext,0);
};

PathItemContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPathItem(this);
	}
};

PathItemContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPathItem(this);
	}
};

PathItemContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPathItem(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PathItemContext = PathItemContext;

n3Parser.prototype.pathItem = function() {

    var localctx = new PathItemContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, n3Parser.RULE_pathItem);
    try {
        this.state = 176;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
            this.enterOuterAlt(localctx, 1);
            this.state = 169;
            this.iri();
            break;
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.ANON:
            this.enterOuterAlt(localctx, 2);
            this.state = 170;
            this.blankNode();
            break;
        case n3Parser.QuickVarName:
            this.enterOuterAlt(localctx, 3);
            this.state = 171;
            this.quickVar();
            break;
        case n3Parser.T__20:
            this.enterOuterAlt(localctx, 4);
            this.state = 172;
            this.collection();
            break;
        case n3Parser.T__18:
            this.enterOuterAlt(localctx, 5);
            this.state = 173;
            this.blankNodePropertyList();
            break;
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
            this.enterOuterAlt(localctx, 6);
            this.state = 174;
            this.literal();
            break;
        case n3Parser.T__22:
            this.enterOuterAlt(localctx, 7);
            this.state = 175;
            this.formula();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function LiteralContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_literal;
    return this;
}

LiteralContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LiteralContext.prototype.constructor = LiteralContext;

LiteralContext.prototype.rdfLiteral = function() {
    return this.getTypedRuleContext(RdfLiteralContext,0);
};

LiteralContext.prototype.numericLiteral = function() {
    return this.getTypedRuleContext(NumericLiteralContext,0);
};

LiteralContext.prototype.BooleanLiteral = function() {
    return this.getToken(n3Parser.BooleanLiteral, 0);
};

LiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterLiteral(this);
	}
};

LiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitLiteral(this);
	}
};

LiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.LiteralContext = LiteralContext;

n3Parser.prototype.literal = function() {

    var localctx = new LiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, n3Parser.RULE_literal);
    try {
        this.state = 181;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.String:
            this.enterOuterAlt(localctx, 1);
            this.state = 178;
            this.rdfLiteral();
            break;
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
            this.enterOuterAlt(localctx, 2);
            this.state = 179;
            this.numericLiteral();
            break;
        case n3Parser.BooleanLiteral:
            this.enterOuterAlt(localctx, 3);
            this.state = 180;
            this.match(n3Parser.BooleanLiteral);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BlankNodePropertyListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_blankNodePropertyList;
    return this;
}

BlankNodePropertyListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BlankNodePropertyListContext.prototype.constructor = BlankNodePropertyListContext;

BlankNodePropertyListContext.prototype.predicateObjectList = function() {
    return this.getTypedRuleContext(PredicateObjectListContext,0);
};

BlankNodePropertyListContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterBlankNodePropertyList(this);
	}
};

BlankNodePropertyListContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitBlankNodePropertyList(this);
	}
};

BlankNodePropertyListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitBlankNodePropertyList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.BlankNodePropertyListContext = BlankNodePropertyListContext;

n3Parser.prototype.blankNodePropertyList = function() {

    var localctx = new BlankNodePropertyListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, n3Parser.RULE_blankNodePropertyList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 183;
        this.match(n3Parser.T__18);
        this.state = 185;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__5) | (1 << n3Parser.T__6) | (1 << n3Parser.T__7) | (1 << n3Parser.T__8) | (1 << n3Parser.T__9) | (1 << n3Parser.T__11) | (1 << n3Parser.T__13) | (1 << n3Parser.T__14) | (1 << n3Parser.T__15) | (1 << n3Parser.T__16) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)))) !== 0)) {
            this.state = 184;
            this.predicateObjectList();
        }

        this.state = 187;
        this.match(n3Parser.T__19);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function CollectionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_collection;
    return this;
}

CollectionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CollectionContext.prototype.constructor = CollectionContext;

CollectionContext.prototype.object = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ObjectContext);
    } else {
        return this.getTypedRuleContext(ObjectContext,i);
    }
};

CollectionContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterCollection(this);
	}
};

CollectionContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitCollection(this);
	}
};

CollectionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitCollection(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.CollectionContext = CollectionContext;

n3Parser.prototype.collection = function() {

    var localctx = new CollectionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, n3Parser.RULE_collection);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 189;
        this.match(n3Parser.T__20);
        this.state = 193;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(((((_la - 19)) & ~0x1f) == 0 && ((1 << (_la - 19)) & ((1 << (n3Parser.T__18 - 19)) | (1 << (n3Parser.T__20 - 19)) | (1 << (n3Parser.T__22 - 19)) | (1 << (n3Parser.BooleanLiteral - 19)) | (1 << (n3Parser.String - 19)) | (1 << (n3Parser.IRIREF - 19)) | (1 << (n3Parser.PNAME_NS - 19)) | (1 << (n3Parser.PNAME_LN - 19)) | (1 << (n3Parser.BLANK_NODE_LABEL - 19)) | (1 << (n3Parser.INTEGER - 19)) | (1 << (n3Parser.DECIMAL - 19)) | (1 << (n3Parser.DOUBLE - 19)) | (1 << (n3Parser.ANON - 19)) | (1 << (n3Parser.QuickVarName - 19)))) !== 0)) {
            this.state = 190;
            this.object();
            this.state = 195;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 196;
        this.match(n3Parser.T__21);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function FormulaContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_formula;
    return this;
}

FormulaContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FormulaContext.prototype.constructor = FormulaContext;

FormulaContext.prototype.formulaContent = function() {
    return this.getTypedRuleContext(FormulaContentContext,0);
};

FormulaContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterFormula(this);
	}
};

FormulaContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitFormula(this);
	}
};

FormulaContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitFormula(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.FormulaContext = FormulaContext;

n3Parser.prototype.formula = function() {

    var localctx = new FormulaContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, n3Parser.RULE_formula);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 198;
        this.match(n3Parser.T__22);
        this.state = 200;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__1) | (1 << n3Parser.T__2) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.T__25) | (1 << n3Parser.T__26) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)) | (1 << (n3Parser.BASE - 32)) | (1 << (n3Parser.PREFIX - 32)))) !== 0)) {
            this.state = 199;
            this.formulaContent();
        }

        this.state = 202;
        this.match(n3Parser.T__23);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function FormulaContentContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_formulaContent;
    return this;
}

FormulaContentContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FormulaContentContext.prototype.constructor = FormulaContentContext;

FormulaContentContext.prototype.n3Statement = function() {
    return this.getTypedRuleContext(N3StatementContext,0);
};

FormulaContentContext.prototype.formulaContent = function() {
    return this.getTypedRuleContext(FormulaContentContext,0);
};

FormulaContentContext.prototype.sparqlDirective = function() {
    return this.getTypedRuleContext(SparqlDirectiveContext,0);
};

FormulaContentContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterFormulaContent(this);
	}
};

FormulaContentContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitFormulaContent(this);
	}
};

FormulaContentContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitFormulaContent(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.FormulaContentContext = FormulaContentContext;

n3Parser.prototype.formulaContent = function() {

    var localctx = new FormulaContentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, n3Parser.RULE_formulaContent);
    var _la = 0; // Token type
    try {
        this.state = 215;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.T__1:
        case n3Parser.T__2:
        case n3Parser.T__18:
        case n3Parser.T__20:
        case n3Parser.T__22:
        case n3Parser.T__25:
        case n3Parser.T__26:
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
        case n3Parser.ANON:
        case n3Parser.QuickVarName:
            this.enterOuterAlt(localctx, 1);
            this.state = 204;
            this.n3Statement();
            this.state = 209;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if(_la===n3Parser.T__0) {
                this.state = 205;
                this.match(n3Parser.T__0);
                this.state = 207;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__1) | (1 << n3Parser.T__2) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.T__25) | (1 << n3Parser.T__26) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)) | (1 << (n3Parser.BASE - 32)) | (1 << (n3Parser.PREFIX - 32)))) !== 0)) {
                    this.state = 206;
                    this.formulaContent();
                }

            }

            break;
        case n3Parser.BASE:
        case n3Parser.PREFIX:
            this.enterOuterAlt(localctx, 2);
            this.state = 211;
            this.sparqlDirective();
            this.state = 213;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << n3Parser.T__1) | (1 << n3Parser.T__2) | (1 << n3Parser.T__18) | (1 << n3Parser.T__20) | (1 << n3Parser.T__22) | (1 << n3Parser.T__25) | (1 << n3Parser.T__26) | (1 << n3Parser.BooleanLiteral) | (1 << n3Parser.String) | (1 << n3Parser.IRIREF))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (n3Parser.PNAME_NS - 32)) | (1 << (n3Parser.PNAME_LN - 32)) | (1 << (n3Parser.BLANK_NODE_LABEL - 32)) | (1 << (n3Parser.INTEGER - 32)) | (1 << (n3Parser.DECIMAL - 32)) | (1 << (n3Parser.DOUBLE - 32)) | (1 << (n3Parser.ANON - 32)) | (1 << (n3Parser.QuickVarName - 32)) | (1 << (n3Parser.BASE - 32)) | (1 << (n3Parser.PREFIX - 32)))) !== 0)) {
                this.state = 212;
                this.formulaContent();
            }

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function NumericLiteralContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_numericLiteral;
    return this;
}

NumericLiteralContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
NumericLiteralContext.prototype.constructor = NumericLiteralContext;

NumericLiteralContext.prototype.INTEGER = function() {
    return this.getToken(n3Parser.INTEGER, 0);
};

NumericLiteralContext.prototype.DECIMAL = function() {
    return this.getToken(n3Parser.DECIMAL, 0);
};

NumericLiteralContext.prototype.DOUBLE = function() {
    return this.getToken(n3Parser.DOUBLE, 0);
};

NumericLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterNumericLiteral(this);
	}
};

NumericLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitNumericLiteral(this);
	}
};

NumericLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitNumericLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.NumericLiteralContext = NumericLiteralContext;

n3Parser.prototype.numericLiteral = function() {

    var localctx = new NumericLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, n3Parser.RULE_numericLiteral);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 217;
        _la = this._input.LA(1);
        if(!(((((_la - 36)) & ~0x1f) == 0 && ((1 << (_la - 36)) & ((1 << (n3Parser.INTEGER - 36)) | (1 << (n3Parser.DECIMAL - 36)) | (1 << (n3Parser.DOUBLE - 36)))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function RdfLiteralContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_rdfLiteral;
    return this;
}

RdfLiteralContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RdfLiteralContext.prototype.constructor = RdfLiteralContext;

RdfLiteralContext.prototype.String = function() {
    return this.getToken(n3Parser.String, 0);
};

RdfLiteralContext.prototype.LANGTAG = function() {
    return this.getToken(n3Parser.LANGTAG, 0);
};

RdfLiteralContext.prototype.iri = function() {
    return this.getTypedRuleContext(IriContext,0);
};

RdfLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterRdfLiteral(this);
	}
};

RdfLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitRdfLiteral(this);
	}
};

RdfLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitRdfLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.RdfLiteralContext = RdfLiteralContext;

n3Parser.prototype.rdfLiteral = function() {

    var localctx = new RdfLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, n3Parser.RULE_rdfLiteral);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 219;
        this.match(n3Parser.String);
        this.state = 223;
        this._errHandler.sync(this);
        switch (this._input.LA(1)) {
        case n3Parser.LANGTAG:
        	this.state = 220;
        	this.match(n3Parser.LANGTAG);
        	break;
        case n3Parser.T__24:
        	this.state = 221;
        	this.match(n3Parser.T__24);
        	this.state = 222;
        	this.iri();
        	break;
        case n3Parser.T__0:
        case n3Parser.T__3:
        case n3Parser.T__4:
        case n3Parser.T__5:
        case n3Parser.T__6:
        case n3Parser.T__7:
        case n3Parser.T__8:
        case n3Parser.T__9:
        case n3Parser.T__10:
        case n3Parser.T__11:
        case n3Parser.T__12:
        case n3Parser.T__13:
        case n3Parser.T__14:
        case n3Parser.T__15:
        case n3Parser.T__16:
        case n3Parser.T__17:
        case n3Parser.T__18:
        case n3Parser.T__19:
        case n3Parser.T__20:
        case n3Parser.T__21:
        case n3Parser.T__22:
        case n3Parser.T__23:
        case n3Parser.BooleanLiteral:
        case n3Parser.String:
        case n3Parser.IRIREF:
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
        case n3Parser.BLANK_NODE_LABEL:
        case n3Parser.INTEGER:
        case n3Parser.DECIMAL:
        case n3Parser.DOUBLE:
        case n3Parser.ANON:
        case n3Parser.QuickVarName:
        	break;
        default:
        	throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function IriContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_iri;
    return this;
}

IriContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
IriContext.prototype.constructor = IriContext;

IriContext.prototype.IRIREF = function() {
    return this.getToken(n3Parser.IRIREF, 0);
};

IriContext.prototype.prefixedName = function() {
    return this.getTypedRuleContext(PrefixedNameContext,0);
};

IriContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterIri(this);
	}
};

IriContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitIri(this);
	}
};

IriContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitIri(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.IriContext = IriContext;

n3Parser.prototype.iri = function() {

    var localctx = new IriContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, n3Parser.RULE_iri);
    try {
        this.state = 227;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case n3Parser.IRIREF:
            this.enterOuterAlt(localctx, 1);
            this.state = 225;
            this.match(n3Parser.IRIREF);
            break;
        case n3Parser.PNAME_NS:
        case n3Parser.PNAME_LN:
            this.enterOuterAlt(localctx, 2);
            this.state = 226;
            this.prefixedName();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function IriListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_iriList;
    return this;
}

IriListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
IriListContext.prototype.constructor = IriListContext;

IriListContext.prototype.iri = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(IriContext);
    } else {
        return this.getTypedRuleContext(IriContext,i);
    }
};

IriListContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterIriList(this);
	}
};

IriListContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitIriList(this);
	}
};

IriListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitIriList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.IriListContext = IriListContext;

n3Parser.prototype.iriList = function() {

    var localctx = new IriListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, n3Parser.RULE_iriList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 229;
        this.iri();
        this.state = 234;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===n3Parser.T__4) {
            this.state = 230;
            this.match(n3Parser.T__4);
            this.state = 231;
            this.iri();
            this.state = 236;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PrefixedNameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_prefixedName;
    return this;
}

PrefixedNameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrefixedNameContext.prototype.constructor = PrefixedNameContext;

PrefixedNameContext.prototype.PNAME_NS = function() {
    return this.getToken(n3Parser.PNAME_NS, 0);
};

PrefixedNameContext.prototype.PNAME_LN = function() {
    return this.getToken(n3Parser.PNAME_LN, 0);
};

PrefixedNameContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterPrefixedName(this);
	}
};

PrefixedNameContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitPrefixedName(this);
	}
};

PrefixedNameContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitPrefixedName(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.PrefixedNameContext = PrefixedNameContext;

n3Parser.prototype.prefixedName = function() {

    var localctx = new PrefixedNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, n3Parser.RULE_prefixedName);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 237;
        _la = this._input.LA(1);
        if(!(_la===n3Parser.PNAME_NS || _la===n3Parser.PNAME_LN)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BlankNodeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_blankNode;
    return this;
}

BlankNodeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BlankNodeContext.prototype.constructor = BlankNodeContext;

BlankNodeContext.prototype.BLANK_NODE_LABEL = function() {
    return this.getToken(n3Parser.BLANK_NODE_LABEL, 0);
};

BlankNodeContext.prototype.ANON = function() {
    return this.getToken(n3Parser.ANON, 0);
};

BlankNodeContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterBlankNode(this);
	}
};

BlankNodeContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitBlankNode(this);
	}
};

BlankNodeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitBlankNode(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.BlankNodeContext = BlankNodeContext;

n3Parser.prototype.blankNode = function() {

    var localctx = new BlankNodeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 56, n3Parser.RULE_blankNode);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 239;
        _la = this._input.LA(1);
        if(!(_la===n3Parser.BLANK_NODE_LABEL || _la===n3Parser.ANON)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function QuickVarContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_quickVar;
    return this;
}

QuickVarContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
QuickVarContext.prototype.constructor = QuickVarContext;

QuickVarContext.prototype.QuickVarName = function() {
    return this.getToken(n3Parser.QuickVarName, 0);
};

QuickVarContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterQuickVar(this);
	}
};

QuickVarContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitQuickVar(this);
	}
};

QuickVarContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitQuickVar(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.QuickVarContext = QuickVarContext;

n3Parser.prototype.quickVar = function() {

    var localctx = new QuickVarContext(this, this._ctx, this.state);
    this.enterRule(localctx, 58, n3Parser.RULE_quickVar);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 241;
        this.match(n3Parser.QuickVarName);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ExistentialContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_existential;
    return this;
}

ExistentialContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExistentialContext.prototype.constructor = ExistentialContext;

ExistentialContext.prototype.iriList = function() {
    return this.getTypedRuleContext(IriListContext,0);
};

ExistentialContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterExistential(this);
	}
};

ExistentialContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitExistential(this);
	}
};

ExistentialContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitExistential(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.ExistentialContext = ExistentialContext;

n3Parser.prototype.existential = function() {

    var localctx = new ExistentialContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, n3Parser.RULE_existential);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 243;
        this.match(n3Parser.T__25);
        this.state = 244;
        this.iriList();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function UniversalContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = n3Parser.RULE_universal;
    return this;
}

UniversalContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
UniversalContext.prototype.constructor = UniversalContext;

UniversalContext.prototype.iriList = function() {
    return this.getTypedRuleContext(IriListContext,0);
};

UniversalContext.prototype.enterRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.enterUniversal(this);
	}
};

UniversalContext.prototype.exitRule = function(listener) {
    if(listener instanceof n3Listener ) {
        listener.exitUniversal(this);
	}
};

UniversalContext.prototype.accept = function(visitor) {
    if ( visitor instanceof n3Visitor ) {
        return visitor.visitUniversal(this);
    } else {
        return visitor.visitChildren(this);
    }
};




n3Parser.UniversalContext = UniversalContext;

n3Parser.prototype.universal = function() {

    var localctx = new UniversalContext(this, this._ctx, this.state);
    this.enterRule(localctx, 62, n3Parser.RULE_universal);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 246;
        this.match(n3Parser.T__26);
        this.state = 247;
        this.iriList();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.n3Parser = n3Parser;
