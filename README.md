Junit is used for unit testing java applications.

1.> Create java project ---> create java class ---> Write your methods
Myclass.java

public class Myclass {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public String name(String s, String t)
	{
		return s+" "+t;
	}

}

2.>Click on project ---> New --->junit Test case
   addTest.java
   
   import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		Myclass m=new Myclass();
		int a = m.add(300, 100);
		assertEquals(400,a);
	}

}
 --------------------------------------------------------------------------------  
   stringTest.java
   
   import static org.junit.Assert.*;

import org.junit.Test;

public class stringTest {

	@Test
	public void test() {
		Myclass s=new Myclass();
		String b = s.name("Hello","World");
		assertEquals("Hello World",b);

}
}

3.>To make all junit test cases in one place
   Java_project ---> new ---> other ----> junit test suite
   run the test suite :)

