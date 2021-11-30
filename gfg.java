import java.util.*;
import java.util.stream.*;
  
public class GFG {
  
    
    public static <T> T
    firstElementInStream(Stream<T> stream)
    {
        T first_element
            = stream
  
                  // reduce() method reduces the Stream
                  // to a single element, which is first.
                  .reduce((first, second) -> first)
  
                  // if stream is empty
                  // null is returned
                  .orElse(null);
  
        return first_element;
    }
  
    
    public static void main(String[] args)
    {
  
        Stream<String> stream
            = Stream.of("Geek_First", "Geek_2",
                        "Geek_3", "Geek_4",
                        "Geek_Last");
  
        
        System.out.println(
            "First Element: "
            + firstElementInStream(stream));
    }
}