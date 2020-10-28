package TaoBaoSystem;

public class Goods {
    private int No;
    private  int Number;
    private double weight;
    private String name;
    private double unitprice;
    static int num=0;
    static int num1=0;
    static int num2=0;
    private static double sum=0;
    static int[] goodsnum = new int[10];

    public Goods(int No,double weight,String name,double unitprice,int Number){
        this.No=No;
        this.weight=weight;
        this.name=name;
        this.unitprice=unitprice;
        this.Number=Number;
        num++;
    }

}
