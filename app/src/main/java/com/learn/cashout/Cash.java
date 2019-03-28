package com.learn.cashout;

public class Cash {
    int HundredBill;
    int FiftyBill;
    int TwentyBill;
    int TenBill;
    int FiveBill;
    int TwoDollar;
    int OneDollar;
    int Quarter;



    public int getHundredBill() {
        return HundredBill;
    }

    public void setHundredBill(int hundredBill) {
        HundredBill = hundredBill;
    }

    public int getHundredBillSum() {
        return  100 * getHundredBill();
    }

    public int getFiftyBill() {
        return FiftyBill;
    }

    public void setFiftyBill(int fiftyBill) {
        FiftyBill = fiftyBill;
    }

    public int getFiftyBillSum() {
        return  50 * getFiftyBill();
    }

    public int getTwentyBill() {
        return TwentyBill;
    }

    public void setTwentyBill(int twentyBill) {
        TwentyBill = twentyBill;
    }

    public int getTwentyBillSum() {
        return  20 * getTwentyBill();
    }

    public int getTenBill() {
        return TenBill;
    }

    public void setTenBill(int tenBill) {
        TenBill = tenBill;
    }

    public int getTenBillSum() {
        return  10 * getTenBill();
    }

    public int getFiveBill() {
        return FiveBill;
    }

    public void setFiveBill(int fiveBill) {
        FiveBill = fiveBill;
    }

    public int getFiveBillSum() {
        return  5 * getFiveBill();
    }

    public int getTwoDollar() {
        return TwoDollar;
    }

    public void setTwoDollar(int twoDollar) {
        TwoDollar = twoDollar;
    }

    public int getTwoDollarSum() {
        return  2 * getTwoDollar();
    }

    public int getOneDollar() {
        return OneDollar;
    }

    public void setOneDollar(int oneDollar) {
        OneDollar = oneDollar;
    }

    public int getOneDollarSum() {
        return  getOneDollar();
    }

    public int getQuarter() {
        return Quarter;
    }

    public void setQuarter(int quarter) {
        Quarter = quarter;
    }

    public double getQuarterSum() {
        return  0.25 * getQuarter();
    }

    public double getTotal() {return getHundredBillSum() + getFiftyBillSum() + getTwentyBillSum() +
    getTenBillSum() + getFiveBillSum() + getTwoDollarSum() + getOneDollarSum() + getQuarterSum();}

    public Cash(int hundredBill, int fiftyBill, int twentyBill, int tenBill, int fiveBill, int twoDollar, int oneDollar, int quarter) {
        HundredBill = hundredBill;
        FiftyBill = fiftyBill;
        TwentyBill = twentyBill;
        TenBill = tenBill;
        FiveBill = fiveBill;
        TwoDollar = twoDollar;
        OneDollar = oneDollar;
        Quarter = quarter;
    }


}
