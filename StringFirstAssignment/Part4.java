import edu.duke.*;

public class Part4
{
 public void checkYoutube(){
    
    URLResource res = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    for(String s : res.words()){
    
     s = s.toLowerCase();
     int index = s.indexOf("youtube.com");
     
     if(index != -1){
        
        index = s.indexOf("\"");
        int endIndex = s.indexOf("\"" , index + 1);
        System.out.println(s.substring(index + 1 , endIndex));
           }
    
       }
    
    
   }
}
