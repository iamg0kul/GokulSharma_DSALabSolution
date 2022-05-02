package com.greatlearning.entrypoint;
import com.greatlearning.balancingcheck.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the brackets you want to check: ");
		String expr=sc.nextLine();
		BalancedBrackets obj1=new BalancedBrackets();
		if (obj1.areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
		sc.close();
	}
}
