package simple_file_parsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * CSV_Pars_List:  parser for .csv to list of java objects (CSV_Item) 
 * 
 * 
 */
public class CSV_Pars_List {

	private File csvIn = null;
	ArrayList<String> rows = new ArrayList<>();					//rows from .csv
	ArrayList<String> entries = new ArrayList<>();				//entries (values) from columns 
	ArrayList<CSV_Item> csvItemsList = new ArrayList<>();		//list of parsed objects

	public CSV_Pars_List(File csvFile) throws FileNotFoundException {
		this.csvIn = csvFile;
		
	}
	/*
	 * csvToRows(): puts rows from .csv into an ArrayList<String> of strings and
	 * prints strings in list via console
	 */
	public ArrayList<CSV_Item> createArrayList() throws FileNotFoundException {

		Scanner s = new Scanner(csvIn);

		CSV_Item item = new CSV_Item();
		
//		item.getValueOf(CSV_Item.WBANNO);		
		while (s.hasNext()) { // read strings from .csv into list "rows"
			rows.add(s.nextLine());
		}
		int i = 0;
		for (String t : rows) { // for every string in row (strings from .csv)
			
			while (t.contains("  ")) t = t.replace("  ", " "); // delete multiple whitespaces in t (row)
				for (String e : t.split(" ")) entries.add(e); // add splited substrings in entries list
//				for (String e : entries)System.out.print(e);
				csvItemsList.add(i, new CSV_Item());
				csvItemsList.get(i).setItemID(i);
				csvItemsList.get(i).setWBANNO(entries.get(0));
				csvItemsList.get(i).setUTC_DATE(entries.get(1));
				csvItemsList.get(i).setUTC_TIME(entries.get(2));
				csvItemsList.get(i).setLST_DATE(entries.get(3));
				csvItemsList.get(i).setLST_TIME(entries.get(4));
				csvItemsList.get(i).setCRX_VN(entries.get(5));
				csvItemsList.get(i).setLONGITUDE(entries.get(6));
				csvItemsList.get(i).setLATITUDE(entries.get(7));
				csvItemsList.get(i).setT_CALC(entries.get(8));
				csvItemsList.get(i).setT_HR_AVG(entries.get(9));
				csvItemsList.get(i).setT_MAX(entries.get(10));
				csvItemsList.get(i).setT_MIN(entries.get(11));
				csvItemsList.get(i).setP_CALC(entries.get(12));
				csvItemsList.get(i).setSOLARAD(entries.get(13));
				csvItemsList.get(i).setSOLARAD_FLAG(entries.get(14));
				csvItemsList.get(i).setSOLARAD_MAX(entries.get(15));
				csvItemsList.get(i).setSOLARAD_MAX_FLAG(entries.get(16));
				csvItemsList.get(i).setSOLARAD_MIN(entries.get(17));
				csvItemsList.get(i).setSOLARAD_MIN_FLAG(entries.get(18));
				csvItemsList.get(i).setSUR_TEMP_TYPE(entries.get(19));
				csvItemsList.get(i).setSUR_TEMP(entries.get(20));
				csvItemsList.get(i).setSUR_TEMP_FLAG(entries.get(21));
				csvItemsList.get(i).setSUR_TEMP_MAX(entries.get(22));
				csvItemsList.get(i).setSUR_TEMP_MAX_FLAG(entries.get(23));
				csvItemsList.get(i).setSUR_TEMP_MIN(entries.get(24));
				csvItemsList.get(i).setSUR_TEMP_MIN_FLAG(entries.get(25));
				csvItemsList.get(i).setRH_HR_AVG(entries.get(26));
				csvItemsList.get(i).setRH_HR_AVG_FLAG(entries.get(27));
				csvItemsList.get(i).setSOIL_MOISTURE_5(entries.get(28));
				csvItemsList.get(i).setSOIL_MOISTURE_10(entries.get(29));
				csvItemsList.get(i).setSOIL_MOISTURE_20(entries.get(30));
				csvItemsList.get(i).setSOIL_MOISTURE_50(entries.get(31));
				csvItemsList.get(i).setSOIL_MOISTURE_100(entries.get(32));
				csvItemsList.get(i).setSOIL_TEMP_5(entries.get(33));
				csvItemsList.get(i).setSOIL_TEMP_10(entries.get(34));
				csvItemsList.get(i).setSOIL_TEMP_20(entries.get(35));
				csvItemsList.get(i).setSOIL_TEMP_50(entries.get(36));
				csvItemsList.get(i).setSOIL_TEMP_100(entries.get(37));
				entries.clear();
				i++;
		}
		return csvItemsList;
	}

}
