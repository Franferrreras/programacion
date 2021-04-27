package com.company.Ejercicios;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonaSax extends DefaultHandler {

    public PersonaSax() {
        super();
    }

    //Handler para el evento comienzo de documento
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseado del documento entregable1920");
    }

    //Handler para el evento fin de documento

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del parseado del documento entregable1920.xml");
    }

    //Handler para el evento etiqueta de apertura

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        //Abro la etiqueta
        System.out.print("<"+qName);

        //Recorrer los atributos (SI tiene)
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength() ; i++) {
                System.out.println(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }

        //Cierro la etiqueta
        System.out.print(">");
    }

    //Handler para el eveneto Nodo de texto encontrado


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch,start,length);
        System.out.print(content);
    }
}
