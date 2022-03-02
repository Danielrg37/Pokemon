package mario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






public class Race{
	private String name;
	private Circuit circuit;
	private final static int NUM_KARTS = 3;
	private List<Kart> karts = new ArrayList<Kart>();
	private List<Kart> finishedKarts = new ArrayList<Kart>();
	
	
public Race(String name) {
	this.name = name;
}
	
public void run() {
	while(notAllFinished() == false) {
		for(Kart k : karts) {
			if(k != null) {
				moveKart(k);
			if (isFinished(k) == true) {
			moveToFinished(k);
			}
			
			}
		}
	}
			
		}

public boolean notAllFinished() {
	boolean queda = false;
	for (Kart k : karts) {
		if(k != null) {
			queda = true;
		}
	}
	return queda;
}


private void moveKart(Kart kart) {
	int movedPositions = 0;
	movedPositions = kart.move() - circuit.difficulty();
	kart.setPosition(kart.getPosition() + movedPositions);
}


private boolean isFinished(Kart kart) {
	if(kart.getPosition() >= this.circuit.getDistance()) {
		return true;
	} else {
		return false;
	}
}

private void moveToFinished(Kart kart) {
	this.finishedKarts.add(kart);
	for(Kart k : karts) {
		if(k.equals(kart)) {
			this.karts.remove(kart);
		}
	}
}


public String showResult() {

}

public void addKart(Kart kart) {
	this.karts.add(kart);
}
	
public void setCircuit(Circuit Circuit) {
	this.circuit = circuit;
}


public String toString() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Circuit getCircuit() {
	return circuit;
}
	
	
	
	
	
	
	
}