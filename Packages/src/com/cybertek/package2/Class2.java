package com.cybertek.package2;

import com.cybertek.package1.Class1;

//import com.cybertek.package2.*;
//import com.cybertek.package2.Class2;
//import com.cybertek.package2.Class3;

public class Class2 {
	public static void main(String[] args) {
		
		//There are 3 ways to access package from outside the package
		//1-import package.*
		//2-import package.className
		//3-fully qualified name
		
		//Class2 cl=new Class2();
		//Class3 cl1=new Class3();
		
		Class1 cl=new Class1();
		com.cybertek.package2.Class3 cl1=new com.cybertek.package2.Class3();
		
		
	}

}
