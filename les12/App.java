package les12;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
PriceMapper mapper=new PriceMapper();
Price price=(Price) mapper.getObject(new File("src/price.xml"),Price.class);
        System.out.println(price);
    }
}
