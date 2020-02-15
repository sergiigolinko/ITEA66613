package les9;
@Blohable
public class FatCat extends Animal
{
    @LuckyCat(value = false)
    private boolean move;

    public FatCat(String name, String colour, int age,boolean move) {
        super(name, colour, age);
        this.move=move;
    }
    @Lapa()
    public boolean isMove(){
        return move;
    }
}
