package simple_file_operations;

import java.io.*;
import java.util.ArrayList;

import javax.xml.transform.TransformerException;

import simple_file_parsing.CSV_Item;
import simple_file_parsing.CSV_Pars_List;
import simple_file_parsing.Splitter;
import simple_file_parsing.XmlWriter;


public class IO_Check {
/*
 * this class just checking the parseroutput
 * 
 */
	public static void main(String[] args) throws IOException, TransformerException {
		 
		File csvFile = new File("wetter.csv");
		CSV_Pars_List h = new CSV_Pars_List(csvFile);
		ArrayList<CSV_Item> list = h.createArrayList();
		Splitter splitter = new Splitter(list);
		splitter.oneYearList();
//		splitter.printMonthArray();
		ArrayList<ArrayList<CSV_Item>> monA = splitter.splitOnMonth();
		XmlWriter writer = new XmlWriter(monA);
		writer.makeXmlFile();
		
		
	}

}
