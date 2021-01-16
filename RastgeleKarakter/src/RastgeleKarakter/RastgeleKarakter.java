package RastgeleKarakter;
import java.util.Scanner; 

public class RastgeleKarakter {
  
    Scanner reader = new Scanner(System.in);
    // <-----Ekrana Yazdırma Fonksiyonları----->
    
//Tek Harf Yazdırma
    public void ekranYazdirma(){
       System.out.println("Rastgele Harf: " + (char) harf() + "\n");
   }
   
    //Belirtilen Karakterler Arasındakileri Yazdırma
    public void aralikYazdirma(char[]dizi){
        for(int i=0;i<dizi.length;i++){
            System.out.print(dizi[i] + ",");
        }
       
   }
    
    
    //<------Ana Fonksiyonlar------>
    
// Tek Harf Verme 
   public int harf(){
         /*  int sonuc = 0;
        while(sonuc<65 || sonuc>122){
        long value = System.currentTimeMillis();
        String newValue = Long.toString(value);    
        String deger = newValue.substring(newValue.length() - 3);
        sonuc = Integer.parseInt(deger);
         }
        return sonuc;*/
        long zaman = System.nanoTime();
        long sonuc = 'A' + zaman % ('Z' - 'A' + 1);
        return (int)sonuc;    
    }
   
   // Belirli Sayıda Rastgele Karakter Verme
   public void sayiliharf(){       
       System.out.println("Kaç tane harf: ");
       int kacTane = reader.nextInt();
       int a = 0;
       char[] dizi = new char[kacTane];
       while (a!=kacTane){
          dizi[a]=(char)harf();
           a++;
       }
            for(int i=0;i<dizi.length;i++){
            System.out.print(dizi[i] + ",");
        }
          
   }
   
   // Belirtilen iki karakter arası fonksiyon
   public void belirtilenKarakter(){
             System.out.println("Harfleri giriniz: ");
              int x = reader.nextInt();
              int y = reader.nextInt();
              System.out.println("Kaç tane: ");
              int kacTane = reader.nextInt();
       
      char[] dizi = new char[kacTane];    
      int tut = 0;
       if(x<y){
           for(int i=0;i<kacTane;i++){             
               do{
                   tut=harf();                  
               } while(x>tut || y<tut);                
               dizi[i]=(char)tut;              
           }
       }
       if(x>y){
            for(int i=0;i<kacTane;i++){
             do{
                  tut=harf();
              }while(y>tut || x<tut);
              dizi[i]=(char)tut;              
           }
       }
       if(x==y){
           System.out.print("Değerleri farklı giriniz."); 
       }
       for(int i=0;i<dizi.length;i++){
            System.out.print(dizi[i] + ","+"\n");
        }
   }
   
   public void karakterlerBelli(){
         int kontrol = 0;
         int sayac = 0;
         int istenen = 0;
         boolean dongu = false;
       System.out.println("Kaç karakter giriceksiniz: ");
                  int kacTane = reader.nextInt();
                  char[] anaDizi = new char[kacTane];
                  int[] fark = new int[kacTane];
                  int[] yedekFark = new int[kacTane];
                  int rastgele = harf();
                  System.out.println(rastgele);  
       System.out.println("Karakterleri giriniz: ");        
                  for(int i=0;i<kacTane;i++){          
                       System.out.print(i+". karakter:");     
                      String x = reader.next();
                      anaDizi[i]= x.charAt(0);
                      fark[i] = rastgele - (int)anaDizi[i];
                       System.out.println();     
                  }
                  for(int a=0;a<kacTane;a++){
                      yedekFark[a]=fark[a];
                  }
                  kontrol = diziSiralama(fark);              
                  System.out.println(kontrol);  
                  while(dongu == false){
                      if(kontrol==(int)yedekFark[sayac]){
                          System.out.println(anaDizi[sayac]);
                          dongu = true;
                      }
                      else
                      sayac++;
                  }            
    }
   
     public int diziSiralama(int[]dizi){
       
       int gecici = 0;
    
       for (int i = 0; i < dizi.length; i++)
            {
                for (int t = 0; t < dizi.length; t++)
                {
                    if (dizi[t] < dizi[i])
                    { 
                        gecici = dizi[i];
                        dizi[i] =dizi[t];
                        dizi[t] = gecici;
                    }
                    
                }

            }
       return dizi[dizi.length-1];
   }
   }