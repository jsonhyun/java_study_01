package kr.or.yi.java_study_01.ch05;
class Person1 {}
class Student1 extends Person1 {}
class Researcher1 extends Person1 {}
class Professor1 extends Researcher1 {}

public class InstanceOfEx2 {
	static void print(Person1 p) {
		if(p instanceof Person1) {
			System.out.print("Person ");
		}
		if(p instanceof Student1) {
			System.out.print("Student ");
		}
		if(p instanceof Researcher1) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor1) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> \t");print(new Student1());
		System.out.print("new Researcher() ->\t");print(new Researcher1());
		System.out.print("new Professor() ->\t");print(new Professor1());
	}

}
