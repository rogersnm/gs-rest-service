package hello;

import java.util.Arrays;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Word;



@RestController
public class WordController 
{

	boolean palindrome=false;
	boolean anagram=false;
	
	@GetMapping(path = "words/{word}")
    public Word getProduct(@PathVariable(name = "word") String word) 
	{
	
		if(word!=null)
		{
			 palindrome=isPalindrome(word);
			 anagram=isAnagramOfPalindrome(word);
			
			Word w=new Word();
			w.setWord(word);
			w.setPalindrome(palindrome);
			w.setAnagramOfPalindrome(anagram);
			
			 return w;
		
		}
		return null;
	}
	private boolean isPalindrome(String word) 
	{
		 int length = word.length();
	     String reverse="";
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + word.charAt(i);
	         
	      if (word.equals(reverse))
	    	  return true;
	      else
	    	  return false;
	}
	
	private static boolean isAnagramOfPalindrome(String word) {
		int oddOccur = 0;
		int[] count = new int[256];
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			count[ch]++;
		}
		
		for(int cnt : count)
		{
			if(oddOccur > 1)
			{
				return false;
			}
			if(cnt%2 == 1)
			{
				oddOccur++;
			}
		}
		return true;
	}

