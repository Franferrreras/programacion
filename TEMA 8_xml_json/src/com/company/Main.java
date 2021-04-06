package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();

        try {
            //Cargar el fichero xml en memoria
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("banco.xml"));

            //Coger las etiquetas cuenta

            Element banco = doc.getDocumentElement();
            NodeList nl = banco.getChildNodes();

            for (int i = 0; i < nl.getLength() ; i++) {
                Element e = (Element) nl.item(i);
                //e.getAttribute("cc");
                System.out.println("CC: "+e.getAttribute("cc"));


                NodeList nlInterior = e.getChildNodes();
                for (int j = 0; j < nlInterior.getLength() ; j++) {
                    Node nodo = nlInterior.item(j);

                    if (nodo.getNodeType()== Node.ELEMENT_NODE){
                        Element element = (Element) nodo;

                        if (element.getTagName()=="saldo") {
                            System.out.println("Saldo: "+e.getTextContent());
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
