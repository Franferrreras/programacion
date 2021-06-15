import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String etiquetaActual = "";
        String libroActual = "";
        String libroMenor = "";
        String otroLibro = "";
        String autroActual = "";
        int minPage = 0;
        int count = 0;
        boolean primerLibro = false;
        boolean esmenor = false;

        try {
            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xif.createXMLEventReader(new FileInputStream("Ejercicio2.xml"));

            System.out.println("Introduzca el autor");
            String au = sc.nextLine();

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement etiqueta = xmlEvent.asStartElement();

                    String nameTag = etiqueta.getName().getLocalPart();

                    switch (nameTag) {
                        case "libro":
                            etiquetaActual = "libro";
                            break;
                        case "titulo":
                            etiquetaActual = "titulo";
                            break;
                        case "autor":
                            etiquetaActual = "autor";
                            break;
                        case "editorial":
                            etiquetaActual = "editorial";
                            break;
                        case "paginas":
                            etiquetaActual = "paginas";
                            break;
                        case "origen":
                            etiquetaActual = "origen";
                            break;
                    }
                }

                if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();

                    switch (etiquetaActual) {
                        case "titulo":
                            libroActual += "titulo: "+texto.getData() + "\n";
                            break;
                        case "autor":
                            libroActual += "autor: "+texto.getData() + "\n";
                            if (texto.getData().equals(au)) {
                                count++;
                            }
                            autroActual = texto.getData();;
                            break;
                        case "editorial":
                            libroActual += "editorial: "+texto.getData() + "\n";
                            break;
                        case "paginas":
                            libroActual += "paginas: "+texto.getData() + "\n";
                            if (!primerLibro) {
                                minPage = Integer.parseInt(texto.getData());
                                primerLibro = true;
                            }

                            if (Integer.parseInt(texto.getData()) < minPage) {
                                minPage = Integer.parseInt(texto.getData());
                                esmenor = true;
                            }else {
                                esmenor = false;
                            }
                            break;
                        case "origen":
                            libroActual += "origen: "+texto.getData();
                            break;
                    }
                }

                if (xmlEvent.isEndElement()) {
                    EndElement endTag = xmlEvent.asEndElement();
                    if (endTag.getName().getLocalPart().equals("libro")) {
                        if (autroActual.equals(au)) {
                            otroLibro = libroActual;
                        }
                        if (esmenor) {
                            libroMenor = libroActual;
                        }
                        libroActual = "";
                    }
                    etiquetaActual = "";
                }
            }

            System.out.println("El libro con menos páginas es");
            System.out.println(libroMenor);
            System.out.println("______________________________");
            System.out.println("El autor indicado tiene "+count+" libros");
            System.out.println("______________________________");
            System.out.println(otroLibro);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
