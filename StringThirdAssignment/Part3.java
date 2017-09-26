
import edu.duke.*;

public class Part3
{
    float cgRatio(String dna){
         int count =0;
         for(int i = 0; i != dna.length(); i++){
            if(dna.charAt(i) == 'G' || dna.charAt(i) == 'C')
               count = count + 1;
            
            }
    
            return (float)count/dna.length();
       }
    
    int findStopCodon(String dna , int startIndex , String stopCodon){
    
         int endIndex = startIndex;
          while(endIndex != -1){
           
           endIndex = dna.indexOf(stopCodon ,endIndex + 1);
           
           if(endIndex != -1 && (endIndex - startIndex) % 3 ==0){
            
               return endIndex;
            
              }
        
        
         }
      
        return dna.length();
    
      }
    
    StorageResource getAllGenes(String dna){
      
        StorageResource store = new StorageResource();
        String gene = "";
        int count = 1;
        int startIndex = 0;
        int index = -1;
        do{
         
            startIndex = dna.indexOf("ATG",index + 1);
            if(startIndex == -1)
                 break;
           
            index = findStopCodon(dna , startIndex ,"TAA");
            if(index == dna.length()){
            
                 index = findStopCodon(dna , startIndex , "TAG");
            
              }
            if(index == dna.length())
                 break;
            gene = dna.substring(startIndex , index + 3);
            store.add(gene);
    
            }while(gene != "");
     
         return store;
    
      } 
      
      void processGenes(StorageResource sr){
   
         int countGreaterThanLength = 9;
         int countCgRatio = 0;
         String longest = "";
         boolean printed;
         for(String s : sr.data()){
      
            printed  = false;
         if(longest.length() < s.length())
             longest = s;
         if(cgRatio(s) > 0.35){
             countCgRatio = countCgRatio + 1;
             System.out.println(s);
             if(s.length() > 9)
                 printed = true;
    
          }
         if(s.length() > 9){
            countGreaterThanLength = countGreaterThanLength + 1;
            if(!printed)
               System.out.println(s);
            
            }
       }
    
    }
    
    void testprocessGenes(){
 
        String dna = "ATGCAATGA";
        StorageResource sr = getAllGenes(dna);
        processGenes(sr);
        sr.clear();
        
        
        dna = "ATGCAGTACCCAATAATTGGCATTAA";
        sr = getAllGenes(dna);
        processGenes(sr);
        sr.clear();
        
        dna = "ATGAGTGAATAGCATAGCCAAATAGGGTAGACGTAA";
        sr = getAllGenes(dna);
        processGenes(sr);
        sr.clear();
        
        dna = "ATGGAAAGTAATTCGCATGATAAAAACCGAGGGAGTTGCTAA";
        sr = getAllGenes(dna);
        processGenes(sr);
        sr.clear();
        
        dna = "ATGGCATTTTGAAACGTTAGCAGATATTTTAAAATAA";
        sr = getAllGenes(dna);
        processGenes(sr);
        sr.clear();
       }

      
}
