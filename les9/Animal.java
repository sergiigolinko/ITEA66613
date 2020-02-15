package les9;

public class Animal {
    private String name;
    private String colour;
    private int age;

    public Animal(String name,String colour,int age){
        this.name=name;
        this.colour=colour;
        this.age=age;
    }

    public void setName() {
        System.out.println("Name: "+name);;
    }

    public void setColour() {
        System.out.println("Colour: "+colour);;
    }

    public void setAge() {
        System.out.println("Age: "+age);;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
