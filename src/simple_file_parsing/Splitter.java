package simple_file_parsing;

import java.util.ArrayList;
import java.util.HashMap;

public class Splitter {

	private ArrayList<CSV_Item> listToSplit;
	private ArrayList<CSV_Item> oneYearCsvItemList = new ArrayList<>();
	private ArrayList<ArrayList<CSV_Item>> monthArray = new ArrayList<ArrayList<CSV_Item>>();
	int i = 0;

	public Splitter(ArrayList<CSV_Item> listToSplit) {
		super();
		this.listToSplit = listToSplit;
	}

	public void oneYearList() { // converts csvList to
		// oneYearCsvList by filtering
		// Items

		int yearBegin = Integer.parseInt(listToSplit.get(0).getLST_DATE().substring(0, 4));
		listToSplit.forEach(x -> {

			int checkYear = Integer.parseInt(x.getLST_DATE().substring(0, 4));

			if (checkYear > yearBegin) {
				x.setItemID(i);
				oneYearCsvItemList.add(i, x);
				i++;
			}
		});

	}

	public void printOneYearCvsItemList() {
		for (CSV_Item i : oneYearCsvItemList) {
			System.out.println(i.toString());
		}

	}

	public ArrayList<ArrayList<CSV_Item>> splitOnMonth() {
		initMonthArray();
		int monthCount = 0;
		int cur;
		int nex;
		int check = 0;
		for (CSV_Item currentItem : oneYearCsvItemList) {

			if (check < oneYearCsvItemList.size() - 1) {
				cur = Integer.parseInt(currentItem.getLST_DATE().substring(6, 8));
				nex = Integer
						.parseInt(oneYearCsvItemList.get(currentItem.getItemID() + 1).getLST_DATE().substring(6, 8));

				if (cur > nex) {

					monthArray.get(monthCount).add(currentItem);
					monthCount++;
				} else {
					monthArray.get(monthCount).add(currentItem);
				}

			} else
				monthArray.get(monthCount).add(currentItem);
			check++;
		}
		return monthArray;
	}

	public ArrayList<ArrayList<CSV_Item>> getMonthArray() {
		return monthArray;
	}

	public void setMonthArray(ArrayList<ArrayList<CSV_Item>> monthArray) {
		this.monthArray = monthArray;
	}

	private void initMonthArray() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) {
			monthArray.add(i, new ArrayList<CSV_Item>());
		}
	}

	public void printMonthArray() {
		int count = 0;
		for (ArrayList<CSV_Item> e : monthArray) {
			System.out.println("#####################################################################################");

			for (CSV_Item g : e) {
				System.out.println("at count = " + count + "   date is:" + g.getLST_DATE() + " " + g.getLST_TIME());
				count++;
			}
		}

	}

}
