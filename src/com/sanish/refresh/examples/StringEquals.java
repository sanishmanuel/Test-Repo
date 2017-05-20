/**
 * 
 */
package com.sanish.refresh.examples;

/**
 * @author Sanish
 *
 */
public class StringEquals {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
        String s ="Ponnutti";
        String s2 = new String(s);
        System.out.println(s);
        System.out.println(s.equals(s2));
        System.out.println(s==s2);
        System.out.println(s.intern()==s2.intern());
        StringEquals st = new StringEquals();
        st.classLoadetTest();
	}
	
	private void classLoadetTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		System.out.println("<<<from here>>>>>>>>>>");
		Object obj = Class.forName("com.sanish.refresh.examples.AutoCloseInTryCatch").newInstance() ;
		
	}

}
