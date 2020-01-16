package com.dhiren.time.paper;

public class NewsPaper {

    private double weekDayPrice;
    private double saturdayPrice;
    private double sundayPrice;

    public NewsPaper() {
    }

    public NewsPaper(double weekDayPrice, double saturdayPrice, double sundayPrice) {
        this.weekDayPrice = weekDayPrice;
        this.saturdayPrice = saturdayPrice;
        this.sundayPrice = sundayPrice;
    }

    public double getWeekDayPrice() {
        return weekDayPrice;
    }

    public void setWeekDayPrice(double weekDayPrice) {
        this.weekDayPrice = weekDayPrice;
    }

    public double getSaturdayPrice() {
        return saturdayPrice;
    }

    public void setSaturdayPrice(double saturdayPrice) {
        this.saturdayPrice = saturdayPrice;
    }

    public double getSundayPrice() {
        return sundayPrice;
    }

    public void setSundayPrice(double sundayPrice) {
        this.sundayPrice = sundayPrice;
    }
}
