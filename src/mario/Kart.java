package mario;

import java.util.Objects;

public class Kart {
	private String driver;
	private int speed;
	private int acceleration;
	private int position;
	private int random;
	private int MAX_POINTS = 18;
	private int MAX_RANDOM = 6;
	
	
	
	public Kart(String driver) {	
		this.driver = driver;
		init();
	}
	
	public void init() {
		position = 0;
		speed = (int) (Math.random() * ((MAX_POINTS + 1) - 0) + 0);
		acceleration = MAX_POINTS - speed;
		System.out.println(acceleration);
	}
	
	
	
	public int move() {
		int movimiento = (int) (speed + acceleration + (Math.random() * ((MAX_RANDOM + 1) - 0) + 0));
		return movimiento;  
	}
	
	

	@Override
	public String toString() {
		return "Kart [driver=" + driver + ", speed=" + speed + ", acceleration=" + acceleration + ", position="
				+ position + ", random=" + random + ", MAX_POINTS=" + MAX_POINTS + ", MAX_RANDOM=" + MAX_RANDOM + "]";
	}

	public String getName() {
		return driver;
	}

	public void setName(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(acceleration, driver, random, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kart other = (Kart) obj;
		return acceleration == other.acceleration && Objects.equals(driver, other.driver) && random == other.random
				&& speed == other.speed;
	}

	

	

	

	
}