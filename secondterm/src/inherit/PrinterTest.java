package inherit;

public class PrinterTest {
    public static void main(String[] args) {
        Customer cus=new Customer();
        blackPrinter black=new blackPrinter();
        colorPrinter color=new colorPrinter();
        color3DPrinter color3D=new color3DPrinter();
        cus.submitPrintTask(black,"我爱黑白的世界");
        cus.submitPrintTask(color,"彩色的很好看");
        cus.submitPrintTask(color3D,"3D真tm帅");
    }
}
