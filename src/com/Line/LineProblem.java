package com.Line;

import java.util.Scanner;


public class LineProblem {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print(" Enter x1: ");
		double x1 = read.nextDouble();
		
		System.out.print(" Enter y1: ");
		double y1 = read.nextDouble();
		
		System.out.print(" Enter x2: ");
		double x2 = read.nextDouble();
		
		System.out.print(" Enter y2: ");
		double y2 = read.nextDouble();
		
        double length = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(" The Length of lines is "+length);		
	}

}
