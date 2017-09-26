

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
            
                currIndex = stringb.indexOf(stringa , currIndex + 1);
         
            }
       
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
        
        stringa = "na";
        stringb = "banana";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrence(stringa , stringb)){
           System.out.println(twoOccurrence(stringa , stringb));
        
        }
        else
           System.out.println(twoOccurrence(stringa , stringb));
    
        stringa = "pp";
        stringb = "apple";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrence(stringa , stringb)){
           System.out.println(twoOccurrence(stringa , stringb));
        
        }
        else
           System.out.println(twoOccurrence(stringa , stringb));
    
           
           
    }
        
  
    
    
    
    
    
    
    
    
}
