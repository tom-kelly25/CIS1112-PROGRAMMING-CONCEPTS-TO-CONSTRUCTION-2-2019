
public class AnimalTracker {
	
	public String name;
	public CoordPoint location;
	double distanceTravelled;
	
	public AnimalTacker(String nme, double x, double y) {
		name = nme;
		this.location = new CoordPoint (x,y);
		location.setLocation(x, y);
	}
	public void move(double nx, double ny) {
		distanceTravelled += location.getDistance(nx, ny);
		location.setLocation(nx, ny);
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
}
