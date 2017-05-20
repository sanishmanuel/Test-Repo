package com.sanish.refresh.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class AutoCloseInTryCatch {
	final String ss="";
	
    public static void main (String [] as ){
    BufferedReader br = null;
    AccessModifierCheck c  = new AccessModifierCheck();
    c.getTestValue(123);
	 try(InputStream is = new FileInputStream(new File("C://sanish_1/Tools/sts-bundle/sts-3.7.3.RELEASE/license.txt"))) {
	  
	   InputStreamReader isr = new InputStreamReader(is);
	   String read;
	   br = new BufferedReader(isr);
	   while ((read = br.readLine()) != null) {
	      System.out.println(read);
	   }
	 } catch (IOException ioe) {
	   ioe.printStackTrace();
	 } 
    }
    
    public static void main (String s ){
    	System.out.println("from main overloaded ");
    }
    
   final  public static void main(Integer i){
	   
   } 
	
}
