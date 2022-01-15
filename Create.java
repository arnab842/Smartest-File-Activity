package Create;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Create {


	public static void main(String[] args) throws IOException {
		
	
	String path ="C:\\Arnab'sFirstProject\\";
	Scanner sc=new Scanner(System.in);
	 ArrayList<String> al=new ArrayList<>();
 while(true) {
	 System.out.println("enter the file name to create");
	 String filename=sc.next();
	 String finalfilename=path+filename;
	 File f=new File(finalfilename);
	 boolean result=f.createNewFile();
	 if(result==false) {
		 System.out.println("file is not created");
	 }
	 else {
		 al.add(filename);
		 System.out.println("file is created at : "+filename);
	 }
	 System.out.println(al);
	 }


}
}




