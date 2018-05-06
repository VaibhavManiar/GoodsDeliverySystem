package me.test.scripbox.service.command.executor;

import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class ReachedAtParking implements ICommandCenterCommandExecutor {

	@Override
	public CommandToDrone execute(CommandFromDrone command, CustomerAddress address, Item item) {
		System.out.println("Reached at parking location.");
		return null;
	}

}
