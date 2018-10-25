package hello;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WordController 
{
        static int NO_OF_CHARS = 256; 

        @GetMapping("/words/{word}")
	public JsonWord CheckStringPlaindromeOrAnagramOfPalindorme(@PathVariable String word)
        {
          JsonWord jsonWord = new JsonWord();
          if(word != null)
          {
           Boolean checkPalindromeString = WordController.CheckStringPalindromeOrNot(word); 
           Boolean checkAnagramOfPalindromeString = WordController.canFormPalindrome(word); 
           if(checkPalindromeString)
           {
               jsonWord.setWord(word);
               jsonWord.setPalindrome(true);
               jsonWord.setAnagramOfPalindrome(true);
           }       
           else 
           {
               if(checkAnagramOfPalindromeString) 
               {
                 jsonWord.setWord(word);
                 jsonWord.setPalindrome(false);
                 jsonWord.setAnagramOfPalindrome(true);
               }
               else
               {
                 jsonWord.setWord(word);
                 jsonWord.setPalindrome(false);
                 jsonWord.setAnagramOfPalindrome(false);
               }     
           }
	   return studentService.retrieveCourse(studentId, courseId);

          }
          else
          {
           return new ResponseEntity<JsonWord>(HttpStatus.NOT_FOUND);
          }
           
	}

  
       public static boolean canFormPalindrome(String str) 
       { 
    

        int count[] = new int[NO_OF_CHARS]; 
   
        Arrays.fill(count, 0); 
  
    
         
        for (int i = 0; i < str.length(); i++) 
    
        {

          count[(int)(str.charAt(i))]++; 
    
        }

         // Count odd occurring characters 
    
        int odd = 0; 

        for (int i = 0; i < NO_OF_CHARS; i++) 
    
    { 
   
          if ((count[i] & 1) == 1) 
             odd++; 
  
    
           if (odd > 1) 
       
          return false; 
    
        } 
  
    
        // Return true if odd count is 0 or 1, 
 
         return true; 

       } 




      public static  boolean CheckStringPalindromeOrNot(String str)

      {
  
           String reverse = ""; // Objects of String class
      
     
     
           int length = str.length();
 
           //reverse  = str.reverse(); we can use string reverse()as well     
    
           for (int i = length - 1; i >= 0; i--)
         
             reverse = reverse + str.charAt(i);
         
     
              if (str.equals(reverse))
          
                return true;
        
                //System.out.println("The string is a palindrome.");
    
              else
         
                return false;
         
              //System.out.println("The string isn't a palindrome.");


             
       }


      public boolean isStringNull(String str)
      {
         if(str == null)
          return true;
      }

      public boolean isStringEmpty(String str)
      {
         if(str.equals(""))
          return true;
      }
    
      public boolean isSingleCharTest(String str)
      {
        if(!str.equals("") && str.length()==1)
          return true;
      }
}

