package me.test.scripbox.service;

import me.test.scripbox.connection.Connection;
import me.test.scripbox.connection.ConnectionFactory;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.drone.Drone;
import me.test.scripbox.model.item.Item;

public class CommandService implements ICommandService {

	private Connection connection;
	private Drone drone;

	@Override
	public void connectWithDrone(Drone drone) {
		this.drone = drone;
		connection = ConnectionFactory.getInstance().openConnection(drone);
	}

	private void reEstablishConnectionWithDrone(Drone drone) {
		System.out.println(String.format("Re-establishing connection with drone [%s]", drone.toString()));
		this.connectWithDrone(drone);
	}

	@Override
	public void executeCommands(CommandToDrone commandToDrone, CustomerAddress address, Item item) {
		try {
			if (connection == null || !connection.isOpen()) {
				this.reEstablishConnectionWithDrone(this.drone);
			}
			boolean flag = true;
			boolean isCommandToDrone = true;
			CommandFromDrone commandFromDrone = null;
			while (flag) {
				if (isCommandToDrone)
					commandFromDrone = this.executeDroneCommands(commandToDrone, address, item);
				else
					commandToDrone = this.executeCommandCenterCommands(commandFromDrone, address, item);
				if (commandFromDrone == null || commandToDrone == null)
					flag = false;
				isCommandToDrone = !isCommandToDrone;
			}
			connection.close();
		} catch (Exception excp) {
			System.err.println(excp.getLocalizedMessage());
		}
	}

	private CommandFromDrone executeDroneCommands(CommandToDrone commandToDrone, CustomerAddress address, Item item) {
		return connection.executeDroneCommands(commandToDrone, address, item);
	}

	private CommandToDrone executeCommandCenterCommands(CommandFromDrone commandFromDrone, CustomerAddress address,
			Item item) {
		return connection.executeCommandCenterCommands(commandFromDrone, address, item);
	}
}
