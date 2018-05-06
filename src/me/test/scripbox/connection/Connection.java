package me.test.scripbox.connection;

import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.drone.Drone;
import me.test.scripbox.model.item.Item;

public class Connection implements AutoCloseable {

	private Drone drone;
	private boolean isOpen;

	public Connection(Drone drone) {
		this.drone = drone;
		this.isOpen = true;
	}
	
	public Drone getDrone() {
		return this.drone;
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}
	
	public CommandFromDrone executeDroneCommands(CommandToDrone commandToDrone, CustomerAddress address, Item item) {
		return commandToDrone.execute(commandToDrone, address, item);
	}

	public CommandToDrone executeCommandCenterCommands(CommandFromDrone commandFromDrone, CustomerAddress address,
			Item item) {
		return commandFromDrone.execute(commandFromDrone, address, item);
	}

	@Override
	public void close() throws Exception {
		// TODO: Close the connection here.....
		this.isOpen = false;
	}
}
