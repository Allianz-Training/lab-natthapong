package com.b.helloWorld;

public class Lab8to11_date23_11_2020 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		varType();
		bark();
		primitive();
		unary();
		System.out.println("-----------Lab3-----------");
		andOr();
		System.out.println("-----------Lab4-----------");
		ifElseScore(0, false);
		System.out.println("-----------Lab5-----------");
		switchCaseGrade();
		System.out.println("-----------Lab6-----------");
		whileLoop();
		System.out.println("-----------Lab8-----------");
		lab8BreakFor();
		System.out.println("-----------Lab9-----------");
		lab9ContinueFor();
		System.out.println("-----------Lab10-----------");
		lab10Continue2();
		System.out.println("-----------Lab11-----------");
		int a = lab11Return(999);
		System.out.println(a);
		System.out.println(lab11Return(998));
		lab11NoReturn(123);

	}

	public static void varType() {
//		System.out.println("This shouldn't show in Console");
		/*
		 * System.out.println("This shouldn't show in Console too");
		 * System.out.println("This shouldn't show in Console too");
		 */
		String i = "str";
		int j = 1;
		Boolean k = !false;
		double l = 1.1d;
		long m = 99999999;

		System.out.println("This is a String " + i);
		System.out.println("This is an Integer " + j);
		System.out.println("This is a Boolean " + k);
		System.out.println("This is a Double " + l);
		System.out.println("This is a Long " + m);
	}

	public static void bark() {
		String dogName = "doge";
		System.out.println("The dog name = '" + dogName + "' bark");
	}

	// cast
	public static void primitive() {
		float f = 1.1f;
		int i = 1;
		double d = 1.1d;
		char c = '7';

		int newF = (int) f;
		float newI = i;
		float newD = (float) d;
		int newC = c;

		System.out.println("Before = " + f + " , " + i + " , " + d + " , " + c);
		System.out.println("After  = " + newF + " , " + newI + " , " + newD + " , " + newC);
	}

	public static void unary() {
		int i = 20;
		System.out.println(i);
		System.out.println(i++);
		System.out.println("Times = 1 , " + i);
		System.out.println(i++);
		System.out.println("Times = 2 , " + i);
		System.out.println(i++);
		System.out.println("Times = 3 , " + i);
		System.out.println(i++);
		System.out.println("Times = 4 , " + i);
		System.out.println(i++);
		System.out.println("Times = 5 , " + i);
		System.out.println("-------------------");
		System.out.println(--i);
		System.out.println("Times = 1 , " + i);
		System.out.println(--i);
		System.out.println("Times = 2 , " + i);
		System.out.println(--i);
		System.out.println("Times = 3 , " + i);
		System.out.println(--i);
		System.out.println("Times = 4 , " + i);
		System.out.println(--i);
		System.out.println("Times = 5 , " + i);
	}

	public static void andOr() {
//		System.out.println(5.0f && 5.5f);
//		System.out.println('c' || 'b');
	}

	public static void ifElseScore(int score, boolean isHandSome) {
//		int score = 79;
//		Boolean isHandSome = false;
		if (score >= 80 || isHandSome == true) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("normal");
		} else {
			System.out.println("Fail");
		}
	}

	public static void switchCaseGrade() {
		int score = 70;
		String grade;
		switch (score) {
		case 80:
			grade = "A";
			break;
		case 70:
			grade = "B";
			break;
		case 60:
			grade = "C";
			break;
		case 50:
			grade = "D";
			break;
		case 40:
			grade = "F";
			break;
		default:
			grade = "E";
			break;
		}
		System.out.println(grade);
	}

	public static void whileLoop() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println("i " + i);
			sum += i;
			i++;
		}
		System.out.println("ii " + sum);
		int j = 1;
		while (j <= 100) {
			if (j % 12 == 0) {
				System.out.println("iii " + j);
			}
			j++;
		}
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int k : arr) {
			System.out.println("iiii " + k);
		}
	}

	public static void lab8BreakFor() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println(11);
				break;
			}
			System.out.println(count + "Not11");
		}
	}

	public static void lab9ContinueFor() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println(11);
				continue;
			}
			System.out.println(count + "Not11");
		}
	}

	public static void lab10Continue2() {
		for (int count = 1; count <= 10; count++) {
			if (count == 2) {
				continue;
			}
			System.out.println(count);
		}
	}

	public static int lab11Return(int integer) {
		return integer;
	}

	public static void lab11NoReturn(int integer) {
		System.out.println(integer);
	}
}