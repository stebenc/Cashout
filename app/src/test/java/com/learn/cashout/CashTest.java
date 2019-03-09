package com.learn.cashout;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashTest {

    @Test
    public void getHundredBill() {
        Cash cash = new Cash(300,0,0,0,0,0,0,0);
            assertEquals(300, cash.getHundredBill());

    }

    @Test
    public void setHundredBill() {

    }

    @Test
    public void getFiftyBill() {
    }

    @Test
    public void setFiftyBill() {
    }

    @Test
    public void getTwentyBill() {
    }

    @Test
    public void setTwentyBill() {
    }

    @Test
    public void getTenBill() {
    }

    @Test
    public void setTenBill() {
    }

    @Test
    public void getFiveBill() {
    }

    @Test
    public void setFiveBill() {
    }

    @Test
    public void getTwoDollar() {
    }

    @Test
    public void setTwoDollar() {
    }

    @Test
    public void getOneDollar() {
    }

    @Test
    public void setOneDollar() {
    }

    @Test
    public void getQuarter() {
    }

    @Test
    public void setQuarter() {
    }

    @Test
    public void getHundredBillSum() {
        Cash cash = new Cash(3,0,0,0,0,0,0,0);
        assertEquals(300, cash.getHundredBillSum());
    }

    @Test
    public void getFiftyBillSum() {
        Cash cash = new Cash(0,7,0,0,0,0,0,0);
        assertEquals(350, cash.getFiftyBillSum());
    }

    @Test
    public void getTwentyBillSum() {
        Cash cash = new Cash(0,0,13,0,0,0,0,0);
        assertEquals(260, cash.getTwentyBillSum());
    }

    @Test
    public void getTenBillSum() {
        Cash cash = new Cash(0,0,0,63,0,0,0,0);
        assertEquals(630, cash.getTenBillSum());
    }

    @Test
    public void getFiveBillSum() {
        Cash cash = new Cash(0,0,0,0,63,0,0,0);
        assertEquals(315, cash.getFiveBillSum());
    }

    @Test
    public void getTwoDollarSum() {
        Cash cash = new Cash(0,0,0,0,0,56,0,0);
        assertEquals(112, cash.getTwoDollarSum());
    }

    @Test
    public void getOneDollarSum() {
        Cash cash = new Cash(0,0,0,0,0,0,86,0);
        assertEquals(86, cash.getOneDollarSum());
    }

    @Test
    public void getQuarterSum() {
        Cash cash = new Cash(0,0,0,0,0,0,0,91);
        assertEquals(22.75, cash.getQuarterSum(), 0.1);
    }
}