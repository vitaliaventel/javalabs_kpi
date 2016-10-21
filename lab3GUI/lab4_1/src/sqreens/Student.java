package sqreens;

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

	public Student() {

	}

	public Student(int id, String lastName, String firstName, String surName, int birthYear, String adress,
			String phoneNumber, String depart, int yearOfEdu, String group) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.surName = surName;
		this.birthYear = birthYear;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.depart = depart;
		this.yearOfEdu = yearOfEdu;
		this.group = group;
	}

	public Student(String lastName, String firstName, int birthYear, String adress, String phoneNumber, int yearOfEdu,
			String group) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.yearOfEdu = yearOfEdu;
		this.group = group;
	}

	public Student(String lastName, String firstName, int birthYear, String group) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.group = group;
	}

	public void setStuds(Student[] studs) {
		this.studs = studs;
	}

	public String getDepart() {
		return this.depart;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public String getGroup() {
		return this.group;
	}

	public int getEdu() {
		return this.yearOfEdu;
	}

	public Student[] checkDepart(String tempDepart) {
		Student[] stud = new Student[studs.length];
		for (int i = 0; i < studs.length; i++) {
			if (tempDepart.equals(studs[i].getDepart())) {
				stud[i] = studs[i];
			}
		}
		return stud;
	}

	public Student[] checkCourse(int yearEdu) {
		Student[] stud = new Student[studs.length];
		for (int i = 0; i < studs.length; i++) {
			if (yearEdu == studs[i].getEdu()) {
				stud[i] = studs[i];
			}
		}
		return stud;
	}

	public Student[] checkGroup(String tempGroup) {
		Student[] stud = new Student[studs.length];
		for (int i = 0; i < studs.length; i++) {
			if (tempGroup.equals(studs[i].getGroup())) {
				stud[i] = studs[i];
			}
		}
		return stud;
	}

	public Student[] checkBirthday(int birthYear) {
		Student[] stud = new Student[studs.length];
		for (int i = 0; i < studs.length; i++) {
			if (birthYear < studs[i].getBirthYear()) {
				stud[i] = studs[i];
			}
		}
		return stud;
	}

	@Override
	public String toString() {
		return "Student [ " + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", surName="
				+ surName + ", birthYear=" + birthYear + ", adress=" + adress + ", phoneNumber=" + phoneNumber
				+ ", depart=" + depart + ", yearOfEdu=" + yearOfEdu + ", group=" + group + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthYear != other.birthYear)
			return false;
		if (depart == null) {
			if (other.depart != null)
				return false;
		} else if (!depart.equals(other.depart))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (yearOfEdu != other.yearOfEdu)
			return false;
		return true;
	}
}
