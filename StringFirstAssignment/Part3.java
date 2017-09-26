

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
    
        
  
    
    
    
    
    
    
    
    
}
