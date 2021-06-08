package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ModificandoDOM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("Biblioteca.xml"));

            Node root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            //Creación elementos
            Element newLibro = doc.createElement("libro");
            Element titulo = doc.createElement("titulo");
            Element autor = doc.createElement("autor");
            Element editorial = doc.createElement("editorial");
            Element paginas = doc.createElement("paginas");
            Element origen = doc.createElement("origen");
            origen.setTextContent("España");

            System.out.println("Introduzca datos de libro titulo, autor, editorial,paginas, en ese orden");
            String tittle = sc.nextLine();
            String au = sc.nextLine();
            String edit = sc.nextLine();
            Integer pag = sc.nextInt();

            titulo.setTextContent(tittle);
            autor.setTextContent(au);
            editorial.setTextContent(edit);
            paginas.setTextContent(Integer.toString(pag));

            newLibro.appendChild(titulo);
            newLibro.appendChild(autor);
            newLibro.appendChild(editorial);
            newLibro.appendChild(paginas);
            newLibro.appendChild(origen);


            for (int i = 0; i < nl.getLength() ; i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    Element org = doc.createElement("origen");
                    org.setTextContent("España");
                    e.appendChild(org);
                }
            }

            root.appendChild(newLibro);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource domOrigen = new DOMSource(root);
            StreamResult destino = new StreamResult("ejercicio2.xml");

            transformer.transform(domOrigen,destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
