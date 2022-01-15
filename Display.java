package Display;

import java.io.File;

public class Display {
	public static void main(String[] args) {
		
	String path="C:\\Arnab'sFirstProject\\";
File f=new File(path);
File filename[]=f.listFiles();
for(File ff:filename) {
	 System.out.println(ff.getName());
}
}
}


