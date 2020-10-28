package Abnormal;

public class StockSpeException extends Exception{
    public StockSpeException() {
        super("股票卖出不得超过涨停幅度");
    }
}
