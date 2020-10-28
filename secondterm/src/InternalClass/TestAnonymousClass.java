package InternalClass;

public class TestAnonymousClass {
    public static void main(String[] args) {
        new Phone() {
            @Override
            public void netbrowering() {
                this.setBrand("小米手机" );
                System.out.println(this.getBrand() + "正在上网，浏览学校网站" );
            }
        }.netbrowering();
        System.out.println(new Phone() {
            @Override
            public void netbrowering() {
                this.setBrand("vivo手机" );
                System.out.println(this.getBrand() + "正在上网，浏览学校网站" );
            }
            public int getMenSize(){
                this.setBrand("vivo手机" );
                System.out.print(this.getBrand()+"有内存（G）：");
                return 8;
            }
        }.getMenSize());

        new Network(){
            String brand="华为";
            @Override
            public void netbrowering(){
                System.out.println(this.brand+"正在愉快上网");
            }
        }.netbrowering();
    }
}
