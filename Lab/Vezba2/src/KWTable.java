
import java.util.Hashtable;
public class KWTable {

	private Hashtable mTable;
	public KWTable()
	{
		// Inicijalizcaija hash tabele koja pamti kljucne reci
		
		mTable = new Hashtable();
		mTable.put("program",new Integer(sym.PROGRAM));
		mTable.put("begin",new Integer(sym.BEGIN));
		mTable.put("end",new Integer(sym.END));
		mTable.put("integer",new Integer(sym.INTEGER));
		mTable.put("char",new Integer(sym.CHAR));
		mTable.put("real",new Integer(sym.REAL));
		mTable.put("bool",new Integer(sym.BOOLEAN));
		mTable.put("select",new Integer(sym.SELECT));
		mTable.put("case",new Integer(sym.CASE));
		
		/*mTable = new Hashtable();
		mTable.put("program", new Integer(sym.PROGRAM));
		mTable.put("var", new Integer(sym.VAR));
		mTable.put("integer", new Integer(sym.INTEGER));
		mTable.put("char", new Integer(sym.CHAR));
		mTable.put("begin", new Integer(sym.BEGIN));
		mTable.put("end", new Integer(sym.END));
		mTable.put("read", new Integer(sym.READ));
		mTable.put("write", new Integer(sym.WRITE));
		mTable.put("if", new Integer(sym.IF));
		mTable.put("then", new Integer(sym.THEN));
		mTable.put("else", new Integer(sym.ELSE));
		*/
	}
	
	/**
	 * Vraca ID kljucne reci 
	 */
	public int find(String keyword)
	{
		Object symbol = mTable.get(keyword);
		if (symbol != null)
			return ((Integer)symbol).intValue();
		
		// Ako rec nije pronadjena u tabeli kljucnih reci radi se o identifikatoru
		return sym.ID;
	}
	

}
