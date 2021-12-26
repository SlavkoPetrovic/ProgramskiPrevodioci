
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Dec 26 18:06:17 CET 2021
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.ArrayList;
import SymbolTable.*;

/** CUP v0.10k generated parser.
  * @version Sun Dec 26 18:06:17 CET 2021
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\050\000\002\003\005\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\002\000\002\006\006" +
    "\000\002\022\005\000\002\022\003\000\002\015\003\000" +
    "\002\015\003\000\002\015\003\000\002\015\003\000\002" +
    "\007\003\000\002\007\004\000\002\010\003\000\002\010" +
    "\006\000\002\010\003\000\002\011\006\000\002\012\004" +
    "\000\002\012\003\000\002\013\006\000\002\016\005\000" +
    "\002\016\003\000\002\017\005\000\002\017\003\000\002" +
    "\020\005\000\002\020\003\000\002\014\003\000\002\014" +
    "\003\000\002\014\003\000\002\014\003\000\002\014\003" +
    "\000\002\014\003\000\002\021\003\000\002\021\003\000" +
    "\002\021\005\000\002\023\003\000\002\023\003\000\002" +
    "\023\003\000\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\004\005\001\002\000\004\002\102\001" +
    "\002\000\004\012\007\001\002\000\004\005\101\001\002" +
    "\000\010\012\ufffd\020\ufffd\037\ufffd\001\002\000\010\012" +
    "\007\020\020\037\017\001\002\000\006\014\071\016\070" +
    "\001\002\000\014\012\ufff1\013\ufff1\020\ufff1\021\ufff1\037" +
    "\ufff1\001\002\000\012\012\007\013\067\020\020\037\061" +
    "\001\002\000\014\012\ufff3\013\ufff3\020\ufff3\021\ufff3\037" +
    "\ufff3\001\002\000\010\012\ufffe\020\ufffe\037\ufffe\001\002" +
    "\000\012\012\ufff5\013\ufff5\020\ufff5\037\ufff5\001\002\000" +
    "\010\014\ufffa\016\ufffa\017\063\001\002\000\004\012\021" +
    "\001\002\000\004\021\023\001\002\000\006\013\uffee\021" +
    "\uffee\001\002\000\016\034\035\036\041\037\037\040\031" +
    "\041\033\042\032\001\002\000\006\013\026\021\023\001" +
    "\002\000\006\013\uffef\021\uffef\001\002\000\014\012\ufff0" +
    "\013\ufff0\020\ufff0\021\ufff0\037\ufff0\001\002\000\014\015" +
    "\uffeb\022\uffeb\023\uffeb\024\056\035\uffeb\001\002\000\006" +
    "\022\060\023\054\001\002\000\030\015\uffda\022\uffda\023" +
    "\uffda\024\uffda\025\uffda\026\uffda\027\uffda\030\uffda\031\uffda" +
    "\032\uffda\035\uffda\001\002\000\030\015\uffdb\022\uffdb\023" +
    "\uffdb\024\uffdb\025\uffdb\026\uffdb\027\uffdb\030\uffdb\031\uffdb" +
    "\032\uffdb\035\uffdb\001\002\000\030\015\uffdc\022\uffdc\023" +
    "\uffdc\024\uffdc\025\uffdc\026\uffdc\027\uffdc\030\uffdc\031\uffdc" +
    "\032\uffdc\035\uffdc\001\002\000\030\015\uffdf\022\uffdf\023" +
    "\uffdf\024\uffdf\025\uffdf\026\uffdf\027\uffdf\030\uffdf\031\uffdf" +
    "\032\uffdf\035\uffdf\001\002\000\016\034\035\036\041\037" +
    "\037\040\031\041\033\042\032\001\002\000\030\015\uffe7" +
    "\022\uffe7\023\uffe7\024\uffe7\025\044\026\046\027\043\030" +
    "\050\031\045\032\047\035\uffe7\001\002\000\030\015\uffe0" +
    "\022\uffe0\023\uffe0\024\uffe0\025\uffe0\026\uffe0\027\uffe0\030" +
    "\uffe0\031\uffe0\032\uffe0\035\uffe0\001\002\000\014\015\uffe9" +
    "\022\uffe9\023\uffe9\024\uffe9\035\uffe9\001\002\000\030\015" +
    "\uffdd\022\uffdd\023\uffdd\024\uffdd\025\uffdd\026\uffdd\027\uffdd" +
    "\030\uffdd\031\uffdd\032\uffdd\035\uffdd\001\002\000\016\034" +
    "\035\036\041\037\037\040\031\041\033\042\032\001\002" +
    "\000\016\034\uffe4\036\uffe4\037\uffe4\040\uffe4\041\uffe4\042" +
    "\uffe4\001\002\000\016\034\uffe6\036\uffe6\037\uffe6\040\uffe6" +
    "\041\uffe6\042\uffe6\001\002\000\016\034\uffe2\036\uffe2\037" +
    "\uffe2\040\uffe2\041\uffe2\042\uffe2\001\002\000\016\034\uffe5" +
    "\036\uffe5\037\uffe5\040\uffe5\041\uffe5\042\uffe5\001\002\000" +
    "\016\034\uffe1\036\uffe1\037\uffe1\040\uffe1\041\uffe1\042\uffe1" +
    "\001\002\000\016\034\uffe3\036\uffe3\037\uffe3\040\uffe3\041" +
    "\uffe3\042\uffe3\001\002\000\014\015\uffe8\022\uffe8\023\uffe8" +
    "\024\uffe8\035\uffe8\001\002\000\006\023\054\035\053\001" +
    "\002\000\030\015\uffde\022\uffde\023\uffde\024\uffde\025\uffde" +
    "\026\uffde\027\uffde\030\uffde\031\uffde\032\uffde\035\uffde\001" +
    "\002\000\016\034\035\036\041\037\037\040\031\041\033" +
    "\042\032\001\002\000\014\015\uffec\022\uffec\023\uffec\024" +
    "\056\035\uffec\001\002\000\016\034\035\036\041\037\037" +
    "\040\031\041\033\042\032\001\002\000\014\015\uffea\022" +
    "\uffea\023\uffea\024\uffea\035\uffea\001\002\000\010\012\007" +
    "\020\020\037\061\001\002\000\004\017\063\001\002\000" +
    "\006\013\uffed\021\uffed\001\002\000\016\034\035\036\041" +
    "\037\037\040\031\041\033\042\032\001\002\000\006\015" +
    "\065\023\054\001\002\000\014\012\ufff2\013\ufff2\020\ufff2" +
    "\021\ufff2\037\ufff2\001\002\000\012\012\ufff4\013\ufff4\020" +
    "\ufff4\037\ufff4\001\002\000\016\005\uffff\012\uffff\013\uffff" +
    "\020\uffff\021\uffff\037\uffff\001\002\000\004\037\100\001" +
    "\002\000\012\006\072\007\075\010\074\011\076\001\002" +
    "\000\004\015\ufff9\001\002\000\004\015\077\001\002\000" +
    "\004\015\ufff7\001\002\000\004\015\ufff6\001\002\000\004" +
    "\015\ufff8\001\002\000\010\012\ufffc\020\ufffc\037\ufffc\001" +
    "\002\000\006\014\ufffb\016\ufffb\001\002\000\004\002\001" +
    "\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\003\003\001\001\000\002\001\001\000" +
    "\004\004\005\001\001\000\002\001\001\000\004\005\007" +
    "\001\001\000\016\004\011\006\014\007\012\010\015\011" +
    "\013\022\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\011\010\065\011\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\012\023\013\021\001\001\000" +
    "\002\001\001\000\014\016\027\017\026\020\037\021\035" +
    "\023\033\001\001\000\004\013\024\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\016\051\017\026\020\037\021\035" +
    "\023\033\001\001\000\004\014\041\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\021\050" +
    "\023\033\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\017\054\020\037\021\035\023\033\001\001" +
    "\000\002\001\001\000\010\020\056\021\035\023\033\001" +
    "\001\000\002\001\001\000\010\004\011\010\061\011\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\016" +
    "\063\017\026\020\037\021\035\023\033\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\072\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

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
          case 39: // Konstanta ::= REALCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Double c = (Double)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	RESULT = new Constant(parser.symbolTable.getType( "real" ),c );

              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Konstanta ::= BOOLCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Boolean c = (Boolean)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	RESULT = new Constant(parser.symbolTable.getType( "boolean" ),c );

              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Konstanta ::= CHARCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Character c = (Character)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	RESULT = new Constant(parser.symbolTable.getType( "char" ),c );

              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Konstanta ::= INTCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	RESULT = new Constant(parser.symbolTable.getType( "integer" ),c);

              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= LEFTPAR Expression RIGHTPAR 
            {
              Type RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Type i = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		
	RESULT = i;

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Term ::= Konstanta 
            {
              Type RESULT = null;
		int kleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int kright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Constant k = (Constant)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	RESULT = k.type;

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Term ::= ID 
            {
              Type RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
	Variable var = parser.symbolTable.getVar( ime );
    if ( var == null )
    {
    	System.out.println( "Greska u liniji " + parser.getLine() +  ": promenljiva " + ime + " nije deklarisana.");
    	RESULT = parser.symbolTable.getType( "unknown" );
        parser.errNo++;
    }
    else 
    {
    	RESULT = var.type;
        if ( var.last_def == -1 )
        {
        	System.out.println( "Greska u liniji " + parser.getLine() + ": promenljiva " + ime + " nije inicijalizovana.");
            parser.errNo++;
        }
     	var.last_use = parser.getLine();
	}

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // RelOp ::= GE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 32");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // RelOp ::= GT 
            {
              Object RESULT = null;
		
    System.out.println("Smena 31");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= NE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 30");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= EQ 
            {
              Object RESULT = null;
		
    System.out.println("Smena 29");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= LE 
            {
              Object RESULT = null;
		
    System.out.println("Smena 28");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= LT 
            {
              Object RESULT = null;
		
    System.out.println("Smena 27");

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelExpression ::= Term 
            {
              Type RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type i = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
    RESULT = i;

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelExpression ::= Term RelOp Term 
            {
              Type RESULT = null;
		int r1left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int r1right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type r1 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int r2left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int r2right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type r2 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
    System.out.println("Smena 25");
	if(r1.tkind != Type.BOOLEAN || r2.tkind != Type.BOOLEAN)
	{
		System.out.println("Greska u liniji "+parser.getLine()+": "+"Operandi u logickom izrazu mogu biti samo tipa boolean.");
		parser.errNo++;
	}
	RESULT = parser.symbolTable.getType("boolean"); 

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // AndExpression ::= RelExpression 
            {
              Type RESULT = null;
		
    System.out.println("Smena 24");

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // AndExpression ::= AndExpression AND RelExpression 
            {
              Type RESULT = null;
		
    System.out.println("Smena 23");

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expression ::= AndExpression 
            {
              Type RESULT = null;
		
    System.out.println("Smena 22");

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Expression ::= Expression OR AndExpression 
            {
              Type RESULT = null;
		
    System.out.println("Smena 21");

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Case ::= CASE Expression ARROW Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 20");

              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*Case*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CaseList ::= Case 
            {
              Object RESULT = null;
		
    System.out.println("Smena 19");

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*CaseList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CaseList ::= CaseList Case 
            {
              Object RESULT = null;
		
    System.out.println("Smena 18");

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*CaseList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SelectStatement ::= SELECT BEGIN CaseList END 
            {
              Object RESULT = null;
		
    System.out.println("Smena 17");

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*SelectStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= Block 
            {
              Object RESULT = null;
		
    System.out.println("Smena 16");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= ID ASSIGN Expression SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Smena 15");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= SelectStatement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 14");

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 13");

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
    System.out.println("Smena 12");

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Tip ::= BOOLEAN 
            {
              Type RESULT = null;
		
    System.out.println("Smena 11");
	RESULT = parser.symbolTable.getType("boolean");

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Tip*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Tip ::= REAL 
            {
              Type RESULT = null;
		
    System.out.println("Smena 10");
	RESULT = parser.symbolTable.getType("double");

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Tip*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Tip ::= CHAR 
            {
              Type RESULT = null;
		
    System.out.println("Smena 9");
	RESULT = parser.symbolTable.getType("char");

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Tip*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Tip ::= INTEGER 
            {
              Type RESULT = null;
		
    System.out.println("Smena 8");
	RESULT = parser.symbolTable.getType("integer");

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Tip*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= ID 
            {
              ArrayList RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
    System.out.println("Smena 7");
	RESULT = new ArrayList();
	RESULT.add( ime );

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA ID 
            {
              ArrayList RESULT = null;
		int nizleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int nizright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		ArrayList niz = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
    System.out.println("Smena 6");
	RESULT = niz;
	RESULT.add( ime );

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaration ::= NameList COLON Tip SEMICOLON 
            {
              Object RESULT = null;
		int nizleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left;
		int nizright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).right;
		ArrayList niz = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		
    System.out.println("Smena 5");
	for(int i = 0; i < niz.size(); i++)
    {
    	String ime = (String) niz.get(i);
        if(!parser.symbolTable.addVar(ime, t))
		{
        	System.out.println("Greska u liniji "+parser.getLine()+": "+"Promenljiva "+ime+" je vec deklarisana.");
            parser.errNo++;
		}
	}


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

