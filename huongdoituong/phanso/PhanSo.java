package self_study.huongdoituong.phanso;

public class PhanSo {
    private long tuso;
    private long mauso;

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    @Override
    public String toString() {
        return tuso+"/"+mauso;
    }

    public void rutGon(){
        long x = usc(tuso,mauso);
        tuso /= x;
        mauso /= x;

    }

    private long usc(long a,long b){
        long t;
        while(b > 0){
            t = a % b;
            a = b; b = t;
        }
        return a;
    }
}
