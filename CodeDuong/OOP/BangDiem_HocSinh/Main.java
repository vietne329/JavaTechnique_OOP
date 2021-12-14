package BangDiem_HocSinh;

import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
       ArrayList<HocSinh> hocsinh = new ArrayList<>() ;
       float[] mark = new float[10] ;
       
        int t = sc.nextInt();
       for(int i =1 ; i<= t ;i++){
           sc.nextLine();
            HocSinh item = new HocSinh(i, sc.nextLine());
   
            for(int  j = 0 ; j<10 ; j++)
                mark[j] = sc.nextFloat() ;
            
          item.setDiem(mark);

        hocsinh.add(item) ;
       }
       
       
       Collections.sort(hocsinh);
       
      for(HocSinh a : hocsinh){
          System.out.println(a);
      }
    }
}
