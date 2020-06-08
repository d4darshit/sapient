package com.sapient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;

import org.xml.sax.SAXException;

public class Demo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		System.out.println("Enter employee Id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.close();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		
		Document document = documentBuilder.parse("Employees.xml");
		
		
		NodeList nodes = document.getDocumentElement().getChildNodes();
		boolean flag=true;
		for(int i=0;i<nodes.getLength();i++) {
			Node node = nodes.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element ob =(Element) node;
				int idFromNode = Integer.parseInt(node.getAttributes().getNamedItem("id").getNodeValue());
				
				if(id == idFromNode) {
					
					String employee_name = ob.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
					String employee_city = ob.getElementsByTagName("city").item(0).getChildNodes().item(0).getNodeValue();
					System.out.println("Employee name: "+employee_name+", Employee city: "+employee_city+", Employee ID: "+id);
					flag=true;
					}
			}
						
			
		}
		if(flag==false)
		System.out.println("Employee not found for given Id!");
			
		
		
	
	}
}
