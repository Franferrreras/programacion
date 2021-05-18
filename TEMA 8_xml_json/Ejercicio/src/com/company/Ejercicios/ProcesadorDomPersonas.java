package com.company.Ejercicios;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.beans.ExceptionListener;
import java.io.File;
import java.io.IOException;

public class ProcesadorDomPersonas {

    public void parse(String nomFile) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(nomFile));


            //Cojo el elemento raiz o padre del xml
            Element root = doc.getDocumentElement();

            //Obtengo todos las etitquetas hijas de la raiz
            NodeList nl = root.getChildNodes();

            //Recorremos el xml basicamente

            for (int i = 0; i < nl.getLength() ; i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                    //Muestro por pantalla el xml
                    Element elmt = (Element) nl.item(i);
                    System.out.println("<"+elmt.getTagName()+">");
                    //System.out.println(elmt.getTextContent());

                    //Compruebo si los elementos a su vez tienen hijos
                    if (elmt.hasChildNodes()) {
                        //Meto los hijos en una lista
                        NodeList listHijos = elmt.getChildNodes();
                        for (int j = 0; j < listHijos.getLength() ; j++) {
                            if (listHijos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element e = (Element) listHijos.item(j);
                                System.out.println("   <"+e.getTagName()+">"+e.getTextContent()+"<\\"+e.getTagName()+">");
                                //System.out.print("       "+e.getTextContent());
                            }
                        }
                    }
                    //Comprobar si el elemento etiqueta tiene atributos

                    if (elmt.hasAttributes()) {
                        System.out.println("Este nodo tiene atributos");

                        NamedNodeMap nodeMap = elmt.getAttributes();
                        for (int j = 0; j < nodeMap.getLength() ; j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = elmt.getAttributeNode(node.getNodeName());
                            System.out.println("Atributo: " + atributo.getNodeName());
                            System.out.println("Value: " + atributo.getValue());
                        }
                    } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                        Text texto = (Text) nl.item(i);
                        System.out.println(texto.getTextContent());
                    }
                    System.out.println("-------------------------------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
