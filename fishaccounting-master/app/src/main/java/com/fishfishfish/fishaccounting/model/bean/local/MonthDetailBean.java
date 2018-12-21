package com.fishfishfish.fishaccounting.model.bean.local;

import com.fishfishfish.fishaccounting.model.bean.BaseBean;

import java.util.List;

public class MonthDetailBean extends BaseBean {

    private String t_income;
    private String t_outcome;
    private List<DaylistBean> daylist;

    public String getT_income() {
        return t_income;
    }

    public void setT_income(String t_income) {
        this.t_income = t_income;
    }

    public String getT_outcome() {
        return t_outcome;
    }

    public void setT_outcome(String t_outcome) {
        this.t_outcome = t_outcome;
    }

    public List<DaylistBean> getDaylist() {
        return daylist;
    }

    public void setDaylist(List<DaylistBean> daylist) {
        this.daylist = daylist;
    }

    public static class DaylistBean {

        private String time;
        private String money;
        private List<FishBill> list;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public List<FishBill> getList() {
            return list;
        }

        public void setList(List<FishBill> list) {
            this.list = list;
        }
    }
}