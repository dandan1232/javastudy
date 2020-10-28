package inherit;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Cat("豆豆", 80, "折耳猫",70);
        Master mas = new Master("小林");
        Master.feed(pet);
        mas.playWith(pet);
    }
}
