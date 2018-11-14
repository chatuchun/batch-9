package FirstDay;

import java.util.Scanner;

public class MyLoops {
	public static void main(String[] args) {
		String y = "universe";
		String result = "";
		for(int i=y.length()-1;i>=0;i--) {
			result +=y.charAt(i);
		}
        System.out.println(result);
    }
}
