package my.lab3_4;

import java.util.Scanner;

import my.symb.*;
import my.word.*;

public class StringTask {
	public static void main(String[] args){
		String str = "";
		Scanner scan = new Scanner(System.in);
		Symbol symb = new Symbol();
		Word word = new Word();
		System.out.println("Input number of words = ");
		int m = scan.nextInt();
		Word[] words = new Word[m];
		
		for(int i = 0; i < m; i++){
			words[i] = new Word();
		System.out.println("Input size of " + (i+1) + " word = ");
		int size = scan.nextInt();
		while(size > 0){
			size--;
		System.out.println("Input symbol = ");
		
		char inputSymb = scan.next(".").charAt(0);
		symb.setChar(inputSymb);
		words[i].addSymbol(symb.getChar());
		}
		System.out.println("Word " + (i+1) + " = " + words[i].toString());
		}
		
		for(int i = 0; i < m; i++){
			str += words[i].getWord() + " ";
		}
		System.out.println("String = " + str);
		
		System.out.println("Words " + "< " + words[1].toString() + " and " + 
				words[0].toString() + " > " +
				" are equals? " + words[0].equals(words[1]));
		
	}
}
