package advancedseles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("seleex.txt");
		fw.write("HI How do you do, All is fine, All is Ok..Hello..");
		System.out.println("It is written Successfully...");
		fw.close();
		
		FileReader fr = new FileReader("seleex.txt");
		int i=0;
		while((i =fr.read())!=-1) {
			System.out.println((char)i);
		}
		
		
		
	}

}
