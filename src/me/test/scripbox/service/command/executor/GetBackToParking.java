package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class GetBackToParking implements IDroneCommandExecutor {

	@Override
	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item)
			throws CommandException {
		
		System.out.println(String.format("Reached back to parking location."));
		return CommandFromDrone.REACHED_AT_PARKING;
	}

}
