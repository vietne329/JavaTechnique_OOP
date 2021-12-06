package self_study.huongdoituong.DanhSachKhacHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,gioitinh,diachi;
    Date ngaysinh;

    public KhachHang(int ma, String ten, String gioitinh,String ngaysinh, String diachi) throws ParseException {
        this.ma = "KH"+String.format("%03d",ma);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }

    private String chuanhoa(String s) {
        StringTokenizer st =new StringTokenizer(s) ;
        StringBuilder kq = new StringBuilder() ;
        while(st.hasMoreTokens()){
            String tmp = st.nextToken() ;
            kq.append(Character.toUpperCase(tmp.charAt(0))) ;
            for(int i = 1; i<tmp.length();i++) {
                kq.append(Character.toLowerCase(tmp.charAt(i))) ;
            }
            kq.append(" ") ;
        }

        return kq.toString().trim() ;
    }

    @Override
    public String toString() {
        return ma+" "+chuanhoa(this.ten)+" "+diachi+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh);
    }


    @Override
    public int compareTo(KhachHang o) {
        return this.ngaysinh.compareTo(o.ngaysinh);
    }
}
