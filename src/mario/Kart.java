package mario;

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
	}
}