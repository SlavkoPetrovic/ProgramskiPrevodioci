
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Dec 26 16:40:25 CET 2021
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.ArrayList;
import SymbolTable.*;

/** CUP v0.10k generated parser.
  * @version Sun Dec 26 16:40:25 CET 2021
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
    "\000\010\006\ufffd\014\ufffd\033\ufffd\001\002\000\010\006" +
    "\007\014\020\033\017\001\002\000\006\010\065\012\064" +
    "\001\002\000\014\006\ufff1\007\ufff1\014\ufff1\015\ufff1\033" +
    "\ufff1\001\002\000\012\006\007\007\063\014\020\033\045" +
    "\001\002\000\014\006\ufff3\007\ufff3\014\ufff3\015\ufff3\033" +
    "\ufff3\001\002\000\010\006\ufffe\014\ufffe\033\ufffe\001\002" +
    "\000\012\006\ufff5\007\ufff5\014\ufff5\033\ufff5\001\002\000" +
    "\010\010\ufffa\012\ufffa\013\047\001\002\000\004\006\021" +
    "\001\002\000\004\015\023\001\002\000\006\007\uffee\015" +
    "\uffee\001\002\000\010\027\031\030\035\033\030\001\002" +
    "\000\006\007\026\015\023\001\002\000\006\007\uffef\015" +
    "\uffef\001\002\000\014\006\ufff0\007\ufff0\014\ufff0\015\ufff0" +
    "\033\ufff0\001\002\000\014\011\uffe9\016\uffe9\017\uffe9\020" +
    "\uffe9\031\uffe9\001\002\000\030\011\uffe0\016\uffe0\017\uffe0" +
    "\020\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0\026" +
    "\uffe0\031\uffe0\001\002\000\030\011\uffdf\016\uffdf\017\uffdf" +
    "\020\uffdf\021\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\026" +
    "\uffdf\031\uffdf\001\002\000\030\011\uffe7\016\uffe7\017\uffe7" +
    "\020\uffe7\021\054\022\056\023\053\024\060\025\055\026" +
    "\057\031\uffe7\001\002\000\006\016\044\017\040\001\002" +
    "\000\014\011\uffeb\016\uffeb\017\uffeb\020\042\031\uffeb\001" +
    "\002\000\010\027\031\030\035\033\030\001\002\000\006" +
    "\017\040\031\037\001\002\000\030\011\uffde\016\uffde\017" +
    "\uffde\020\uffde\021\uffde\022\uffde\023\uffde\024\uffde\025\uffde" +
    "\026\uffde\031\uffde\001\002\000\010\027\031\030\035\033" +
    "\030\001\002\000\014\011\uffec\016\uffec\017\uffec\020\042" +
    "\031\uffec\001\002\000\010\027\031\030\035\033\030\001" +
    "\002\000\014\011\uffea\016\uffea\017\uffea\020\uffea\031\uffea" +
    "\001\002\000\010\006\007\014\020\033\045\001\002\000" +
    "\004\013\047\001\002\000\006\007\uffed\015\uffed\001\002" +
    "\000\010\027\031\030\035\033\030\001\002\000\006\011" +
    "\051\017\040\001\002\000\014\006\ufff2\007\ufff2\014\ufff2" +
    "\015\ufff2\033\ufff2\001\002\000\010\027\031\030\035\033" +
    "\030\001\002\000\010\027\uffe4\030\uffe4\033\uffe4\001\002" +
    "\000\010\027\uffe6\030\uffe6\033\uffe6\001\002\000\010\027" +
    "\uffe2\030\uffe2\033\uffe2\001\002\000\010\027\uffe5\030\uffe5" +
    "\033\uffe5\001\002\000\010\027\uffe1\030\uffe1\033\uffe1\001" +
    "\002\000\010\027\uffe3\030\uffe3\033\uffe3\001\002\000\014" +
    "\011\uffe8\016\uffe8\017\uffe8\020\uffe8\031\uffe8\001\002\000" +
    "\012\006\ufff4\007\ufff4\014\ufff4\033\ufff4\001\002\000\016" +
    "\005\uffff\006\uffff\007\uffff\014\uffff\015\uffff\033\uffff\001" +
    "\002\000\004\033\074\001\002\000\012\032\066\034\070" +
    "\035\072\036\071\001\002\000\004\011\ufff9\001\002\000" +
    "\004\011\073\001\002\000\004\011\ufff7\001\002\000\004" +
    "\011\ufff6\001\002\000\004\011\ufff8\001\002\000\010\006" +
    "\ufffc\014\ufffc\033\ufffc\001\002\000\006\010\ufffb\012\ufffb" +
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


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	symbolTable = new SymbolTable();

    }



	public int errNo = 0;
	public int warnNo = 0;
	public int scope = 0;

	SymbolTable symbolTable;

	public static void main( String[] args )
	{
		try
		{
			FileReader file = new FileReader( args[0] );
			Scanner scanner = new MPLexer( file );
			MPParser parser = new MPParser( scanner );
			parser.parse();
			parser.checkWarnings();
			System.out.println( "Analiza zavrsena." );
			if ( parser.errNo == 0 )
				System.out.println( "U kodu nema gresaka." );
			else
				System.out.println( "Broj gresaka: " + parser.errNo );
			if( parser.warnNo == 0 )
				System.out.println( "U kodu nema upozorenja." );
			else
				System.out.println( "Broj upozorenja: " + parser.warnNo );
		}
		catch( Exception e )
		{
			System.out.println(e);
		}
	}
	
	public void checkWarnings()
	{
		SymbolNode current = symbolTable.getVariables();
		while(current != null)
		{
			Variable var = (Variable)current;
			if(var.last_def == -1 && var.last_use == -1)
			{
				System.out.println("Upozorenje: Promenljiva "
					+ var.name +
					" je deklarisana, ali se ne koristi.");
				warnNo++;
			}
			else if(var.last_def > var.last_use)
			{
				System.out.println("Upozorenje: Vrednost dodeljena promenljivoj "
					+ var.name + " u liniji " + var.last_def +
					" se nigde ne koristi.");
				warnNo++;
			}
			current = current.next;
		}
	}
	
	public void syntax_error(Symbol cur_token)
	{
		
	}

	public void report_error(String message, Object info)
	{
		System.out.print( message );
	}

	public int getLine()
	{
		return (( MPLexer) getScanner()).getLine();
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
          case 11: // Type ::= BOOLCONST 
            {
              Object RESULT = null;
		
    System.out.println("Smena 11");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REALCONST 
            {
              Object RESULT = null;
		
    System.out.println("Smena 10");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHARCONST 
            {
              Object RESULT = null;
		
    System.out.println("Smena 9");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INTCONST 
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
