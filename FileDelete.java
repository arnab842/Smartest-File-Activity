package Delete;
import java.util.Scanner;
import java.io.File;
import java.util.*;

public class FileDelete {
	public static void main(String[] args) {
		
	String Path ="C:\\Arnab'sFirstProject\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the file for delete");
	 String filename=sc.next();
 String finalfilename=Path+filename;
	 File f=new File(finalfilename);
	 f.delete();


}
}