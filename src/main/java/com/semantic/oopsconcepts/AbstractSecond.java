package com.semantic.oopsconcepts;

public class AbstractSecond extends AbstractClass {

	@Override
	void sum() {
		System.out.println("This is the sum mmethod call from the subclass");
		
	}

	public static void main(String [] args)
	{
		AbstractClass.test2();
		AbstractClass abc=new AbstractSecond();
		abc.test();
		abc.sum();
	}

	@Override
	void substract() {
		// TODO Auto-generated method stub
		
	}


}
