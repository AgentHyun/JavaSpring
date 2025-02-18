package com.puft.feb122.score;

public class Score {
    private String s_name;
    private int s_year;
    private int s_month;
    private int s_date;

    public Score() {}

    public Score(String s_name, int s_year, int s_month, int s_date) {
        this.s_name = s_name;
        this.s_year = s_year;
        this.s_month = s_month;
        this.s_date = s_date;
    }

    public String getS_name() { return s_name; }
    public void setS_name(String s_name) { this.s_name = s_name; }

    public int getS_year() { return s_year; }
    public void setS_year(int s_year) { this.s_year = s_year; }

    public int getS_month() { return s_month; }
    public void setS_month(int s_month) { this.s_month = s_month; }

    public int getS_date() { return s_date; }
    public void setS_date(int s_date) { this.s_date = s_date; }

    @Override
    public String toString() {
        return "Score { " +
               "s_name='" + s_name + '\'' +
               ", s_year=" + s_year +
               ", s_month=" + s_month +
               ", s_date=" + s_date +
               " }";
    }
}
