package les9;
@Blohable
public class HomelessCat extends Animal {
@LuckyCat
    private boolean happy;

    public HomelessCat(String name, String colour, int age,boolean happy) {
        super(name, colour, age);
        this.happy=happy;
    }
@Lapa(quantity = 3)
    public boolean isHappy(){
        return happy;
    }

}
