
public class Review {
	public Location loc; 
	 public double atmosphere; 
	 public double visitors;
	 public double wTime;
	 public double service;
	 public double age;
	 public double puls; 
	 
	 public Review (int id, double a, double v, double w, double s, double ag, double p){
		 this.loc=Database.getLocation(id);
		 this.atmosphere=a;
		 this.visitors=v;
		 this.wTime=w;
		 this.service=s;
		 this.age=ag;
		 this.puls=p;
		 
		 loc.update(this); 
	 }
	 

}
