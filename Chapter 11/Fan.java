
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getSpeed() {
		String s = "";
		if (speed == SLOW) {
			s = "SLOW";
		} else if (speed == MEDIUM) {
			s = "MEDIUM";
		} else {
			s = "FAST";
		}
		return s;
	}

	public boolean isOn() {
		return on;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		if (on == true) {
			return "Fan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius;
		}
		else{
			return "Fan color: " + color + ", radius: " + radius + ", note that the fan is off";
		}
	}
}