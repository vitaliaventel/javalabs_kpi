package my.lab2;

import javax.swing.*;
import my.lab1.*;

public class LabPrint{

	public static void main(String[] args){
		String s1 = JOptionPane.showInputDialog( "What you want to print 1?" );
		String s2 = JOptionPane.showInputDialog( "What you want to print 2?" );
		String s3 = JOptionPane.showInputDialog( "What you want to print 3?" );

		StringStorage lab = new StringStorage(s1,s2,s3);
		String[] mainString = lab.getStrArray();

		showNoNewLine(mainString);
		System.out.println();
		showNewLine(mainString);
	}

	private static void showNoNewLine(String[] array){
		for(int i=0;i<array.length;i++){
		System.out.print(array[i] + " ");
		}
	}

	private static void showNewLine(String[] array){
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
	}
}