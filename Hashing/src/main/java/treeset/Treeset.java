package treeset;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Treeset {
	      static Logger l= Logger.getLogger("com.api.jar");
           public static void main(String[] args)
           {
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
        		   l.log(Level.INFO,()->" "+it.next());
        	   }
           }
}
