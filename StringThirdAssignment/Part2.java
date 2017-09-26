

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
}
