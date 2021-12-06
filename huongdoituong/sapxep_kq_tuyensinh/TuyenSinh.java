package self_study.huongdoituong.sapxep_kq_tuyensinh;

public class TuyenSinh implements Comparable<TuyenSinh>{
    private String ma ;
    private String hoten ;
    private float uutien  ;
    private float total ;
    private String result ;

    public TuyenSinh(String ma, String hoten, float toan, float ly, float hoa ) {
        this.ma = ma;
        this.hoten = hoten;
        this.uutien = findBonus(ma);
        this.total = findScore(toan, ly, hoa);
        this.result = findResult(this.total);
    }
    
    private float findScore (float toan ,float ly ,float hoa ){
        return (toan *2 + ly + hoa +this.uutien) ;
    }
    
    private float findBonus(String id) {
        String tmp = id.substring(0,3);
        if(tmp.equals("KV1")){
               return 0.5f ;
        }else if(tmp.equals("KV2")){
            return 1.0f ;
            
        }else return 2.5f ;
         
    }
    
    
    private String findResult (float score){
        if(score >=24) {
            return "TRUNG TUYEN ";
        } return "TRUOT" ;
    }
    
    @Override 
    public String toString(){

        return ma+" "+hoten+" "+findRoundNumber(uutien)+" "+findRoundNumber(total)+" "+result ;
    }
    
     private String findRoundNumber(float score) {
        float roundNumber = Math.round(score * 10f) / 10f;
        int intNumber = (int) score;
        if (roundNumber == (float) intNumber) {
            return String.valueOf(intNumber);
        }
        return String.valueOf(roundNumber);
    }
    
    
    @Override
    public int compareTo(TuyenSinh o) {
        if(this.total == o.total){
            return this.ma.compareTo(o.ma) ;
        }
    
        return -Float.compare(this.total, o.total) ;
    }
 
    
    
}
