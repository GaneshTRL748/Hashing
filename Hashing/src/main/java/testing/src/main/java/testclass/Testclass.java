package testclass;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Testclass {
	String name;
    public String display()
    {
    	return this.name;
    }
	public static void main(String[] args) {
	       Testclass a1=new Testclass();
	       a1.name="ganesh";
	       PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
	       myOutput.print("Name:"+a1.name+a1.display());
	       

}
}