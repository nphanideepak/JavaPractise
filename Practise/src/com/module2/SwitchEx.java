package com.module2;

public class SwitchEx {
	public static void main(String[] args) {
		grading('A');
		grading('B');
		
		/*
		 * grading('C'); grading('F');
		 */
	}

	public static void grading(char grade) {
		switch (grade) {
		case 'A':
			int success;
			System.out.println("A Grade");
			success = 1;
			break;
		case 'B':
			System.out.println("B Grade");
			success = 1;
			break;
		case 'C':
		case 'D':
		case 'E':
			System.out.println("Failed");
			success = 0;
			break;
		default:
			System.out.println("Invalid Grade");
			success = -1;
			break;
			
			
		}
		passTheCourse(1);
	}
	public static void passTheCourse(int success)
	{
	switch(success)
	{
	case 1:
		System.out.println("Valid Result");
		break;
	case 0:
		System.out.println("Invalid result");
		break;
	case -1:
		System.out.println("Invalid Result/Failed");
		break;
		
	}
	}

}
