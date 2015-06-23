public class Location {
	public int id;
	private String name;
	private String adress;
	private double lat;
	private double let;
	private double avgAtmosphere;
	private double avgVisitors;
	private double avgwTime;
	private double avgService;
	private double avgAge;
	private double avgPuls;
	private int countRev;

	public Location(int id, String name, String adress, double lat, double let,
			double avgAtmosphere, double avgVisitors, double avgwTime,
			double avgService, double avgAge, double avgPuls, int countRev) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.lat = lat;
		this.let = let;
		this.avgAtmosphere = avgAtmosphere;
		this.avgVisitors = avgVisitors;
		this.avgwTime = avgwTime;
		this.avgService = avgService;
		this.avgAge = avgAge;
		this.avgPuls = avgPuls;
		this.countRev = countRev;
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
