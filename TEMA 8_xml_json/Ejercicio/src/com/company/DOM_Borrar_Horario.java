package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOM_Borrar_Horario {

    public static void main(String[] args) {
        {
            try {
                //Obtenemos la referencia al objeto Document
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();

                //Parseamos el documento XML para tenerlo en memoria cargado
                Document doc = db.parse(new File("newhorario.xml"));

                //Obtenemos el nodo raiz
                Element root = doc.getDocumentElement();

                //Nodo texto de salto de línea que utilizaremos posteriormente
                //Text saltoLinea = doc.createTextNode("\n");


                //Borrar elemento
                Element lunes = (Element) doc.getElementsByTagName("dia").item(0);
                root.removeChild(lunes);

                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();

                transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
                transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
                transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

                //Creación del origen DOMSource
                DOMSource orgienDOM = new DOMSource(root);

                //Creación del fichero que va a ser mi destino
                File destino = new File("newhorario.xml");
                StreamResult sr = new StreamResult(destino);

                //Hacemos la transformación que en nuestro caso es la escritura
                transformer.transform(orgienDOM,sr);



                //2 - Uso de appendChild()
                //Vamos a insertar un nuevo nodo Element persona

                //Creo la etiqueta hija nombre y le doy valor
                Element persona = doc.createElement("persona");
                persona.setAttribute("id","4");

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent("Chema Durán");

                Element edad = doc.createElement("edad");
                edad.setTextContent("50");

                persona.appendChild(nombre);
                persona.appendChild(edad);


                root.appendChild(persona);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
