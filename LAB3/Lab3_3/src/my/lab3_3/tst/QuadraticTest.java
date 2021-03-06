package my.lab3_3.tst;

import my.lab3_3.*;

public class QuadraticTest {
	public static void main(String[] args){
		try{
		QuadraticEqu equ1 = new QuadraticEqu(1, 0, -1);
		System.out.println(equ1.toString() + equ1.firstRoot() + " " +
		equ1.secondRoot());
		QuadraticEqu equ2 = new QuadraticEqu(2, -3, 1);
		System.out.println(equ2.toString() + equ2.firstRoot() + " " +
				equ2.secondRoot());
		System.out.println("Let's check discriminants equals = " + equ1.equals(equ2));
		}
		catch(IllegalArgumentException e){
			System.out.println(" < A > must be greater than 0");
			throw e;
		}
		catch(ArithmeticException e){
			System.out.println("Unsolvable");
			throw e;
		}
	}	
}
