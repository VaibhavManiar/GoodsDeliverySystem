package me.test.scripbox.connection;

import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.drone.Drone;

public class ConnectionFactory {
	private ConnectionFactory() {}
	private static ConnectionFactory instance;
	public static ConnectionFactory getInstance() {
		if(instance == null)
			instance = new ConnectionFactory();
		return instance;
	}
	
	public Connection openConnection(Drone drone) {
		if(drone == null) {
			throw new InvalidInputException("Drone must not be null.");
		}
		return new Connection(drone);
	}
}
