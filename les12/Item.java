package les12;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item {
    private int id;
    private int categoryId;
    private String code;
    private String barCode;
    private String vendor;
    private String name;
    private String description;
    private String url;
    private String image;
    private int priceRUAH;
    private int priceRUSD;
    private String stock;
    private int guarantee;
    private String country;
    private String originality;
    private int condition;
    private int custom;

    public Item(int id, int categoryId, String code, String barCode, String vendor, String name, String description,
                String url, String image, int priceRUAH, int priceRUSD, String stock, int guarantee, String country,
                String originality, int condition, int custom) {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.code = code;
        this.barCode = barCode;
        this.vendor = vendor;
        this.name = name;
        this.description = description;
        this.url = url;
        this.image = image;
        this.priceRUAH = priceRUAH;
        this.priceRUSD = priceRUSD;
        this.stock = stock;
        this.guarantee = guarantee;
        this.country = country;
        this.originality = originality;
        this.condition = condition;
        this.custom = custom;
    }

    public Item(){
        super();
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCode() {
        return code;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public int getPriceRUAH() {
        return priceRUAH;
    }

    public int getPriceRUSD() {
        return priceRUSD;
    }

    public String getStock() {
        return stock;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public String getCountry() {
        return country;
    }

    public String getOriginality() {
        return originality;
    }

    public int getCondition() {
        return condition;
    }

    public int getCustom() {
        return custom;
    }
@XmlElement
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    @XmlElement
    public void setCode(String code) {
        this.code = code;
    }
    @XmlElement
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    @XmlElement
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }
    @XmlElement
    public void setUrl(String url) {
        this.url = url;
    }
    @XmlElement
    public void setImage(String image) {
        this.image = image;
    }
    @XmlElement
    public void setPriceRUAH(int priceRUAH) {
        this.priceRUAH = priceRUAH;
    }
    @XmlElement
    public void setPriceRUSD(int priceRUSD) {
        this.priceRUSD = priceRUSD;
    }
    @XmlElement
    public void setStock(String stock) {
        this.stock = stock;
    }
    @XmlElement
    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
    @XmlElement
    public void setCountry(String country) {
        this.country = country;
    }
    @XmlElement
    public void setOriginality(String originality) {
        this.originality = originality;
    }
    @XmlElement
    public void setCondition(int condition) {
        this.condition = condition;
    }
    @XmlElement
    public void setCustom(int custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", code='" + code + '\'' +
                ", barCode='" + barCode + '\'' +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", priceRUAH=" + priceRUAH +
                ", priceRUSD=" + priceRUSD +
                ", stock='" + stock + '\'' +
                ", guarantee=" + guarantee +
                ", country='" + country + '\'' +
                ", originality='" + originality + '\'' +
                ", condition=" + condition +
                ", custom=" + custom +
                '}';
    }
}
