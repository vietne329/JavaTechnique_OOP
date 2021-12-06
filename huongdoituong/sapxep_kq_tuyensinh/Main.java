package self_study.huongdoituong.sapxep_kq_tuyensinh;

import java.util. * ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<TuyenSinh> list = new ArrayList<>() ;
        
        while(n-- > 0){
            TuyenSinh ts = new TuyenSinh(sc.nextLine(), sc.nextLine(),
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())) ;
       
                    list.add(ts );
        }
        Collections.sort(list) ;
        
        for(TuyenSinh ts : list) {
            System.out.println(ts);
        }
    }
}