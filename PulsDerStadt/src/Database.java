import java.util.ArrayList;
import java.util.List;

public class Database {
private static List<Location> listLocations=new ArrayList<Location>();

public static Location getLocation(int id){
	
	listLocations.add(new Location(1, "Aposto", "Ludwigsplatz, KA", 0, 0));
	
	for (Location l : listLocations){
		if (l.id==id) {
			return l;
		}
	}
	
	return null;
	
}
}
