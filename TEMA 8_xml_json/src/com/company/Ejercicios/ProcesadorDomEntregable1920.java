package com.company.Ejercicios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ProcesadorDomEntregable1920 {


    public void numElmentosHijos(String nomFile) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(nomFile);

            //Cojo el elemento raiz o padre del xml
            Element root = doc.getDocumentElement();

            //Obtengo todas las etiquetas hijas de la raiz
            NodeList nl = root.getChildNodes();

            //Recorro el xml para mostrar las etiquetas

            System.out.println("El lemento xml tiene "+nl.getLength()+" hijos y sus elementos son");
            for (int i = 0; i < nl.getLength() ; i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    //Muestro por pantalla la etiqueta hija del root tipo elemento
                    Element elmt = (Element) nl.item(i);
                    System.out.println("<"+elmt.getTagName()+">");
                }

                if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    Element coment = (Element) nl.item(i);
                    System.out.println(coment.getTagName());
                }

                if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                    Element txtnode = (Element) nl.item(i);
                    System.out.println(txtnode.getTagName());
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getMessage());
        }
    }

}
