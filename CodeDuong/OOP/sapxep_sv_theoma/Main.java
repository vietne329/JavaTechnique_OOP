/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_sv_theoma;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Student> sv = new ArrayList<>();
        while(sc.hasNext()){
                Student stu = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                sv.add(stu) ;
                
        }
        
        Collections.sort(sv);
        
        for(int i = 0 ;i < sv.size() ; i++){
            System.out.println(sv.get(i));
        }
    }
}
