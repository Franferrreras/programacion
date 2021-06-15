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
import java.io.IOException;
import java.util.Scanner;

public class ModificandoDOM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("biblioteca.xml"));

            Node root = doc.getDocumentElement();

            NodeList nl = root.getChildNodes();



            Element libro = doc.createElement("libro");
            Element titulo = doc.createElement("titulo");
            Element autor = doc.createElement("autor");
            Element editorial = doc.createElement("editorial");
            Element paginas = doc.createElement("paginas");


            System.out.println("Introduzca un nuevo libro | titulo, autor, editorial, paginas");
            String title = sc.nextLine();
            String aut = sc.nextLine();
            String edit = sc.nextLine();
            String page = sc.nextLine();

            titulo.setTextContent(title);
            autor.setTextContent(aut);
            editorial.setTextContent(edit);
            paginas.setTextContent(page);

            libro.appendChild(titulo);
            libro.appendChild(autor);
            libro.appendChild(editorial);
            libro.appendChild(paginas);

            root.appendChild(libro);


            for (int i = 0; i < nl.getLength() ; i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    Element origen = doc.createElement("origen");
                    origen.setTextContent("Espania");

                    if (e.getTagName().equals("libro")) {
                        e.appendChild(origen);
                    }
                }
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            File ejercicio2 = new File("Ejercicio2.xml");
            StreamResult destino = new StreamResult(ejercicio2);

            transformer.transform(origenDOM,destino);


        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }

}
