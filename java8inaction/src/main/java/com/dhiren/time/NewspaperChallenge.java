package com.dhiren.time;

import com.dhiren.time.paper.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class NewspaperChallenge {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("+05:30")));
        calendar.set(2020, 0, 1);

        Month month = Month.of(LocalDate.now().getMonthValue());
        int totalDays = month.maxLength();

        calculateCostInEnumListOfPapers(month,totalDays);
        calculateCostInStringListOfPapers(month,totalDays);

    }

    private static void calculateCostInStringListOfPapers(Month month , int totalDays) {
        double cost = 0;
        List<String> paperList = List.of("TOI", "Hindu", "ET", "BM", "HT");
        cost = getSubscriptionCostV2(paperList, month, totalDays, cost);
        System.out.println("Cost of all \"TOI\", \"Hindu\", \"ET\", \"BM\", \"HT\" is : " +cost);
    }

    private static void calculateCostInEnumListOfPapers(Month month , int totalDays) {
        double cost = 0;
        List<AllPapers> papers = List.of(AllPapers.TOI, AllPapers.BM);
        cost = getSubscriptionCost(papers, month, totalDays, cost);
        System.out.println("Cost of all \"TOI\", \"BM\" is : " +cost);
    }

    private static double getSubscriptionCost(List<AllPapers> papers, Month month, int totalDays, double cost) {

        for (int start = 1; start <= totalDays; start++) {
            for (AllPapers paper : papers) {
                LocalDate date = LocalDate.of(2020, month, start);
                DayOfWeek dayOfWeek = DayOfWeek.from(date.getDayOfWeek());
                if (paper.getNewsPaper() instanceof TOI) {
                    cost = getCost(cost, dayOfWeek, AllPapers.TOI);
                } else if (paper.getNewsPaper() instanceof Hindu) {
                    cost = getCost(cost, dayOfWeek, AllPapers.HINDU);
                } else if (paper.getNewsPaper() instanceof ET) {
                    cost = getCost(cost, dayOfWeek, AllPapers.ET);
                } else if (paper.getNewsPaper() instanceof BM) {
                    cost = getCost(cost, dayOfWeek, AllPapers.BM);
                } else if (paper.getNewsPaper() instanceof HT) {
                    cost = getCost(cost, dayOfWeek, AllPapers.HT);
                }
            }
        }
        return cost;
    }

    private static double getSubscriptionCostV2(List<String> papers, Month month, int totalDays, double cost) {
        for (int start = 1; start <= totalDays; start++) {
            for (String paper : papers) {
                LocalDate date = LocalDate.of(2020, month, start);
                DayOfWeek dayOfWeek1 = DayOfWeek.from(date.getDayOfWeek());
                if (paper.equalsIgnoreCase("toi")) {
                    cost = getCost(cost, dayOfWeek1, AllPapers.TOI);
                } else if (paper.equalsIgnoreCase("hindu")) {
                    cost = getCost(cost, dayOfWeek1, AllPapers.HINDU);
                } else if (paper.equalsIgnoreCase("et")) {
                    cost = getCost(cost, dayOfWeek1, AllPapers.ET);
                } else if (paper.equalsIgnoreCase("bm")) {
                    cost = getCost(cost, dayOfWeek1, AllPapers.BM);
                } else if (paper.equalsIgnoreCase("ht")) {
                    cost = getCost(cost, dayOfWeek1, AllPapers.HT);
                }
            }
        }
        return cost;
    }

    private static double getCost(double cost, DayOfWeek dayOfWeek1, AllPapers papers) {
        switch (dayOfWeek1) {
            case SATURDAY:
                cost = cost + papers.getNewsPaper().getSaturdayPrice();
                break;
            case SUNDAY:
                cost = cost + papers.getNewsPaper().getSundayPrice();
                break;
            default:
                cost = cost + papers.getNewsPaper().getWeekDayPrice();
                break;
        }
        return cost;
    }
}
