package generice;

class ToyCat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToyCat(String name) {
        this.name = name;
    }

    public ToyCat() {
    }

    @Override
    public String toString() {
        return "玩具"+this.name;
    }
}
class cloth{
    @Override
    public String toString() {
        return "布";
    }
}

public class Box<T, M> {
    private T thing;
    private M madeof;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    public M getMadeof() {
        return madeof;
    }

    public void setMadeof(M madeof) {
        this.madeof = madeof;
    }

    public Box(T thing, M madeof) {
        this.thing = thing;
        this.madeof = madeof;
    }

    public Box() {

    }

    @Override
    public String toString() {
        return "装的是" + this.thing + "，是由" + this.madeof + "制成的。";
    }
}
