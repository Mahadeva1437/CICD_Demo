package FieldTracking.EMPFieldTracking;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class PrePostJava {

	@Test
	public void PrePostJavTest() {
		
		
		int x=10;
		int y=20;
		int a;
		int b;
		
		a=x++;
		b=y++;
		
		System.out.println(--x);
		
		int c=(--x)+(x++)+a;
		System.out.println(b);
		System.out.println(c++);
		
	}
	
	
	
	@Test
	
	public void TestJava() {
		
			/*
			 ArrayList obj = new ArrayList(); 
			obj.add("A");
			 obj.add("B");
			 obj.add("C"); 
			obj.add("D"); 
			System.out.println(obj);  */
			
		
		/*
			String c = "Hello i love java"; 
			boolean var; 
			var = c.startsWith("Hello");
			 System.out.println(var);
			
			*/
		/*
		char chars[] = {'a', 'b', 'c'}; 
		String s = new String(chars);
		 System.out.println(s); 
		 
		 */
		/*
		 int arr[] = {1, 2, 3, 4, 5}; 
		 for ( int i = 0; i < arr.length - 2; ++i) 
			 
		 System.out.println(arr[i] + " "); 

		 */
		
		 int x; x = 5; 
		 { 
		 int y = 6; System.out.print(x + " " + y+"\n");
		  } 
		 System.out.println(x + " ");

	
			 } 
	
}
