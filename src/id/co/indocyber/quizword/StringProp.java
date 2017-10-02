/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.quizword;

/**
 *
 * @author user
 */
public class StringProp {
    
    public static void main(String[] args) {
        
          String nama = "Matt Robinson";
//          System.out.println(nama.indexOf("o"));
//          System.out.println(nama.lastIndexOf("o"));
//          nama = nama.replace('i', '_');
//          System.out.println(nama);
          char[] vokal = {'a','i','u','e','o'};
          
          
          
          
          for (int i = 0; i < vokal.length; i++) { //looping cara simpel
              nama = nama.replace(vokal[i], '_');
            
        }
                    System.out.println(nama);

          
          
          
          
//          for (int i = 0; i < vokal.length; i++) { // looping cara hati-hati
//            if(nama.indexOf(vokal[i])== -1) {
//                
//            }
//            else {
//                int idx = nama.indexOf(vokal[i]);
//            }
//        }
          
//        String nama = "Matt Robinson";
//        char idx5 = nama.charAt(5);
//        System.out.println(idx5);
//        int uni5 = nama.codePointAt(5);
//        System.out.println("1");
//    
//        int a = 2;
//        char d = 10009;
//        System.out.println(Character.getNumericValue('a'));
    }
    
    
    
}
