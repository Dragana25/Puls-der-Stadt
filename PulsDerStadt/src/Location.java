public class Location {
	public int id;
	private String name;
	private String adress;
	private double latitude;
	private double longitude;
	private double avgAtmosphere;
	private double avgVisitors;
	private double avgwTime;
	private double avgService;
	private double avgAge;
	private double avgPuls;
	private int countRev;

	public Location(int id, String name, String adress, double lat, double let) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.latitude = lat;
		this.longitude = let;
	}

	public void update(Review r) {

		this.avgAtmosphere = this.avgAtmosphere
				* (this.countRev / (this.countRev + 1)) + r.atmosphere
				/ (this.countRev + 1);
		this.avgVisitors = this.avgVisitors
				* (this.countRev / (this.countRev + 1)) + r.visitors
				/ (this.countRev + 1);
		this.avgwTime = this.avgwTime * (this.countRev / (this.countRev + 1))
				+ r.wTime / (this.countRev + 1);
		this.avgService = this.avgService
				* (this.countRev / (this.countRev + 1)) + r.service
				/ (this.countRev + 1);
		this.avgAge = this.avgAge * (this.countRev / (this.countRev + 1))
				+ r.age / (this.countRev + 1);
		this.avgPuls = this.avgPuls * (this.countRev / (this.countRev + 1))
				+ r.puls / (this.countRev + 1);
		this.countRev += 1;

	}

}
