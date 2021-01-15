/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testodev;
import java.util.Scanner; 
/**
 *
 * @author W
 */
public class TestOdev {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        RastgeleKarakter.RastgeleKarakter r = new RastgeleKarakter.RastgeleKarakter();
        
        
        int deneme = r.harf();
      
        while(true){
             
              int x =0;
              Scanner reader = new Scanner(System.in);  // Reading from System.in
              System.out.println("Gerçekleştirmek istediğiniz işlem: ");
              x = reader.nextInt();
              
              //Rastgele tek karakter
              if(x==1){
              r.ekranYazdirma();
              }
             
              //Belirli sayıda karakter veren
              if(x==2){
              r.sayiliharf();
              }
              
              // Girilen iki karakter arasında belirtilen sayıda karakter
              if(x==3){
             r.belirtilenKarakter();
              }
              
              //Belirtilen karakteler arasından belirtilen sayıda karakter 
              if(x==4){
               
              r.karakterlerBelli();
                  
              }
        }
        
    }
   
    
}