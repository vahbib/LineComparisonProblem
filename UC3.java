package LineComparisonProblem;

import java.util.Scanner;

public class UC3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For Line 1: Enter the cordinates of 1st point");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("For Line 1: Enter the cordinates of 2nd point");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println("For Line 2: Enter the cordinates of 1st point");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.println("For Line 2: Enter the cordinates of 2nd point");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		int cal1 = (int) Math.pow((x2-x1), 2);
		int cal2 = (int) Math.pow((y2-y1), 2);
		int cal3 = (int) Math.pow((x4-x3), 2);
		int cal4 = (int) Math.pow((y4-y3), 2);
		
		double Len1 =  Math.sqrt(cal1+cal2);
		double Len2 =  Math.sqrt(cal3+cal4);
		System.out.println("Length of Line1 and Line2 is "+ Len1 +" & "+ Len2);
		
		/*
		 * String Length1 = Double.toString(Len1); 
		 * String Length2 = Double.toString(Len2);
		 */
		int value = Double.compare(Len1, Len2);
		if (value == 0)
			System.out.println("Lines are equal");
		else if (value == 1)
			System.out.println("Line 1 is greater than Line 2");
		else
			System.out.println("Line 1 is less than Line 2");
	}

}
