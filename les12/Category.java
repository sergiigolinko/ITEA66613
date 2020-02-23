package les12;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "category")
public class Category {
private int id;
private String name;
private int parentId;

    public Category(int id, String name, int parentId) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Category(){
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getParentId() {
        return parentId;
    }
@XmlElement
    public void setId(int id) {
        this.id = id;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }
@XmlElement
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}

