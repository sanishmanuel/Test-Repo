package com.sanish.refresh.examples;

public final class  AccessModifierCheck extends AbstractCheck implements TestInterface {

	  static Integer i = 10;
	  AccessModifierCheck d ;
	  TestInterface t ;
	  static{
		  System.out.println("From static bblock before any one >>>>>>>>>>>>>>");
	  }
	  public AccessModifierCheck(){
		  //super();
		  this.i=15;
		  //this.j=22;
	  }
	 public static  void main (String [] as){		
		// c.i = 11;
		 System.out.println("me here >>>>"  + i);
		 System.out.println("me heredddd >>>>"  + j);
		// AccessModifierCheck c = new AccessModifierCheck();
		 new AccessModifierCheck().checkValue();
		 System.out.println("me here >>2222>>"  + i);
		 System.out.println("me here me again <<< >>2222>>"  + j);
	 }
	
	 public void  checkValue(){
		 final String j = "fff";
		 d = new AccessModifierCheck();
		// d.checkValue();
		 t = new AccessModifierCheck();
		 System.out.println("me here >>1111>>"+t.getTestClass().getS() );
		 System.out.println("from check valueee >>>>>>>>>>"  );
		 d.getStringValue();
	 }
	  
	public void getStringValue(){
		System.out.println("From Ihterfaceeeeeed");
	}
	
	public String getTestValue(String s){
		
		return "Hii";
	}
	
	@SuppressWarnings("unused")
	protected Integer getTestValue(Integer s){
		System.out.println("from get test vakue ::::");
		return 1;
	}
}
