

public class Part1
{
  int findStopCodon(String DNA , int startIndex , String stopCodon){
    
       int endIndex = startIndex;
       while(endIndex != -1){
           
           endIndex = DNA.indexOf(stopCodon ,endIndex + 1);
           
           if(endIndex != -1 && (endIndex - startIndex) % 3 ==0){
            
               return endIndex;
            
              }
          }
        
      return DNA.length();  
    
     }
  
  void findAllGenes(String DNA){
       String gene = "";
       int count = 1;
       int startIndex = 0;
       int index = -1;
       do{
          startIndex = DNA.indexOf("ATG",index + 1);
         if(startIndex == -1)
             break;
           
         index = findStopCodon(DNA , startIndex ,"TAA");
         if(index == DNA.length()){
            
             index = findStopCodon(DNA , startIndex , "TAG");
            }
         if(index == DNA.length())
             break;
         gene = DNA.substring(startIndex , index + 3);
         System.out.println("Gene " + ":" + gene);
          
        }while(gene != "");
    
     }
  
  void testFindStopCodon(){
    
     String DNA = "ATAATAAAATAATAAATAAATAGATTAGAATGTAG";
     System.out.println("DNA :" + DNA);
     findAllGenes(DNA);
     System.out.println("DNA :" + DNA);
     DNA = "GATCGATAGACTGATAGGGGATGCAGTATATCCCTGGATACAATAGACGCACAGGTTGGAATCC";
     findAllGenes(DNA);
    
    }
    
  String findGene(String DNA){
      
        int startIndex = DNA.indexOf("ATG");
        
        if(startIndex == -1)
             return "";
        
        int index = findStopCodon(DNA , startIndex , "TAA");
        if(index == DNA.length()){
             index = findStopCodon(DNA , startIndex , "TAG");
            }
        if(index == DNA.length()) 
             return "";
        else
             return DNA.substring(startIndex , index + 3);
    
    }
  
    void testFindGene(){
    
        String DNA = "ATACGATATTATACCCGAGAT";
        System.out.println("DNA :" + DNA);
        System.out.println("Gene :" + findGene(DNA));
        
        DNA = "ATACGATATTATAACCCGAGAT";
        System.out.println("DNA :" + DNA);
        System.out.println("Gene :" + findGene(DNA));
        
        DNA = "ATGACGATATAATATAACCCGAGAT";
        System.out.println("DNA :" + DNA);
        System.out.println("Gene :" + findGene(DNA));
        
        DNA = "ATGACGATAGTAATATAACCCGAGAT";
        System.out.println("DNA :" + DNA);
        System.out.println("Gene :" + findGene(DNA));
        
        DNA = "ATGACGATAGTAATAAGTCCCTAGGAGAT";
        System.out.println("DNA :" + DNA);
        System.out.println("Gene :" + findGene(DNA));
    }
     
    
}   
    
    
    


  
    
    
