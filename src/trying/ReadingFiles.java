package trying;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingFiles {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\skalakm\\google\\teaching\\workspace\\"
				+ "cdomp132-2021fall\\src\\trying\\name.txt");
		Scanner s = null;
		try {

			s = new Scanner(f);
			//int i= s.nextInt();
			//int i = 1/0;
			String name = s.nextLine();
			System.out.println("HI " + name);
		}catch (IOException e) {
			System.out.println("file not found failed");
			
		}catch( InputMismatchException ime) {
			System.out.println("bad input");
		}finally {
			s.close();
			System.out.println("finally finally");
		}
		
	}

}
