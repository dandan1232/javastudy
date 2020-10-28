package Printer;

public class TestPrinter {
    public static void main(String[] args) {
        InkBox inkBox=null;
        Paper paper=null;
  Printer printer=new Printer();

  //A4+彩色墨盒打印
        inkBox=new ColorInkBox();
        paper=new A4Paper();
        printer.setInkbox(inkBox);
        printer.setPaper(paper);
        printer.print("2020年3月23日，是爱小伟的一天");

        //B5+彩色墨盒打印
        inkBox=new ColorInkBox();
        paper=new B5Paper();
        printer.setInkbox(inkBox);
        printer.setPaper(paper);
        printer.print("2020年3月23日，是爱小伟的一天");

        //A4+黑白墨盒打印
        inkBox=new GrayInkBox();
        paper=new A4Paper();
        printer.setInkbox(inkBox);
        printer.setPaper(paper);
        printer.print("2020年3月23日，是爱小伟的一天");
    }
}
