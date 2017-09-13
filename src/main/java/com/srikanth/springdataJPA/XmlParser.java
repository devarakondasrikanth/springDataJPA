package com.srikanth.springdataJPA;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class XmlParser {
	public static void main(String argv[]) {

	    try {

		File fXmlFile = new File("C:\\Users\\D123577\\Documents\\NewFile.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("RECORD");
		List<Record> dataList = new ArrayList<>();
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			NodeList nNodeList = nNode.getChildNodes();
			for(int i=0;i<nNodeList.getLength();i++){
				Node nNodeTemp = nNodeList.item(i);		
				if (nNodeTemp.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNodeTemp;
					if(eElement.getAttribute("NAME").equals(new String("attribute.name"))||eElement.getAttribute("NAME").equals(new String("attribute.display_name"))){
						dataList.add(new Record(eElement.getAttribute("NAME"),nNodeTemp.getTextContent().trim()));
					}
					
				}
			}
		}
		for(Record rec : dataList){
			System.out.println(rec.toString());
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }
}

