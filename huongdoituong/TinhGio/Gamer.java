package self_study.huongdoituong.TinhGio;

import java.time.Duration;
import java.time.LocalTime;

public class Gamer implements Comparable<Gamer> {
    private String ma, ten;
    private Duration duration;
    private long hour;
    private long minute;

    public Gamer(String ma, String ten, String in_time, String out_time) {
        this.ma = ma;
        this.ten = ten;
        LocalTime in = LocalTime.parse(in_time);
        LocalTime out = LocalTime.parse(out_time);
        this.duration = Duration.between(in,out);
        this.hour = Duration.between(in,out).toMinutes()/60;
        this.minute = Duration.between(in,out).toMinutes()%60;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+hour+" "+" gio"+" "+minute+" "+" phut";
    }


    @Override
    public int compareTo(Gamer o) {
        return this.duration.compareTo(o.duration);
    }
}
