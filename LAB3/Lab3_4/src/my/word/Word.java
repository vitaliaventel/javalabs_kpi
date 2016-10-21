package my.word;

import java.util.ArrayList;

public class Word {
	private ArrayList<Character> word = new ArrayList<>();
	
	public String getWord(){
		String word = "";
		for (char item : this.word){
			word += item;
		}
		return word;
	}
	
	public void addSymbol(char symb){
		this.word.add(symb);
	}
	
	public String toString(){
		String wordresult = "";
		for (char item : this.word) {
			wordresult += item;
		}
		return wordresult;
	}
	
    public boolean equals(Object obj) {
    if (obj instanceof Word)
       	 return (this.word.size() == ((Word) obj).word.size());
        return false;
    }

 }
