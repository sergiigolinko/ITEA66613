package les12;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "categories")
public class Categories {
List<Category> categoryList;

    public List<Category> getCategoryList() {
        return categoryList;
    }
@XmlElement(name = "category")
    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoryList=" + categoryList +
                '}';
    }
}
