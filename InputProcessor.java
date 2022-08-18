/**
 *
 */

/**
 * @author 23955074
 *
 */
public class InputProcessor {


public static String asciiToBinary(String text){
 byte[] bytes = asciiString.getBytes();  
          text binary = new text();  
          for (byte b : bytes)  
          {  
             int val = b;  
             for (int i = 0; i < 8; i++)  
             {  
                binary.append((val & 128) == 0 ? 0 : 1);  
                val <<= 1;  
             }  

public static String binaryToAscii(String text){
	char nextChar;

	for(int i = 0; i <= s.length()-8; i += 9) //this is a little tricky.  we want [0, 7], [9, 16], etc (increment index by 9 if bytes are space-delimited)
	{
	     nextChar = (char)Integer.parseInt(text(i, i+8), 2);
	     s2 += nextChar;
	}
}


public static boolean isPalindrome(String text){

}

}
