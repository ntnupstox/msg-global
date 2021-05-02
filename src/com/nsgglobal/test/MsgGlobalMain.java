package com.nsgglobal.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MsgGlobalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "IsString Angram:\t" + MsgGlobalMain.checkAnogram("abaa","aaba" ) );

	}
	
	
	// arg1 = "abaa", arg2 = "aaba"
	public static boolean checkAnogram(String arg1, String arg2 ) {
		
		int len1 = arg1.length(); int len2 = arg2.length();
				HashMap<Character, Integer> hashMapObj1 = new HashMap<Character, Integer>();
			HashMap<Character, Integer> hashMapObj2 = new HashMap<Character, Integer>();
		
				
				if (len1 == len2) {

						for ( int i = 0; i < len1; i++ ) {
							if ( hashMapObj1.get(arg1.charAt(i)) == null)
								hashMapObj1.put(arg1.charAt(i), 1);
							else 
								hashMapObj1.put(arg1.charAt(i), hashMapObj1.get(arg1.charAt(i))+1);
						}
						
						for ( int i = 0; i < len1; i++ ) {
							if ( hashMapObj2.get(arg2.charAt(i)) == null)
								hashMapObj2.put(arg2.charAt(i), 1);
							else 
								hashMapObj2.put(arg2.charAt(i), hashMapObj2.get(arg2.charAt(i))+1);
						}
						
						Set<Character> setKeyObj = hashMapObj1.keySet();
						
						for( Character charValue : setKeyObj )
						{
							if ( hashMapObj1.get(charValue) == hashMapObj2.get(charValue)) {
								
								System.out.println("Characre" + charValue);
								System.out.println("Characr1 COUNT" + hashMapObj1.get(charValue));
							
								continue;
							}
							else 
								return false;
							
						}
						
						
						char charArray1[] = arg1.toCharArray();
					      Arrays.sort(charArray1);
					      System.out.println(new String(charArray1));
					      
					      
					      char charArray2[] = arg2.toCharArray();
					      Arrays.sort(charArray2);
					      System.out.println(new String(charArray2));
					      
					      if ( new String(charArray2).equals(new String (charArray1)))
					    	  System.out.println("return :\t" + "equal" );
							
				}
				else {
					return false;
				}
				
				return true;
		
		
	}

}
