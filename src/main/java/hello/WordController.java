package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
    
    @RequestMapping(value="/words/{word}", method = RequestMethod.GET)
    public Pallindrome testPallin(
            @PathVariable("word") String word){
             
        
        String  reverse = ""; // Objects of String class
        
        boolean palindrome=false, anagramOfPalindrome=false;
     
      int length = word.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + word.charAt(i);
         
      if (word.equals(reverse)){
         palindrome=true; 
          anagramOfPalindrome=true;
      }
      
        
        if(palindrome==false){
        
            final int NO_OF_CHARS = 256; 
              // Create a count array and initialize 
             // all values as 0 
             int[] count = new int[NO_OF_CHARS]; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (int i = 0; i < word.length(); i++) 
            count[word.charAt(i)]++; 
  
        // Count odd occurring characters 
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if ((count[i] & 1) != 0) 
                odd++; 
  
            if (odd > 1) 
                anagramOfPalindrome= false; 
        } 
  
        // anagramOfPallindrom is true if odd count is 0 or 1, 
        if (odd == 1  || odd==0) 
        anagramOfPalindrome= true; 
            
        }
        
        Pallindrome p=new Pallindrome(word, palindrome, anagramOfPalindrome);
        return p;

        
      
    }
}
