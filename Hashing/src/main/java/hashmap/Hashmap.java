package hashmap;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hashmap {
	static Logger l= Logger.getLogger("com.api.jar");
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
	    map.put("ganesh","8072964215");
	    map.put("suba", "7871659466");
	    map.put("sesha", "739339139");
	    map.remove("sesha");
	    l.log(Level.INFO,()->"Size-"+map.size());
	    l.log(Level.INFO,()->" "+map.get("ganesh"));
        map.clear();
        l.log(Level.INFO,()->"After CLear Size:"+map.size());
	}

}
