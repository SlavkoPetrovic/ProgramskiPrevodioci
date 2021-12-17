import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SyntaxTable {

	public final static int SelectStatement_Prime = 100;
	  public final static int SelectStatement  = 101;
	  public final static int CaseList = 102;
	  public final static int Case = 103;
	  public final static int Statement  = 104;

	  private static ArrayList<HashMap<Integer, String>> _syntaxTable;
	  private static ArrayList<Rule> _rules;
	public SyntaxTable() {
		
	}

	  public static List<HashMap<Integer, String>> getSyntaxTable() {
	    if (_syntaxTable == null)
	      _syntaxTable = new ArrayList<HashMap<Integer, String>>() {
	        {
	          // #0
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.SELECT, "sk 2");
	              put(SelectStatement, "1");
	            
	            }
	          });
	          // #1
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.EOF, "acc");
	            }
	          });
	          // #2
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.BEGIN, "sk 3");
	            }
	          });
	          // #3
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.CASE, "sk 8");
	              put(Case, "7");
	              put(CaseList, "4");
	            }
	          });
	          // #4
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.END, "sk 5");
	              put(Case, "6");
	            }
	          });
	          // #5
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.END, "rk 1");
	              put(sym.CASE, "rk 1");
	              put(sym.EOF, "rk 1");
	            }
	          });
	          // #6
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 2");
		              put(sym.CASE, "rk 2");
	            }
	          });
	          // #7
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 3");
		              put(sym.CASE, "rk 3");
	            }
	          });
	          // #8
	          add(new HashMap<Integer, String>() {
	            {
	              put(sym.ID, "sk 9");
	            
	            }
	          });
	          // #9
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.ARROW, "sk 10");
	            }
	          });
	          // #10
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.ID, "sk 13");
	            }
	          });
	          // #11
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 4");
		            put(sym.CASE, "rk 4");
	            }
	          });
	          // #12
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 5");
		            put(sym.CASE, "rk 5");
	            }
	          });
	          // #13
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.ASSIGN, "sk 14");
	            }
	          });
	          // #14
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.ID, "sk 15");
	            	put(sym.CONST, "sk 15");
	            }
	          });
	          // #15
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.SEMICOLON, "sk 16");
	            }
	          });
	          // #16
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 6");
		            put(sym.CASE, "rk 6");
	            }
	          });
	          // #17
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.SEMICOLON, "sk 18");
	            }
	          });
	          // #18
	          add(new HashMap<Integer, String>() {
	            {
	            	put(sym.END, "rk 7");
		            put(sym.CASE, "rk 7");
	            }
	          });
	          
	        }
	      };

	    return _syntaxTable;
	  }
	  public static List<Rule> getRules() {
		    if (_rules == null)
		      _rules = new ArrayList<Rule>() {
		        {
		          // #0
		          add(new Rule(SyntaxTable.SelectStatement_Prime, new LinkedList<Integer>() {
		            {
		              add(SyntaxTable.SelectStatement);
		            }
		          }));
		          // #1
		          add(new Rule(SyntaxTable.SelectStatement, new LinkedList<Integer>() {
		            {
		            	add(sym.SELECT);
		            	add(sym.BEGIN);
		            	 add(SyntaxTable.CaseList);
		            	add(sym.END);
		             
		         
		            }
		          }));
		          // #2
		          add(new Rule(SyntaxTable.CaseList, new LinkedList<Integer>() {
		            {
		              add(SyntaxTable.CaseList);
		              add(SyntaxTable.Case);
		            }
		          }));
		          // #3
		          add(new Rule(SyntaxTable.CaseList, new LinkedList<Integer>() {
		            {
		            	 add(SyntaxTable.Case);
		            }
		          }));
		          // #4
		          add(new Rule(SyntaxTable.Case, new LinkedList<Integer>() {
		            {
		            	add(sym.CASE);
		            	add(sym.ID);
		            	add(sym.EQ);
		            	add(sym.GT);
		            	 add(SyntaxTable.Statement);
		            }
		          }));
		          // #5
		          add(new Rule(SyntaxTable.Statement, new LinkedList<Integer>() {
		            {
		              add(sym.ID);
		              add(sym.ASSIGN);
		              add(SyntaxTable.SelectStatement);
		            }
		          }));
		          // #6
		          add(new Rule(SyntaxTable.Statement, new LinkedList<Integer>() {
		            {
		              add(sym.ID);
		              add(sym.COLON);
		              add(sym.EQ);
		              add(sym.ID);
		            }
		          }));
		          // #7
		          add(new Rule(SyntaxTable.Statement, new LinkedList<Integer>() {
		            {
		            	add(sym.ID);
			              add(sym.COLON);
			              add(sym.EQ);
			              add(sym.CONST);
		            }
		          }));
		          
		        }
		      };

		    return _rules;
		  }

}
