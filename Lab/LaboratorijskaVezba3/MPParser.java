
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Dec 17 02:10:55 CET 2021
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Fri Dec 17 02:10:55 CET 2021
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\003\005\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\002\000\002\006\006" +
    "\000\002\007\005\000\002\007\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\011\003\000\002\011\004\000\002\012\003\000\002\012" +
    "\006\000\002\012\003\000\002\013\006\000\002\014\004" +
    "\000\002\014\003\000\002\015\006\000\002\016\005\000" +
    "\002\016\003\000\002\017\005\000\002\017\003\000\002" +
    "\020\005\000\002\020\003\000\002\021\003\000\002\021" +
    "\003\000\002\021\003\000\002\021\003\000\002\021\003" +
    "\000\002\021\003\000\002\022\003\000\002\022\003\000" +
    "\002\022\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\004\005\001\002\000\004\002\076\001" +
    "\002\000\004\006\007\001\002\000\004\005\075\001\002" +
    "\000\010\006\ufffd\013\ufffd\021\ufffd\001\002\000\010\006" +
    "\007\013\017\021\020\001\002\000\006\010\065\012\064" +
    "\001\002\000\014\006\ufff1\007\ufff1\013\ufff1\021\ufff1\022" +
    "\ufff1\001\002\000\012\006\007\007\063\013\045\021\020" +
    "\001\002\000\014\006\ufff3\007\ufff3\013\ufff3\021\ufff3\022" +
    "\ufff3\001\002\000\010\006\ufffe\013\ufffe\021\ufffe\001\002" +
    "\000\012\006\ufff5\007\ufff5\013\ufff5\021\ufff5\001\002\000" +
    "\010\010\ufffa\012\ufffa\020\047\001\002\000\004\006\021" +
    "\001\002\000\004\022\023\001\002\000\006\007\uffee\022" +
    "\uffee\001\002\000\010\013\030\034\031\035\035\001\002" +
    "\000\006\007\026\022\023\001\002\000\006\007\uffef\022" +
    "\uffef\001\002\000\014\006\ufff0\007\ufff0\013\ufff0\021\ufff0" +
    "\022\ufff0\001\002\000\014\011\uffe9\023\uffe9\024\uffe9\025" +
    "\uffe9\036\uffe9\001\002\000\030\011\uffe0\023\uffe0\024\uffe0" +
    "\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0\032\uffe0\033" +
    "\uffe0\036\uffe0\001\002\000\030\011\uffdf\023\uffdf\024\uffdf" +
    "\025\uffdf\026\uffdf\027\uffdf\030\uffdf\031\uffdf\032\uffdf\033" +
    "\uffdf\036\uffdf\001\002\000\030\011\uffe7\023\uffe7\024\uffe7" +
    "\025\uffe7\026\054\027\056\030\053\031\060\032\055\033" +
    "\057\036\uffe7\001\002\000\006\023\044\024\040\001\002" +
    "\000\014\011\uffeb\023\uffeb\024\uffeb\025\042\036\uffeb\001" +
    "\002\000\010\013\030\034\031\035\035\001\002\000\006" +
    "\024\040\036\037\001\002\000\030\011\uffde\023\uffde\024" +
    "\uffde\025\uffde\026\uffde\027\uffde\030\uffde\031\uffde\032\uffde" +
    "\033\uffde\036\uffde\001\002\000\010\013\030\034\031\035" +
    "\035\001\002\000\014\011\uffec\023\uffec\024\uffec\025\042" +
    "\036\uffec\001\002\000\010\013\030\034\031\035\035\001" +
    "\002\000\014\011\uffea\023\uffea\024\uffea\025\uffea\036\uffea" +
    "\001\002\000\010\006\007\013\045\021\020\001\002\000" +
    "\004\020\047\001\002\000\006\007\uffed\022\uffed\001\002" +
    "\000\010\013\030\034\031\035\035\001\002\000\006\011" +
    "\051\024\040\001\002\000\014\006\ufff2\007\ufff2\013\ufff2" +
    "\021\ufff2\022\ufff2\001\002\000\010\013\030\034\031\035" +
    "\035\001\002\000\010\013\uffe4\034\uffe4\035\uffe4\001\002" +
    "\000\010\013\uffe6\034\uffe6\035\uffe6\001\002\000\010\013" +
    "\uffe2\034\uffe2\035\uffe2\001\002\000\010\013\uffe5\034\uffe5" +
    "\035\uffe5\001\002\000\010\013\uffe1\034\uffe1\035\uffe1\001" +
    "\002\000\010\013\uffe3\034\uffe3\035\uffe3\001\002\000\014" +
    "\011\uffe8\023\uffe8\024\uffe8\025\uffe8\036\uffe8\001\002\000" +
    "\012\006\ufff4\007\ufff4\013\ufff4\021\ufff4\001\002\000\016" +
    "\005\uffff\006\uffff\007\uffff\013\uffff\021\uffff\022\uffff\001" +
    "\002\000\004\013\074\001\002\000\012\014\066\015\072" +
    "\016\070\017\071\001\002\000\004\011\ufff9\001\002\000" +
    "\004\011\073\001\002\000\004\011\ufff7\001\002\000\004" +
    "\011\ufff6\001\002\000\004\011\ufff8\001\002\000\010\006" +
    "\ufffc\013\ufffc\021\ufffc\001\002\000\006\010\ufffb\012\ufffb" +
    "\001\002\000\004\002\001\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\003\003\001\001\000\002\001\001\000" +
    "\004\004\005\001\001\000\002\001\001\000\004\005\007" +
    "\001\001\000\016\004\011\006\014\007\010\011\012\012" +
    "\015\013\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\011\012\061\013\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\014\023\015\021\001\001\000" +
    "\002\001\001\000\012\016\032\017\033\020\026\022\031" +
    "\001\001\000\004\015\024\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\021\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\016\035\017\033\020\026\022\031" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\017" +
    "\040\020\026\022\031\001\001\000\002\001\001\000\006" +
    "\020\042\022\031\001\001\000\002\001\001\000\010\004" +
    "\011\012\045\013\013\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\016\047\017\033\020\026\022\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\022\060" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\066\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static void main( String[] args )
    {
        try
        {
            FileReader file = new FileReader( args[0] );
            Scanner scanner = new MPLexer( file );
            MPParser parser = new MPParser( scanner );
			Symbol syntax_tree = parser.parse();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= LEFTPAR Expression RIGHTPAR 
            {
              Object RESULT = null;
		
    System.out.println("Smena 35");

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Term ::= CONST 
            {
              Object RESULT = null;
		
    System.out.println("Smena 34");

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Term ::= ID 
            {
              Object RESULT = null;
		
    System.out.println("Smena 33");

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // RelOp ::= GE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 32");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // RelOp ::= GT 
            {
              Object RESULT = null;
		
    System.out.println("Smena 31");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= NE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 30");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= EQ 
            {
              Object RESULT = null;
		
    System.out.println("Smena 29");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= LE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 28");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= LT 
            {
              Object RESULT = null;
		
    System.out.println("Smena 27");

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelExpression ::= Term 
            {
              Object RESULT = null;
		
    System.out.println("Smena 26");

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelExpression ::= Term RelOp Term 
            {
              Object RESULT = null;
		
    System.out.println("Smena 25");

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // AndExpression ::= RelExpression 
            {
              Object RESULT = null;
		
    System.out.println("Smena 24");

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // AndExpression ::= AndExpression AND RelExpression 
            {
              Object RESULT = null;
		
    System.out.println("Smena 23");

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expression ::= AndExpression 
            {
              Object RESULT = null;
		
    System.out.println("Smena 22");

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Expression ::= Expression OR AndExpression 
            {
              Object RESULT = null;
		
    System.out.println("Smena 21");

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Case ::= CASE Expression ARROW Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 20");

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Case*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CaseList ::= Case 
            {
              Object RESULT = null;
		
    System.out.println("Smena 19");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*CaseList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CaseList ::= CaseList Case 
            {
              Object RESULT = null;
		
    System.out.println("Smena 18");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*CaseList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SelectStatement ::= SELECT BEGIN CaseList END 
            {
              Object RESULT = null;
		
    System.out.println("Smena 17");

              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*SelectStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= Block 
            {
              Object RESULT = null;
		
    System.out.println("Smena 16");

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= ID ASSIGN Expression SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Smena 15");

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= SelectStatement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 14");

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 13");

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 12");

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= BOOLEAN 
            {
              Object RESULT = null;
		
    System.out.println("Smena 11");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REAL 
            {
              Object RESULT = null;
		
    System.out.println("Smena 10");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHAR 
            {
              Object RESULT = null;
		
    System.out.println("Smena 9");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INTEGER 
            {
              Object RESULT = null;
		
    System.out.println("Smena 8");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= ID 
            {
              Object RESULT = null;
		
    System.out.println("Smena 7");

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;
		
    System.out.println("Smena 6");

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaration ::= NameList COLON Type SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Smena 5");

              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*Declaration*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Variables ::= 
            {
              Object RESULT = null;
		
	System.out.println("Smena 4");

              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Variables ::= Variables Declaration 
            {
              Object RESULT = null;
		
    System.out.println("Smena 3");

              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= BEGIN Variables StatementList END 
            {
              Object RESULT = null;
		
    System.out.println("Smena 2");

              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= PROGRAM Block DOT 
            {
              Object RESULT = null;
		
    System.out.println("Smena 1");

              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
