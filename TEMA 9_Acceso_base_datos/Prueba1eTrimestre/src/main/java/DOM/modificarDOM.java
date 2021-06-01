package DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class modificarDOM {

    {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("algo.xml");

            //Cojo el elemento de raiz
            Element root = doc.getDocumentElement();

            //Obtengo las etiquetas hijas del elmento raiz
            NodeList nl = root.getChildNodes();

            //Recorremos las etiquetas hijas

            for (int i = 0; i < nl.getLength() ; i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
