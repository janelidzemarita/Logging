package Figure;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.System.out;

public class XMLFiles {

    public static void createXMLCircle(String args){

        XMLOutputFactory output = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();

        // StAX Iterator API
        XMLEventWriter writer = null;
        try {
            writer = output.createXMLEventWriter(out);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        XMLEvent event = eventFactory.createStartDocument();

        try (FileInputStream inStrm = new FileInputStream(args);
             BufferedInputStream bf = new BufferedInputStream(inStrm);
             BufferedReader read = new BufferedReader(new InputStreamReader(bf, StandardCharsets.UTF_8))) {

            writer.add(event);
            writer.add(eventFactory.createStartElement("", "", "Triangles"));
            writer.add(eventFactory.createComment("These is The Triangles Radius List"));

            writer.add(eventFactory.createStartElement("", "", "Radius"));
            while (read.ready()) {
                String str = read.readLine() + "\n";
                writer.add(eventFactory.createCharacters(str));
            }
            writer.add(eventFactory.createEndDocument());
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        out.println("Done creating XML File For Circle");
    }

    public static void createXMLRectangle(String args) {
        try (FileInputStream inStrm = new FileInputStream(args);
             BufferedInputStream bf = new BufferedInputStream(inStrm);
             BufferedReader read = new BufferedReader(new InputStreamReader(bf, StandardCharsets.UTF_8))
        ) {


            while (read.ready()) {
                String[] str = read.readLine().split("-");
                String str1 = str[0] + "\n";
                String str2 = str[1] + "\n";

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("Not Done creating XML File For Rectangle");
    }

    public static void createXMLTriangle(String args) {
        XMLOutputFactory output = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("src/main/java/XML_Files/outputTriangle.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // StAX Iterator API
        XMLEventWriter writer = null;
        try {
            writer = output.createXMLEventWriter(file);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        XMLEvent event = eventFactory.createStartDocument();

        try (FileInputStream inStrm = new FileInputStream(args);
             BufferedInputStream bf = new BufferedInputStream(inStrm);
             BufferedReader read = new BufferedReader(new InputStreamReader(bf, StandardCharsets.UTF_8))) {

            writer.add(event);
            writer.add(eventFactory.createStartElement("", "", "Triangles"));
            writer.add(eventFactory.createComment("These is The Triangles Side List"));

            while (read.ready()) {
                String[] str = read.readLine().split("-") ;
                String str1 = str[0] + "\n";
                String str2 = str[1] + "\n";
                String str3 = str[2] + "\n";
                writer.add(eventFactory.createStartElement("", "", "AB"));
                writer.add(eventFactory.createCharacters(str1));
                writer.add(eventFactory.createStartElement("", "", "BC"));
                writer.add(eventFactory.createCharacters(str2));
                writer.add(eventFactory.createStartElement("", "", "CA"));
                writer.add(eventFactory.createCharacters(str3));

            }
            writer.add(eventFactory.createEndDocument());
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        out.println("Done creating XML File For Triangle");
    }
}
