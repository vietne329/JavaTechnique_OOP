/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_sv_theolop;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<Student> list = new ArrayList<>() ;
        
        for(int i = 0 ; i < n ; i++){
        
            Student sv = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()) ;
            list.add(sv);
        }
        Collections.sort(list);

      for(Student s : list){
          System.out.println(s);
      }
    }
}
