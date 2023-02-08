package testclass;

public class Testclass {
	String name;
    public String display()
    {
    	return this.name;
    }
	public static void main(String[] args) {
	       Testclass a1=new Testclass();
	       a1.name="ganesh";
	       System.out.print(a1.name);
           System.out.format(a1.name);
           System.err.print(a1.name);
           System.err.print(a1.display());
	}

}
