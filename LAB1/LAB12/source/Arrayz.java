package ui.first;

import javax.swing.*;
import ui.second.*;


public class Arrayz{

	public static void main(String[] args){

		String input = JOptionPane.showInputDialog( "Enter size of array?" );
		int N = Integer.parseInt(input);
		int[] mainArray = new int[N];
		
		System.out.print("Source array: ");
		mainArray = inputArray(N);

		System.out.println();

		ForArray ob1 = new ForArray();

		ob1.setSize(N);
		ob1.setArray(mainArray);

		System.out.print("Parity: ");
		show(ob1.parity());
		System.out.println();
		System.out.print("Nonparity: ");
		show(ob1.nonParity());

	}

	private static int[] inputArray(int size){
		int[] mainArray = new int[size];
		for(int i=0;i<size;i++){
		String str = JOptionPane.showInputDialog( "Enter a number "+(i+1));
		int num = Integer.parseInt(str);
		mainArray[i] = num;
		System.out.print(num + " ");
		}
		return mainArray;
	}

	private static void show(int[] array){
		for (int i=0;i<array.length;i++){
		if(array[i]==0)
		continue;
		else{
		System.out.print(array[i]+" ");
		 }
		}	
	}
}
