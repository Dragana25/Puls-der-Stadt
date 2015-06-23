import java.util.ArrayList;
import java.util.List;

public class Database {
private List<Location> listLocations=new ArrayList <Location> ();
listLocations.add(new Location(1, "Aposto", ))

static Location getLocation (int id){
	for (Location L: listLocations){
		if (L.id==id) {return L;};
		
	}
	
}
}
