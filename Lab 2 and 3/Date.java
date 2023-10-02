public class Date {
    private int date;
    private int month;
    private int year;
    Date(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public String toString(){
        String dateDetail = String.format("%d\\%d\\%d",date,month,year);
        return dateDetail;
    }
    public Date isRecent(Date d1, Date d2) {
        if (d1.getDate() > d2.getDate())
            return d1;
        else return d2;
    }

}
