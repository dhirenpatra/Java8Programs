package com.dhiren.time;

import com.dhiren.time.paper.*;

public enum AllPapers {

    TOI {
        public NewsPaper getNewsPaper() {
            return new TOI(3, 5, 6);
        }
    },
    HINDU {
        public NewsPaper getNewsPaper() {
            return new Hindu(2.5, 4, 4);
        }
    },
    ET {
        public NewsPaper getNewsPaper() {
            return new ET(2, 2, 10);
        }
    },
    BM {
        public NewsPaper getNewsPaper() {
            return new BM(1.5, 1.5, 1.5);
        }
    },
    HT {
        public NewsPaper getNewsPaper() {
            return new HT(2, 4, 4);
        }
    };

    public abstract NewsPaper getNewsPaper();

    public double getSaturdayRate() {
        return getNewsPaper().getSaturdayPrice();
    }

    public double getSundayRate() {
        return getNewsPaper().getSundayPrice();
    }

    public double getWeekdayRate() {
        return getNewsPaper().getWeekDayPrice();
    }

}
