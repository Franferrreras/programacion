package com.company.Ejercicios;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class RecorrerSax {

    public static void main(String[] args) {


        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            //Obtenemos la clase que hemos creado para manejar los eventos en los que estamos interesados
            //Debe implementar los métodos de los interfaces que estime
            DefaultHandler personaSax = new PersonaSax();

            //Lanzo el parseado del fichero con nuestro manejador como un argumento
            saxParser.parse(new File("entregable1920.xml"),personaSax);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
