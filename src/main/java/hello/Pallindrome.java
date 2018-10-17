package hello;


public class Pallindrome {

	private String word;
	private boolean palindrome;
	private boolean anagramOfPalindrome;
	
	


	public String getWord() {
		return word;
	}




	public void setWord(String word) {
		this.word = word;
	}




	public boolean isPalindrome() {
		return palindrome;
	}




	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}




	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}




	public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}




	public Pallindrome(String word, boolean pallindrom, boolean anagramOfPalindrome) {
		// TODO Auto-generated constructor stub
		this.word=word;
		this.palindrome=pallindrom;
		this.anagramOfPalindrome=anagramOfPalindrome;
	}

}
