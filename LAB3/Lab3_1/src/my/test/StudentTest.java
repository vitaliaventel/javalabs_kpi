package my.test;
import my.lab3_1.*;
import javax.swing.*;

public class StudentTest {
	public static void main(String[] args){
		
		Student[] students ={new Student(101, "Newvell", "Garry","Sergeevich", 1994, "G street", "543-43-43", "FASS", 4, "VA22"),
			new Student(102, "Borha", "Valeriy","Petrovich", 1994, "Yann street", "511-54-22", "FASS", 4, "VV22"),
			new Student(103, "Kovac", "Ladislaw","Andreevich", 1994, "Peremohi street", "533-13-87", "FASS", 4, "VA22"),
			new Student(1021, "Leshchenko", "Vtlc","Sergeevich", 1995, "G street", "543-43-43", "FIOT", 3, "VF33"),
			new Student(1023, "Borzi", "Gennadiy","Albertovich", 1996, "Yann street", "511-54-22", "FIOT", 2, "VF42"),
			new Student(1012, "Nolik", "Odin","Dva", 1996, "Yann street", "511-54-22", "FIOT", 2, "VF42"),
			new Student(1043, "Help", "Chemp","Andreevich", 1993, "Peremohi street", "533-13-87", "FASS", 5, "VA22"),
			new Student(1302, "Djaliv", "Valeriy","Petrovich", 1995, "Yann street", "511-54-22", "FASS", 3, "VV22"),
			new Student(1013, "Some", "Ladislaw","Andreevich", 1994, "Peremohi street", "533-13-87", "FASS", 4, "VA22"),
			new Student("Vitalich", "Papich", 1994,"VV22"),
		};
		
		String tempDepart = JOptionPane.showInputDialog( "Enter a depart FASS or FIOT: " );
		System.out.println("List of students " + tempDepart);		
		for(Student temp:students){
			if(tempDepart.equals(temp.getDepart())){
				System.out.println(temp);
			}
		}
		System.out.println();
		
		System.out.println("List of students for each depart and course.");
		for(int i = 1 ; i < 7; i++){
			System.out.println("Students of " + i + " course");
			for(Student temp:students){
				if(i == temp.getEdu()){
					System.out.println(temp);
				}
			}
		}
		System.out.println();
		
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog( "Enter a birthyear of students: " ));
		System.out.println("List of students birthYear is greater than " + birthYear);
		for(Student temp:students){
			if(birthYear < temp.getBirthYear()){
				System.out.println(temp);
			}
		}
		System.out.println();
		
		String tempGroup = JOptionPane.showInputDialog( "Enter a group name: " );
		System.out.println("List of students " + tempGroup);
		for(Student temp:students){
			if(tempGroup.equals(temp.getGroup())){
				System.out.println(temp);
			}
		}
		
		System.out.println("Mates this students? " + "\n" + students[0].toString() +
				"\n"+ students[4].toString() + "\n" + students[0].equals(students[4]));
	}

}
