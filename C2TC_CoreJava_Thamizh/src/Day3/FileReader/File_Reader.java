package Day3.FileReader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException; 

public class File_Reader {
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("./src/Demo.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String content;
				
		System.out.println("File_Reader.main()");
		
		while((content = br.readLine()) !=null){
			System.out.println(content);
			
		}
		
	}

}
