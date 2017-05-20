/**
 * 
 */
package com.sanish.refresh.examples;

/**
 * @author Sanish
 *
 */
public interface TestInterface {
  String s ="Test interface ";
  public class TestClass {
	  
	 private String s ="test private >>>>>>>>>>>>>>>> ";
	 
	 public String getS(){
		 return s;
	 }
	  
  }
  public default TestClass getTestClass(){ 
	  TestClass t = new TestClass();
	  return t; 
  }
  
  public void getStringValue();
}
