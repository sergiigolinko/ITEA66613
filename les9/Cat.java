package les9;
//@Blohable
public class Cat extends Animal {
    @LuckyCat(value = false)
    private boolean hungry;

    public Cat(String name, String colour, int age,boolean hungry) {
        super(name, colour, age);
        this.hungry=hungry;
    }
@Lapa
    public boolean isHungry(){
        return hungry;
    }


}
