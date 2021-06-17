import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoSTAX {

    public static void main(String[] args) {
        try {
            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xif.createXMLEventReader(new FileInputStream("ejercicio1.xml"));

            String tagActual = "";
            String equipoActual = "";
            String equipoMostar = "";
            int goles_local = 0;
            int goles_visitante = 0;

            System.out.println("\n"+"___________Los partidos en los que el equipo local gana son____________"+"\n");
            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement etiqueta = xmlEvent.asStartElement();
                    String etiquetaName = etiqueta.getName().getLocalPart();

                    switch (etiquetaName) {
                        case "partido":
                            tagActual = "partido";
                            break;
                        case "local":
                            tagActual = "local";
                            break;
                        case "visitante":
                            tagActual = "visitante";
                            break;
                        case "goles_local":
                            tagActual = "goles_local";
                            break;
                        case "goles_visitante":
                            tagActual = "goles_visitante";
                            break;
                    }
                }
                if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();

                    switch (tagActual) {
                        case "local":
                            equipoActual += "local: "+texto.getData()+"\n";
                            break;
                        case "visitante":
                            equipoActual += "visitante: "+texto.getData()+"\n";
                            break;
                        case "goles_local":
                            equipoActual += "goles_local: "+texto.getData()+"\n";
                            goles_local = Integer.parseInt(texto.getData());
                            break;
                        case "goles_visitante":
                            equipoActual += "goles_visitante: "+texto.getData()+"\n";
                            goles_visitante = Integer.parseInt(texto.getData());
                            break;
                    }

                }
                if (xmlEvent.isEndElement()) {
                    EndElement endTag = xmlEvent.asEndElement();

                    if (endTag.getName().getLocalPart().equals("partido")) {
                        if (goles_local > goles_visitante) {
                            equipoMostar = equipoActual;
                            System.out.println(equipoMostar);
                        }
                        equipoActual = "";

                    }
                    tagActual = "";
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
