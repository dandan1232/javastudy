package TaoBaoSystem;

public class GoodsSet {
    private static final int maxLen = 10;
    static int len = 0;
    private static Goods[] data = new Goods[maxLen];

    public static int getLen() {
        return len;
    }

    public static Goods[] getData() {
        return data;


    }
}
