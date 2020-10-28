package Abnormal;

import java.util.Scanner;

public class StockHolder {
    private double sellPrize;
    double closePrize = 100;

    public double getSellPrize() {
        return sellPrize;
    }

    public void setSellPrize(double sellPrize) throws StockSpeException {
        if (sellPrize / closePrize > 0.1) {
            throw new StockSpeException();

        } else {
            this.sellPrize = sellPrize;
            System.out.println("股票卖出正常。");
        }

    }

    public StockHolder(double sellPrize) {
        this.sellPrize = sellPrize;
    }

    public StockHolder() {

    }
}
