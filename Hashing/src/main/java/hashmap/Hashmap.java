package hashmap;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
public class Hashmap {
	public static void main(String[] args) {
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
		HashMap<String,Integer> map=new HashMap<>();
	    map.put("ganesh",121);
	    map.put("suba", 122);
	    map.put("sesha", 123);
       // List<Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
	    map.remove("sesha");
	    out.println("Size-"+map.size());
	    out.println(map.get("ganesh"));
        map.clear();
        out.println("After CLear Size:"+map.size());
	}

}
