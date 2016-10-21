package ui.second;

import javax.swing.*;

public class ForArray{

	private int size;
	private int[] sourceArray;

	public void setSize(int N){
		size=N;
	}

	public void setArray(int[] array){
		sourceArray = array;
	}

	public int[] parity(){
		int[] parityArray = new int[size];
		for (int i=0;i<sourceArray.length;i++){
		if(sourceArray[i]%2==0){
		parityArray[i]=sourceArray[i];
		  }
		}
		return parityArray;	
	}

	public int[] nonParity(){
		int[] nonParityArray = new int[size];
		for (int i=0;i<sourceArray.length;i++){
		if(sourceArray[i]%2!=0){
		nonParityArray[i]=sourceArray[i];
		  }
		}
		return nonParityArray;		
	}

}