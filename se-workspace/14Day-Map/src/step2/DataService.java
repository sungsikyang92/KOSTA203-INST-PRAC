package step2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DataService {
	public Collection<String> searchData(String type) {
		Collection<String> collection = null;
		if (type.equals("A")) {
			collection = new TreeSet<String>();
			collection.add("Â¥Àå¸é");
			collection.add("Â«»Í");
		} else if (type.equals("B")) {
			collection = new ArrayList<String>();
			collection.add("¼Ò³ªÅ¸");
			collection.add("¸ð´×");
		}
		return collection;
	}
}
