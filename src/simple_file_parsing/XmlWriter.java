package simple_file_parsing;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;

public class XmlWriter {

	int i = 0;
	private ArrayList<ArrayList<CSV_Item>> monthArray;

	public XmlWriter(ArrayList<ArrayList<CSV_Item>> monthArray) {
		super();
		this.monthArray = monthArray;
	}

	public void makeXmlFile() throws TransformerException {

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// create new document
			Document doc = docBuilder.newDocument();
			doc.setXmlStandalone(true);
			
			ProcessingInstruction xslt = doc.createProcessingInstruction("xml-stylesheet", "type='text/xsl' href='wetter.xsl'");
			doc.appendChild(xslt);
			

			// add root element <station>
			Element rootElement = doc.createElement("station");
			doc.appendChild(rootElement);
			
			
			// add element <location>
			Element location = doc.createElement("location");
			location.setAttribute("longitude", monthArray.get(0).get(0).getLONGITUDE());
			location.setAttribute("latitude", monthArray.get(0).get(0).getLATITUDE());
			rootElement.appendChild(location);

			// add element <stationNumber>
			Element stationNumber = doc.createElement("stationNumber");
			stationNumber.setAttribute("stationNumber", monthArray.get(0).get(0).getWBANNO());
			rootElement.appendChild(stationNumber);

			// add element <data>
			Element data = doc.createElement("data");
			data.setAttribute("year", monthArray.get(0).get(0).getLST_DATE().substring(0, 4));
			rootElement.appendChild(data);

			// add month, days and hours + values

			for (ArrayList<CSV_Item> m : monthArray) { // m is a month(list)
				Element month = doc.createElement("month");
				month.setAttribute("valueMonth", m.get(0).getLST_DATE().substring(4, 6));
				month.setAttribute("caption", captionMonth(m.get(0).getLST_DATE().substring(4, 6)));
				data.appendChild(month);

				for (int i = 0; i < m.size(); i = i + 24) { // d is a day
					Element day = doc.createElement("day");
					day.setAttribute("valueDay", m.get(i).getLST_DATE().substring(6, 8));
					month.appendChild(day);

					// add hours to days....is tricky
					for (CSV_Item h : m) { // m is list with all hours for a
											// given month
						if (h.getLST_DATE().substring(6, 8).equals(m.get(i).getLST_DATE().substring(6, 8))) { // if
							Element hour = doc.createElement("hour");
							hour.setAttribute("valueHour", h.getLST_TIME());
							hour.setAttribute("temperature", h.getT_HR_AVG());
							day.appendChild(hour);
						}
					}
	
				}
			}

			// write to file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("file.xml"));
//			StreamResult result = new StreamResult(System.out);
			transformer.transform(source, result);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}

	}

	public String captionMonth(String month) {

		HashMap<String, String> monthHash = new HashMap<>();
		monthHash.put("01", "Jan.");
		monthHash.put("02", "Feb.");
		monthHash.put("03", "Mar.");
		monthHash.put("04", "Apr.");
		monthHash.put("05", "May.");
		monthHash.put("06", "Jun.");
		monthHash.put("07", "Jul.");
		monthHash.put("08", "Aug.");
		monthHash.put("09", "Sep.");
		monthHash.put("10", "Oct.");
		monthHash.put("11", "Nov.");
		monthHash.put("12", "Dez.");
		String ret = monthHash.get(month);
		return ret;
	}
}
