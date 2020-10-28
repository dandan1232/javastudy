package Abnormal;

public class TestStockSpeException {
    public static void main(String[] args) {
        StockHolder sto = new StockHolder();
        try {
            sto.setSellPrize(200);
        } catch (StockSpeException st) {
            System.out.println("程序运行时发现异常，并成功捕获了！");
            st.printStackTrace();
        } finally {
            System.out.println("股票卖出过程到此结束。");
        }

    }
}
