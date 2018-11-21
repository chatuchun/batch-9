
public class Main {
  public static void main(String[] args) {
	 //CharAt(index)-returns char value for particular value
	  
	  String str="JavaScript";
	  System.out.println(str.charAt(3));
	  
	  //length() -returns string length
    System.out.println(str.length());
    
    //substring (int beginIndex)-returns substring for given begin index
    System.out.println(str.substring(5));
    
    
    //substring (int beginIndex,int endIndex)-returns substring for given begin index and end index
    System.out.println(str.substring(2,6));
    
    //contains ()-returns true or false after matching the sequence of char value 
    System.out.println(str.contains("va"));
    
    //equals(Object another)-checks the equality of string with the given  object 
    System.out.println(str.equals("JavaScript"));
    
    //isEmpty()-checks if string is empty 
    System.out.println(str.isEmpty());
    
    //concat(string str)-concatenates the specified string 
    System.out.println(str.concat("batch9"));
    
    //replace (char old,char new)-replaces all occurrences of the specified char value 
    System.out.println(str.replace("Script",""));
    
    //equalIgnoreCase(String,another)-compares another string.It does not check case.
    System.out.println(str.equalsIgnoreCase("javascript"));
    
    //split(String delimeter)-returns a split matching delimeter
    String str2="JavaScript is the best batch ever";
    String[] myArray=str2.split(" ");
    for(String word:myArray) {
    	System.out.println(word);
    }
    //indexOf(int ch)-returns the specified char value index
    System.out.println(str.indexOf('v'));
    
    //indexOf(String substing,int fromIndex)-returns the specified substring index starting with given value
    System.out.println(str.indexOf('a',1));
    
    //toLowerCase()-returns a string in Lowercase
    System.out.println(str.toLowerCase());
    
    //toUpperCase()-returns a string in Uppercase
    System.out.println(str.toUpperCase());
    
    //trim ()- removes beginning and ending spaces of this string
    System.out.println(str.trim());
  }

}
