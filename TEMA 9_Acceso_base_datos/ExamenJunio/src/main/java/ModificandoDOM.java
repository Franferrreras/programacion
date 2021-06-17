import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificandoDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("Eurocopa.xml");

            Node root = doc.getDocumentElement();

            Element partido = doc.createElement("partido");
            Element local = doc.createElement("local");
            Element visitante = doc.createElement("visitante");
            Element goles_local = doc.createElement("goles_local");
            Element goles_visitante = doc.createElement("goles_visitante");

            local.setTextContent("Francia");
            visitante.setTextContent("Italia");
            goles_local.setTextContent("3");
            goles_visitante.setTextContent("2");

            partido.appendChild(local);
            partido.appendChild(visitante);
            partido.appendChild(goles_local);
            partido.appendChild(goles_visitante);

            root.appendChild(partido);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            File ejercicio1 = new File("ejercicio1.xml");
            StreamResult destino = new StreamResult(ejercicio1);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
