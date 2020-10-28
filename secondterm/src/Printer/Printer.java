package Printer;


public class Printer {
    private InkBox inkbox=null;
    private Paper paper=null;

    public void setInkbox(InkBox inkbox) {
        this.inkbox = inkbox;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Printer(InkBox inkbox, Paper paper) {
        this.inkbox = inkbox;
        this.paper = paper;
    }
    public Printer(){

    }
    public void print(String content){
        System.out.println("打印机正在使用("+
                inkbox.getInkBox()+","
                +paper.getPaper()+")打印,内容为："+"["+content+"]。");
        System.out.println("--------------------------------");
    }
}
