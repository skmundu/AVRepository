package com.semantic.oopsconcepts;

public class OverloadingCalculation3 {
	
	
	void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
		  
		  int a=10,c=20;
		  long b=20;
	  OverloadingCalculation3 obj=new OverloadingCalculation3();  
	  obj.sum((long)c,a);//now ambiguity  
	  }  
	

}
