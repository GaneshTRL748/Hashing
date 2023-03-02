package treeset;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset {
           public static void main(String[] args)
           {
        	   PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
        	   TreeSet<String> set=new TreeSet<>();
        	   set.add("ganesh");
        	   set.add("ambika");
        	   set.add("suba");
        	   set.add("otis");
        	   set.add("bala");
        	   set.add("wills");
        	   set.add("walter");
        	   set.remove("wills");
        	   Iterator<String> it=set.iterator();
        	   while(it.hasNext())
        	   {
        		   out.println(" "+it.next());
        	   }
           }
}
