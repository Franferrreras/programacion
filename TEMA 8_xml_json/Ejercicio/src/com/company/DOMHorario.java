package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class DOMHorario {


    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            try {
                //Cargo el fichero XML en Memoria
                DocumentBuilder db  = dbf.newDocumentBuilder();
                Document doc = db.parse(new File("horario.xml"));

                //Cojer directamente las etiquetas dia
                NodeList nl = doc.getElementsByTagName("dia");

                System.out.println("En este fichero tengo: "+nl.getLength()+" etiquetas dia");


                //Voy a tratar cada una de estas etiquetas dia
                for (int i = 0; i <nl.getLength() ; i++) {
                    Node nodo = nl.item(i);

                    Element e = (Element) nodo;
                    System.out.println("Estoy en una etiqueta: "+e.getTagName()+e.getAttribute("nombre"));

                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println("Y esta etiqueta tiene a su vez "+nodo.getChildNodes().getLength()+" nodos hijos");
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j <listaInterior.getLength() ; j++) {

                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los nodos hijos es la etiqueta "+eHijo.getTagName());
                                System.out.println("Cuyo contenido es: "+eHijo.getTextContent());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
}
