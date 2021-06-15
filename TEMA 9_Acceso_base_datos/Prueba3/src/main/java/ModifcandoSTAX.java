import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ModifcandoSTAX {

    public static void main(String[] args) {

        try {
            XMLOutputFactory xof = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xof.createXMLEventWriter(new FileOutputStream("Ejercicio2.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
