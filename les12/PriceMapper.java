package les12;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class PriceMapper {
public Object getObject(File file,Class clazz){
Object object=null;
    try {
        JAXBContext context=JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        object=unmarshaller.unmarshal(file);
    } catch (JAXBException e) {
        e.printStackTrace();
    }
    return object;

}
}
