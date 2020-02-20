package less11sax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxParserMain {
    public static void main(String[] args) {
        SAXParserFactory factory=SAXParserFactory.newInstance();
        try {
            SAXParser parser=factory.newSAXParser();
            DefaultHandler handler=new SaxParser();
            try {
                parser.parse("pom.xml",handler);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        DefaultHandler handler=new SaxParser();
    }
}
