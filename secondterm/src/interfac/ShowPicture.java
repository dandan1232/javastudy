package interfac;

public class ShowPicture extends Circle implements Picture {
    public ShowPicture(String brand) {
        super(brand);
    }

    public ShowPicture() {
    }


    @Override
    public void show() {
        System.out.println(this.getBrand()+"显示中。");
    }
}
