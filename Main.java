//Nama   : Dyah Putri Maheswari
//NIM    : 2105551102
//Matkul : Pemrograman Berbasis Obyek

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  

class Main {
public static void main(String[] args) {
  //PENGGUNAAN LIST
      System.out.println("Penggunaan List");  
      List buah = new ArrayList();  
      buah.add("Mangga");  
      buah.add("Apel");  
      buah.add("Apel");   
      for(int i = 0; i < buah.size(); ++i){  
        System.out.println("\tIndeks "+ i +" = " + buah.get(i));  
      }      
  //PENGGUNAAN SET
      System.out.println("\nPenggunaan Set");  
      Set bulan = new HashSet();          
      bulan.add("Januari");  
      bulan.add("Februari");  
      bulan.add("Februari");    
      bulan.add("Maret");
      Object [] arrFromSet = bulan.toArray();  
      for(int i = 0; i < arrFromSet.length; ++i){  
        System.out.println("\tBulan " + arrFromSet[i]);  
      }  
  //PENGGUNAAN MAP
      System.out.println("\nPenggunaan Map");  
      Map hari = new HashMap();      
      hari.put(0, "Senin");  
      hari.put(1, "Selasa x");  
      hari.put(1, "Selasa");   
      hari.put(2, "Rabu");
      for(int i = 0; i < hari.size(); ++i){  
        System.out.println( "\tIndeks " + i + " = Hari " + hari.get(i));  
      }  
    }
}