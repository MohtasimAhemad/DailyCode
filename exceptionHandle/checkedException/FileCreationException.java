package exceptionHandle.checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCreationException {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
	        try {
				fis = new FileInputStream("B:/profile.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
		int k; 

		
		try {
			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

		the file input stream
		 * It throws IOException*/
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
	
}
