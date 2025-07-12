package july_9;

public class StringsInJavaExamples {

	public static void main(String[] args) {

		/*
		//Approach1
        String str = "Dayanand";
        System.out.println(str);
        
        //Approach2
        String str1 = new String("DayanandS");
        System.out.println(str1);
        
        //inbuilt methods-string class
        //length()- return number of characters in the given string
        
        int len = str.length();
        System.out.println(len);     //8
        System.out.println(str1.length());//9
        
        int length1 = "DayanandSapte".length();
        System.out.println(length1);  //13
        
        */
        //concat- Concatenation - it will join two strings
        String s1 = "Dayanand";
        String s2 = "Sapte";
        
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        
        String s3 = "Automation";
        System.out.println("using + :"+s1+s2+s3);
        System.out.println("using concat method :"+s1.concat(s2).concat(s3));
        
        
        
        
        

	}

}
