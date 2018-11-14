package FirstDay;

import java.util.Scanner;

public class DataManipulation {
      public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println(name);
		if(name.equals("James Bond")) {
			System.out.println(true);
		}else if(name.equals("james bond")) {
		    System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
