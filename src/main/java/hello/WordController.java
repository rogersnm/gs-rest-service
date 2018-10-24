package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fn.pojo.Response;

@RestController
public class WordController {

	@RequestMapping(value="word/{word}")
	public HashMap<String,String> checkPalindrome(@PathVariable String word)
	{
	HashMap<String,String>HM=new HashMap<>();
		Response res=new Response();
		HM.put("word", word);
		if(checkPalindromeString(word))
			HM.put("palindrome","true");
			else if(!checkPalindromeString(word))
				HM.put("palindrome","false");
		if(checkAnagramOfPalindrome(word))
			HM.put("anagramOfPalindrome","true");
			else if(!checkPalindromeString(word))
				HM.put("anagramOfPalindrome","false");		
		return HM;
		
	}
	private boolean checkPalindromeString(String word)
	{
		char[] str=word.toCharArray();
		boolean out=false;
		for(int i=0;i<str.length-1;i++)
		{
		if(str[i]==str[str.length-i-1])
		{out=true;
			continue;
		}
		else
		{
			out=false;
			break;
		}
		}
		return out;
		
	}
	private boolean checkAnagramOfPalindrome(String word)
	{
		
		boolean out=false;
		int diffChar=0;
		char[] str=word.toCharArray();
		for(int i=0;i<str.length-1;i++)
		{
			char ch=str[i];
			CharSequence chs=new StringBuilder(ch);
			if(word.substring(i).contains(chs))
			{
				out=true;
				continue;
			}
			else if(!word.substring(i).contains(chs))
			{
				if(diffChar==0)
				{
					out=true;
					diffChar=1;
					continue;
				}
				else 
				{
					out=false;
					break;
				}
			}
		}
		return out;
	}
}

