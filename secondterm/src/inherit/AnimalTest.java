package inherit;

public class AnimalTest {
    public static void main(String[] args) {
        Goat goat=new Goat("山羊");
        goat.Animal();
        goat.Eat();
        goat.Run();

        Wolf wolf=new Wolf("狼群");
        wolf.Animal();
        wolf.Eat();
        wolf.Run();
    }
}
