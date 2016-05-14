/* Generated By:JJTree&JavaCC: Do not edit this line. GqdslParser.java */

import java.io.FileInputStream;
import java.util.*;

public class GqdslParser/*@bgen(jjtree)*/ implements GqdslParserTreeConstants, GqdslParserConstants {/*@bgen(jjtree)*/
    protected static JJTGqdslParserState jjtree = new JJTGqdslParserState();
    private static List<HashMap<String, String>> symbolTables = new LinkedList<>();
    private static Map<String, String> lastQueryTable;
    private static String lastRelation;

    public static void main(String args[]) {
        String fileName = "Testes";
        try {
            new GqdslParser(new FileInputStream(fileName));

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        try {
            SimpleNode n = GqdslParser.Start();
            n.dump("");
            System.out.println("File \"" + fileName + "\" is according to grammar.");
        } catch (Exception e) {
            System.out.println("Oops.");
            System.out.println(e.getMessage());
        }
    }

    static final public SimpleNode Start() throws ParseException {
 /*@bgen(jjtree) Start */
        SimpleNode jjtn000 = new SimpleNode(JJTSTART);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            label_1:
            while (true) {
                switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                    case QUERY_START:
                        ;
                        break;
                    default:
                        jj_la1[0] = jj_gen;
                        break label_1;
                }
                Query();
            }
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true) throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true) throw (ParseException) jjte000;
                }
            }
            {
                if (true) throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    /*
    SimpleNode JavaCode() :
    {Token t;}
    {
          {
            jjtThis.value = "";
          }
        (
            t = < JAVA_LINE >
              {
                jjtThis.value += t.image;
              }
        )+
        {
            return jjtThis;
        }
    }
    */
    static final public SimpleNode Query() throws ParseException {
 /*@bgen(jjtree) Query */
        SimpleNode jjtn000 = new SimpleNode(JJTQUERY);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            symbolTables.add(new HashMap<>());
            lastQueryTable = symbolTables.get(symbolTables.size() - 1);
            QueryHeader();
            QueryExpr();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true) throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true) throw (ParseException) jjte000;
                }
            }
            {
                if (true) throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public void QueryHeader() throws ParseException {
        jj_consume_token(QUERY_START);
        jj_consume_token(OPEN1);
        Graph();
        jj_consume_token(COMMA);
        Return();
        jj_consume_token(CLOSE1);
        jj_consume_token(COLON);
    }

    static final public SimpleNode Graph() throws ParseException {
 /*@bgen(jjtree) Graph */
        SimpleNode jjtn000 = new SimpleNode(JJTGRAPH);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            t = jj_consume_token(JAVA_VAR);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.value = t.image;
            {
                if (true) return jjtn000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode Return() throws ParseException {
 /*@bgen(jjtree) Return */
        SimpleNode jjtn000 = new SimpleNode(JJTRETURN);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            t = jj_consume_token(JAVA_VAR);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.value = t.image;
            {
                if (true) return jjtn000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode QueryExpr() throws ParseException {
 /*@bgen(jjtree) QueryExpr */
        SimpleNode jjtn000 = new SimpleNode(JJTQUERYEXPR);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            QuerySelect();
            QueryWhere();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true) throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true) throw (ParseException) jjte000;
                }
            }
            {
                if (true) throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode QuerySelect() throws ParseException {
 /*@bgen(jjtree) QuerySelect */
        SimpleNode jjtn000 = new SimpleNode(JJTQUERYSELECT);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            jjtn000.value = "";
            jj_consume_token(SELECT);
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case ALL:
                    jj_consume_token(ALL);
                    jjtn000.value = "*";
                    break;
                case QUERY_VAR:
                    label_2:
                    while (true) {
                        t = jj_consume_token(QUERY_VAR);
                        jjtn000.value += t.image + " ";
                        lastQueryTable.put(t.image, "undefined");
                        switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                            case QUERY_VAR:
                                ;
                                break;
                            default:
                                jj_la1[1] = jj_gen;
                                break label_2;
                        }
                    }
                    break;
                default:
                    jj_la1[2] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode QueryWhere() throws ParseException {
 /*@bgen(jjtree) QueryWhere */
        SimpleNode jjtn000 = new SimpleNode(JJTQUERYWHERE);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            jj_consume_token(WHERE);
            jj_consume_token(OPEN2);
            WhereExpr();
            label_3:
            while (true) {
                switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                    case DOT:
                        ;
                        break;
                    default:
                        jj_la1[3] = jj_gen;
                        break label_3;
                }
                jj_consume_token(DOT);
                WhereExpr();
            }
            jj_consume_token(CLOSE2);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true) throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true) throw (ParseException) jjte000;
                }
            }
            {
                if (true) throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode WhereExpr() throws ParseException {
 /*@bgen(jjtree) WhereExpr */
        SimpleNode jjtn000 = new SimpleNode(JJTWHEREEXPR);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            RelationSubject();
            Relation();
            RelationValue();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if (true) return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true) throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true) throw (ParseException) jjte000;
                }
            }
            {
                if (true) throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode RelationSubject() throws ParseException {
 /*@bgen(jjtree) RelationSubject */
        SimpleNode jjtn000 = new SimpleNode(JJTRELATIONSUBJECT);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            t = jj_consume_token(QUERY_VAR);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.value = t.image;
            String type = lastQueryTable.get(t.image);
            if (Objects.equals(type, "value"))
                throw new Error("Value cannot be used as left hand operand");
            if (type == null)
                lastQueryTable.put(t.image, "vertex");
            else if (Objects.equals(type, "undefined"))
                lastQueryTable.replace(t.image, "vertex");
            if (true) return jjtn000;
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode Relation() throws ParseException {
 /*@bgen(jjtree) Relation */
        SimpleNode jjtn000 = new SimpleNode(JJTRELATION);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t1, t2;
        try {
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case EDGE:
                    lastRelation = "edge";
                    t1 = jj_consume_token(EDGE);
                    break;
                case PROPERTY:
                    lastRelation = "property";
                    t1 = jj_consume_token(PROPERTY);
                    break;
                case PROPERTY_VALUE:
                    lastRelation = "property_value";
                    t1 = jj_consume_token(PROPERTY_VALUE);
                    break;
                default:
                    jj_la1[4] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
            t2 = jj_consume_token(IDENTIFIER);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.value = t1.image + t2.image;
            {
                if (true) return jjtn000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static final public SimpleNode RelationValue() throws ParseException {
 /*@bgen(jjtree) RelationValue */
        SimpleNode jjtn000 = new SimpleNode(JJTRELATIONVALUE);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case QUERY_VAR:
                    t = jj_consume_token(QUERY_VAR);
                    String type = lastQueryTable.get(t.image);
                    if (Objects.equals(lastRelation, "property_value")) {
                        if (type == null)
                            lastQueryTable.put(t.image, "value");
                        else if (Objects.equals(type, "undefined"))
                            lastQueryTable.replace(t.image, "value");
                        else if (Objects.equals(type, "value"))
                            throw new Error("Value of variable " + t.image + " cannot be redefined");
                        else throw new Error("Variable " + t.image + " has type " + type + " and is being used as value");
                    }
                    else if (Objects.equals(lastRelation, "property")) {
                        if (type == null)
                            lastQueryTable.put(t.image, "property");
                        else if (Objects.equals(type, "undefined"))
                            lastQueryTable.replace(t.image, "property");
                        else if (Objects.equals(type, "property"))
                            throw new Error("Value of variable " + t.image + " cannot be redefined");
                        else throw new Error("Variable " + t.image + " has type " + type + " and is being used as property");
                    }
                    else if (Objects.equals(lastRelation, "edge")) {
                        if (type == null)
                            lastQueryTable.put(t.image, "vertex");
                        else if (Objects.equals(type, "undefined"))
                            lastQueryTable.replace(t.image, "vertex");
                        else if (!Objects.equals(type, "vertex"))
                            throw new Error("Variable " + t.image + " has type " + type + " and is being used as vertex");
                    }
                    break;
                case CONSTANT_VALUE:
                    t = jj_consume_token(CONSTANT_VALUE);
                    if (!Objects.equals(lastRelation, "property_value"))
                        throw new Error("Constants can only be used as properties of vertices");
                    break;
                default:
                    jj_la1[5] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.value = t.image;
            {
                if (true) return jjtn000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    static private boolean jj_initialized_once = false;
    /**
     * Generated Token Manager.
     */
    static public GqdslParserTokenManager token_source;
    static SimpleCharStream jj_input_stream;
    /**
     * Current token.
     */
    static public Token token;
    /**
     * Next token.
     */
    static public Token jj_nt;
    static private int jj_ntk;
    static private int jj_gen;
    static final private int[] jj_la1 = new int[6];
    static private int[] jj_la1_0;

    static {
        jj_la1_init_0();
    }

    private static void jj_la1_init_0() {
        jj_la1_0 = new int[]{0x2, 0x4000000, 0x4400000, 0x1000000, 0x1c0000, 0x4000200,};
    }

    /**
     * Constructor with InputStream.
     */
    public GqdslParser(java.io.InputStream stream) {
        this(stream, null);
    }

    /**
     * Constructor with InputStream and supplied encoding
     */
    public GqdslParser(java.io.InputStream stream, String encoding) {
        if (jj_initialized_once) {
            System.out.println("ERROR: Second call to constructor of static parser.  ");
            System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
            System.out.println("       during parser generation.");
            throw new Error();
        }
        jj_initialized_once = true;
        try {
            jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source = new GqdslParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    /**
     * Reinitialise.
     */
    static public void ReInit(java.io.InputStream stream) {
        ReInit(stream, null);
    }

    /**
     * Reinitialise.
     */
    static public void ReInit(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream.ReInit(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    /**
     * Constructor.
     */
    public GqdslParser(java.io.Reader stream) {
        if (jj_initialized_once) {
            System.out.println("ERROR: Second call to constructor of static parser. ");
            System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
            System.out.println("       during parser generation.");
            throw new Error();
        }
        jj_initialized_once = true;
        jj_input_stream = new SimpleCharStream(stream, 1, 1);
        token_source = new GqdslParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    /**
     * Reinitialise.
     */
    static public void ReInit(java.io.Reader stream) {
        jj_input_stream.ReInit(stream, 1, 1);
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    /**
     * Constructor with generated Token Manager.
     */
    public GqdslParser(GqdslParserTokenManager tm) {
        if (jj_initialized_once) {
            System.out.println("ERROR: Second call to constructor of static parser. ");
            System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
            System.out.println("       during parser generation.");
            throw new Error();
        }
        jj_initialized_once = true;
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    /**
     * Reinitialise.
     */
    public void ReInit(GqdslParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 6; i++) jj_la1[i] = -1;
    }

    static private Token jj_consume_token(int kind) throws ParseException {
        Token oldToken;
        if ((oldToken = token).next != null) token = token.next;
        else token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        if (token.kind == kind) {
            jj_gen++;
            return token;
        }
        token = oldToken;
        jj_kind = kind;
        throw generateParseException();
    }


    /**
     * Get the next Token.
     */
    static final public Token getNextToken() {
        if (token.next != null) token = token.next;
        else token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        jj_gen++;
        return token;
    }

    /**
     * Get the specific Token.
     */
    static final public Token getToken(int index) {
        Token t = token;
        for (int i = 0; i < index; i++) {
            if (t.next != null) t = t.next;
            else t = t.next = token_source.getNextToken();
        }
        return t;
    }

    static private int jj_ntk() {
        if ((jj_nt = token.next) == null)
            return (jj_ntk = (token.next = token_source.getNextToken()).kind);
        else
            return (jj_ntk = jj_nt.kind);
    }

    static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
    static private int[] jj_expentry;
    static private int jj_kind = -1;

    /**
     * Generate ParseException.
     */
    static public ParseException generateParseException() {
        jj_expentries.clear();
        boolean[] la1tokens = new boolean[31];
        if (jj_kind >= 0) {
            la1tokens[jj_kind] = true;
            jj_kind = -1;
        }
        for (int i = 0; i < 6; i++) {
            if (jj_la1[i] == jj_gen) {
                for (int j = 0; j < 32; j++) {
                    if ((jj_la1_0[i] & (1 << j)) != 0) {
                        la1tokens[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < 31; i++) {
            if (la1tokens[i]) {
                jj_expentry = new int[1];
                jj_expentry[0] = i;
                jj_expentries.add(jj_expentry);
            }
        }
        int[][] exptokseq = new int[jj_expentries.size()][];
        for (int i = 0; i < jj_expentries.size(); i++) {
            exptokseq[i] = jj_expentries.get(i);
        }
        return new ParseException(token, exptokseq, tokenImage);
    }

    /**
     * Enable tracing.
     */
    static final public void enable_tracing() {
    }

    /**
     * Disable tracing.
     */
    static final public void disable_tracing() {
    }

}
