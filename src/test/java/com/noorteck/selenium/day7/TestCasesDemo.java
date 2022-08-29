package com.noorteck.selenium.day7;

public class TestCasesDemo {
	
	public static void main(String[] args) throws InterruptedException   {
		
		TestCase1 obj = new TestCase1();
		
		obj.setUp();
		
		//obj.rightClick();
		
		//obj.doubleClick();
		
		obj.dragAndDrop1();
		
		obj.tearDown();
	}

}
