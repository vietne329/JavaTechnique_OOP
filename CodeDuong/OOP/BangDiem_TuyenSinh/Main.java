/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiem_TuyenSinh;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<TuyenSinh> list = new ArrayList<>();
        while(n-->0){
            TuyenSinh ts = new TuyenSinh(scanner.nextLine(), scanner.nextLine(),
                    Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()),
                    Float.parseFloat(scanner.nextLine()));
            list.add(ts);
        }
        for(TuyenSinh ts: list){
            System.out.println(ts.toString());
        }
    }
}
