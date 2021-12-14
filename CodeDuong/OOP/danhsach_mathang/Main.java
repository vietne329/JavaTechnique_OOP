/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_mathang;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        ArrayList<Product> list =new ArrayList<>();
        
        for(int i =1;i<t+1;i++){
            
            sc.nextLine();
            Product p =new Product(i,sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()) ;
            list.add(p) ;
        }
        
        Collections.sort(list);
        
        for(Product p :list){
            System.out.println(p);
        }
    }
}
