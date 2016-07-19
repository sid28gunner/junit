package test;

import static org.junit.Assert.*;

import org.junit.Test;

import apis.add;

public class addTest {

	public void test()
	{
	//Declare
	int a=50;
	int b=40;
	
	//Execute
	int expected=add.addition(a,b);
	
	//Check
	int result=90;
	
	assertEquals(expected, result);
}
}