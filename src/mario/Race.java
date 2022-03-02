package mario;

import java.util.ArrayList;

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
			if(k != null) 
			{
			moveKart(k);
			if (isFinished(k) == true)
			{
			moveToFinished(k);
			}
			
			}
		}
	}
			
		}

public String showResult() {
	int contador = 1;
	StringBuilder sb = new StringBuilder();
	sb.append("Carrera : ");
	sb.append(name);
	sb.append("\nCircuito:");
	sb.append(circuit.toString());
	for(Kart i : finishedKarts)
		sb.append("\n" + (contador++) + "." + i.toString());
	return sb.toString();
	}

private void moveKart(Kart kart) {
	int adelantamientos = 0;
	adelantamientos = kart.move() - circuit.difficulty();
	kart.setPosition(kart.getPosition() + adelantamientos);
}

private void moveToFinished(Kart kart) {
	this.finishedKarts.add(kart);
	for(Kart k : karts) {
		if(k.equals(kart)) {
			this.karts.remove(kart);
		}
	}
}

private boolean isFinished(Kart kart) {
	if(kart.getPosition() >= this.circuit.getDistance()) {
		return true;
	} else {
		return false;
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



public String toString() {
	int contador = 1;
	StringBuilder sb = new StringBuilder();
	sb.append("Carrera : ");
	sb.append(name);
	sb.append("\nCircuito:");
	sb.append(circuit.toString());
	for(Kart i : karts)
		sb.append("\n" + (contador++) + "." + i.toString());
	return sb.toString();
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



public void setCircuit(Circuit circuit) {
	this.circuit = circuit;
}

public void addKart(Kart kart) {
	this.karts.add(kart);
}
	
}