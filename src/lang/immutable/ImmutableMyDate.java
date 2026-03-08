package lang.immutable;

// 불변 클래스 만들기.
public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day){
        this.year = year;
        this.month=month;
        this.day=day;
    }

    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear,month,day);
    }

    //public void setYear(int year){}

    @Override
    public String toString(){
        return year + "-" +month + "-" + day;
    }
}
