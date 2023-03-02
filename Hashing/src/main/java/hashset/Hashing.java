package hashset;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Hashing {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	int empid;
	String empname;
	public Hashing(String name, int empid) {
		this.empid=empid;
		this.empname=name;
	}
	public void display()
	{
		out.println("Empid:"+this.empid);
		out.println("Empname:"+this.empname);
	}
	
	@Override
	public String toString() {
		return "[empid=" + empid + ", empname=" + empname + "]";
	}
    
              public static void main(String[] args)
              {
            	  Hashing emp1=new Hashing("ganesh",121);
            	  Hashing emp2=new Hashing("ganesh",121);
            	  Hashing emp3=new Hashing("ruby",122);
            	  Hashing emp4=new Hashing("otis",123);
            	  Set<Hashing> set=new HashSet<Hashing>();
            	  set.add(emp1);
            	  set.add(emp2);
            	  set.add(emp3);
            	  set.remove(emp4);
            	  Iterator<Hashing> it= set.iterator();
            	  while(it.hasNext())
            	  {
            		  it.next().display();
            	  }
              }
			@Override
			public int hashCode() {
				return empid%10;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Hashing other = (Hashing) obj;
				return empid == other.empid;
			}            
}
