package less11sax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start");
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End");
        super.endDocument();
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String value="";
        for (int i = start; i <start+length ; i++) {
            value+=ch[i];

        }
        value=value.trim();
        if (value.length()>0){
            System.out.println(value);
        }
    }

}
