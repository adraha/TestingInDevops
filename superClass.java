package com.ExceptionHandling;

public class superClass {

	public static void main(String[] args) 
	
	{
	
	    EWSC ew=new EWSC();
	    ew.printColor();
	    ew.eat();
	    ew.work();
		
	
	}

}

class NFIT

{
	String color="black" ;
	NFIT()
	{
		System.out.println("Constructor is called");
	}
	void eat()
	
	{
		System.out.println("Eating in NFIT");
	}
	
}

class EWSC extends NFIT

{
   String color="White";	
	
   void eat()
   
   {
	   System.out.println("Eating in EWSC");
	   
   }
   
   void printColor()
   
   {
	   System.out.println(color);
	   
	   System.out.println(super.color);//Calling the parent class variable
        
   }
   
   void work()
   {
	   
	   super.eat();//Invoking the parent class Method
	   
   }
   
   EWSC()
   {
	   super();// call the parent class Constructor
	   System.out.println("Constructor 2 is called");
   }
   
   
}




