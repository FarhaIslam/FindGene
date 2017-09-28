import edu.duke.*;

public class Part4
{
 public void checkYoutube(){
    
    URLResource res = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    for(String s : res.words()){
     String sCopy = s; 
     s = s.toLowerCase();
     int index = s.indexOf("youtube.com");
     
     if(index != -1){
        
        index = s.indexOf("\"");
        int endIndex = s.indexOf("\"" , index + 1);
        System.out.println(s.substring(index + 1 , endIndex));
        
        
        int startIndex = s.lastIndexOf("\"" , index - 1);
        index = s.indexOf("\"" , index);
        System.out.println(sCopy.substring(startIndex + 1 , index));
        
           }
    
       }
    
    
   }
}
