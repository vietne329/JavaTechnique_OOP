
package Tinh_Gio;
import java.time.Duration;
import java.time.LocalTime;
import java.util.* ;

public class QuanNet  implements Comparable<QuanNet>{
   private final String id;
    private final String name;
    private final Duration duration;
    private final long hour;
    private final long minute;

    public QuanNet(String id, String name, String in ,String out) {
        this.id = id;
        this.name = name;
        LocalTime in1 = LocalTime.parse(in) ;
        LocalTime out1 = LocalTime.parse(out) ;
        this.duration = Duration.between(in1,out1);
        this.hour = Duration.between(in1,out1).toMinutes()/60;
        this.minute = Duration.between(in1,out1).toMinutes()%60;
    }
    
    @Override
    public String toString(){
        return id+" "+name+" "+hour+" "+" gio"+" "+minute+" "+" phut";
    }
    
    @Override
    public int compareTo(QuanNet o) {
       return this.duration.compareTo(o.duration) ;
    }
    
}
