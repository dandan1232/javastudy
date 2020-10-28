package InternalClass;

public class TestFileWorks {
    public static void main(String[] args) {
        new FileWorks(){
            @Override
            public void boom() {
                this.setMethod("40响炮仗");
                System.out.println(this.getMethod()+"正在燃放");
            }
        }.boom();
        System.out.println(new FileWorks(){
            @Override
            public void boom() {
                this.setMethod("50响炮竹");
                System.out.println(this.getMethod()+"正在燃放,");
            }
            public int getcolor(){
                this.setMethod("50响炮竹");
                System.out.print(this.getMethod()+"绽放颜色种类为：");
                return 30;
            }
        }.getcolor());
        new File(){
            String method="200响炮竹";
            @Override
            public void boom() {
                System.out.println(this.method+"正在燃放");
            }

            @Override
            public boolean exists() {
                return false;
            }
        }.boom();
    }
}
