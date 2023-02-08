package tictactoe;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Tictactoe {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	public void position()
	{
		out.println("\nAvailable positions:");
		if(this.arr[0][0]=='-')
		{
			out.print("1-");
		}
		if(this.arr[0][1]=='-')
		{
			out.print("2-");
		}
	}
    char arr[][]= {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
	public static void main(String[] args) {
		Tictactoe a1=new Tictactoe();
		out.print("First player-X and second player player-O");
		a1.position();
     
	}

}
