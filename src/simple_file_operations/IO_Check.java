package simple_file_operations;

import java.io.*;
import java.util.ArrayList;
import simple_file_parsing.CSV_Item;
import simple_file_parsing.CSV_Pars_List;

public class IO_Check {
/*
 * this class just checking the parseroutput
 * 
 */
	public static void main(String[] args) throws IOException {
		 
		File csvFile = new File("wetter.csv");
	
		CSV_Pars_List h = new CSV_Pars_List(csvFile);
		ArrayList<CSV_Item> list = h.createArrayList();
		for(CSV_Item i: list){
			System.out.println(i.toString());
		}
		
	}

}
