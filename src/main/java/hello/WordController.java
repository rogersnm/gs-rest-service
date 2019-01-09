package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @GetMapping("words/{word}")
    public ResposeDTO checkWord(@PathVariable String word){
        ResposeDTO resposeDTO = new ResposeDTO();
        resposeDTO.setWord(word);
        if(isPalindrome(word)){
            resposeDTO.setAnagramOfPalindrome(true);
            resposeDTO.setPalindrome(true);
        }else {
            resposeDTO.setPalindrome(false);
            resposeDTO.setAnagramOfPalindrome(isAnagramOfPalindrome(word));
        }
        return resposeDTO;
    }

    private Boolean isPalindrome(String word){
        String reverse = "";
        int length = word.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + word.charAt(i);

        if (word.equals(reverse)){
            return true;
        }
        return false;
    }

    private Boolean isAnagramOfPalindrome(String word){
        int [] count = new int[256];
        for( int i = 0; i < word.length(); i++ )
        {
            char ch = word.charAt(i);
            count[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1) // more than 1 char should have odd frequency
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;

    }
}
