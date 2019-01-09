package hello;

public class ResposeDTO {

    private String word;
    private Boolean palindrome;
    private Boolean anagramOfPalindrome;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Boolean getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(Boolean palindrome) {
        this.palindrome = palindrome;
    }

    public Boolean getAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

    public void setAnagramOfPalindrome(Boolean anagramOfPalindrome) {
        this.anagramOfPalindrome = anagramOfPalindrome;
    }
}
