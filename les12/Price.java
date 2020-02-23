package les12;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "price")
public class Price {
private String date;
private String firmName;
private int firmId;
private double rate;
List<Categories> categoriesList;
List<Items> itemsList;

    public Price(String date, String firmName, int firmId, double rate) {
        super();
        this.date = date;
        this.firmName = firmName;
        this.firmId = firmId;
        this.rate = rate;
    }

    public Price(){
        super();
    }

    public String getDate() {
        return date;
    }

    public String getFirmName() {
        return firmName;
    }

    public int getFirmId() {
        return firmId;
    }

    public double getRate() {
        return rate;
    }

    public List<Categories> getCategoriesList() {
        return categoriesList;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }
@XmlElement
    public void setDate(String date) {
        this.date = date;
    }
    @XmlElement
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }
    @XmlElement
    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }
    @XmlElement
    public void setRate(double rate) {
        this.rate = rate;
    }
    @XmlElement(name = "categories")
    public void setCategoriesList(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }
    @XmlElement(name = "items")
    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public String toString() {
        return "Price{" +
                "date='" + date + '\'' +
                ", firmName='" + firmName + '\'' +
                ", firmId=" + firmId +
                ", rate=" + rate +
                ", categoriesList=" + categoriesList +
                ", itemsList=" + itemsList +
                '}';
    }
}
