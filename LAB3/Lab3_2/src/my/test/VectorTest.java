package my.test;

import java.util.Scanner;
import my.lab3_2.*;


public class VectorTest {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input size of class Vector = ");
		int n = scan.nextInt();
		System.out.print("Input size of VectorArray = ");
		int m = scan.nextInt();
		
		Vector[] vectors = new Vector[m];
		
		for(int i = 0; i < m; i++){
			int[] array = new int[n];
			for(int j = 0; j < n; j++){
				System.out.print("Input " + (j+1) + " number of Vector " + (i+1) + " = ");
				int temp = scan.nextInt();
				array[j] = temp;
			}
			vectors[i] = new Vector(array);
		}
		for(int i = 0; i < m-1; i++){
			for(int j = i; j < m-1; j++){
		 System.out.println(vectors[i].toString() + " +  " +
                 vectors[j+1].toString() + " =  " + 
                 vectors[i].addition(vectors[j+1]).toString());

		 System.out.println(vectors[i].toString() + " -  " + 
				 vectors[j+1].toString() + " =  " + 
				 vectors[i].sub(vectors[j+1]).toString());

		 System.out.println(vectors[i].toString() + " *  " + 
				 vectors[j+1].toString() + " =  " + 
				 vectors[i].multiply(vectors[j+1]).toString());
		 
		 System.out.println("Increment of the vector ( " + vectors[i].toString() + " ) = "
                 + vectors[i].inc());
		 
		 System.out.println("Decrement of the vector ( " + vectors[i].toString() + " ) = "
                 + vectors[i].dec());

		 System.out.println("Scalar multiply (" + vectors[i].toString() + ") and ( " + 
				 					   vectors[j+1].toString() + ") = " + 
				 					  vectors[i].scalarMultiply(vectors[j+1]));

		 System.out.println("Length of the vector ( " + vectors[i].toString() + " ) = "
                                      + vectors[i].length());
		 
		 System.out.println("Length of the vector ( " + vectors[j+1].toString() + " ) = "
                 + vectors[j+1].length());

		 System.out.println("The angle between (" + vectors[i].toString() + ") and ( " + 
				 					   vectors[j+1].toString() + ") =  " + 
                                       vectors[i].angle(vectors[j+1]));
			}
		}
		
	}

}
