

public class Part2
{

   float cgRatio(String dna){
         int count =0;
         for(int i = 0; i != dna.length(); i++){
            if(dna.charAt(i) == 'G' || dna.charAt(i) == 'C')
               count = count + 1;
            
            }
    
            return (float)count/dna.length();
     }
    
   void testcgRatio(){
    
      String dna = "ATGCCATAG";
      System.out.println(cgRatio(dna));
    
    
     }
     
   int  countCTG(String dna){
    
       int count = 0;
       int index = -1;
       do{
    
          index = dna.indexOf("CTG", index + 1);
          if(index != -1)
               count = count + 1;
     
          }while(index != -1);
    
         return count;
    
     } 
    
    
   void testCountCTG(){
    
      String dna = "CTGCTGCTGAATCGTCTG";
      System.out.println(countCTG(dna));
      
      dna = "AATAATAATTAAGATCTATCGA";
      System.out.println(countCTG(dna));
    
    
     }   

}
