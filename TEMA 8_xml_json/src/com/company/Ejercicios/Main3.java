package com.company.Ejercicios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("entregable1920.xml"));

            System.out.println(numNodosHijos(doc));


        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int numNodosHijos(Document doc) {
        //Cojo el elemento raiz o padre del xml
        Element root = doc.getDocumentElement();

        //Ontengo todas las etiquetas hijas de la raiz
        NodeList nl = root.getChildNodes();

        int numNodos = 0;

        for (int i = 0; i < nl.getLength() ; i++) {
            numNodos++;
            String tipo = nl.item(i).getNodeName();

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                //Muestro por pantalla la etiqueta hija del root tipo elemento
                System.out.println("El elemento "+i+" es de tipo elemento"+tipo);
            }

            if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                System.out.println("El elemento "+i+" es de tipo comentario"+tipo);
            }

            if (nl.item(i).getNodeType() == Node.TEXT_NODE) { ;
                System.out.println("El elemento "+i+" es de tipo texto"+tipo);
            }
        }

        return numNodos;
    }
}
