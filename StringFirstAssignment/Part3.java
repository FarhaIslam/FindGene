

public class Part3
{
    public boolean twoOccurrence(String stringa , String stringb) {
    
        int currIndex = 0 , count = 0;
        int l= stringa.length();
        currIndex = stringb.indexOf(stringa , currIndex );
         while(true){
    
             if(currIndex != -1){
                 count = count + 1;
             if(count == 2)
                 return true;
        
        
            }
            else
                return false;  
            
                currIndex = stringb.indexOf(stringa , currIndex + l);
         
            }
       
       } 
    
    public String lastPart(String stringa , String stringb){
      int l = stringb.length();
      int k = stringa.length();
      int currIndex = 0;
      currIndex = stringb.indexOf(stringa , currIndex);
      if(currIndex == -1){
         return stringb;
        
        }
      String s = stringb.substring(currIndex + k , l);
      return s;
    
    
    }   
    
    void testing(){
           
        String stringa = "by";
        String stringb = "A shorty by abby long";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrence(stringa , stringb)){
           System.out.println(twoOccurrence(stringa , stringb));
        
        }
        else
           System.out.println(twoOccurrence(stringa , stringb));
        
        stringa = "abc";
        stringb = "abcdefghab";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrence(stringa , stringb)){
           System.out.println(twoOccurrence(stringa , stringb));
        
        }
        else
           System.out.println(twoOccurrence(stringa , stringb));
        
        /*stringa = "an";
        stringb = "banana";
        System.out.println(stringa);
        System.out.println(stringb);
        System.out.println(lastPart(stringa , stringb));
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println(stringa);
        System.out.println(stringb);
        System.out.println(lastPart(stringa , stringb));*/
           
    }
        
  
    
    
    
    
    
    
    
    
}
