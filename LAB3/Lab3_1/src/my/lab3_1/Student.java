package my.lab3_1;

import my.test.*;

public class Student {
	private Student[] studs;
	
	private int id;
	private String lastName;
	private String firstName;
	private String surName;
	private int birthYear;
	private String adress;
	private String phoneNumber;
	private String depart;
	private int yearOfEdu;
	private String group;

	public Student(int id, String lastName, String firstName,
			String surName, int birthYear, String adress, String phoneNumber,
			String depart, int yearOfEdu, String group){
		this.id=id;
		this.lastName=lastName;
		this.firstName=firstName;
		this.surName=surName;
		this.birthYear=birthYear;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.depart=depart;
		this.yearOfEdu=yearOfEdu;
		this.group=group;
	}
	
	public Student(String lastName, String firstName,
			int birthYear, String adress, String phoneNumber,
			 int yearOfEdu, String group){
		this.lastName=lastName;
		this.firstName=firstName;
		this.birthYear=birthYear;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.yearOfEdu=yearOfEdu;
		this.group=group;
	}
	
	public Student(String lastName, String firstName,
			int birthYear, String group){
		this.lastName=lastName;
		this.firstName=firstName;
		this.birthYear=birthYear;
		this.group=group;
	}
	
	public String getDepart(){
		return this.depart;
	}
	
	public int getBirthYear(){
		return this.birthYear;
	}
	
	public String getGroup(){
		return this.group;
	}
	
	public int getEdu(){
		return this.yearOfEdu;
	}
	
	
	
	public String toString(){
		return (" Student [ id = " + id + ", lastName = " + lastName + ", firstName = " +
	            firstName + ", birthYear = " + birthYear + ", depart= " + depart + ", yearOfEdu = " +
				yearOfEdu + ", group= " + group + " ] ");
	}
	
    public boolean equals(Object obj) {
        if (obj instanceof Student)
       	 return (this.getEdu() == ((Student) obj).getEdu() &&
       	  this.getGroup() == ((Student) obj).getGroup());
        return false;
    }
}
