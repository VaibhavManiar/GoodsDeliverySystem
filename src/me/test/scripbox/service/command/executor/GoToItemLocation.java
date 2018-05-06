package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class GoToItemLocation implements IDroneCommandExecutor {

	@Override
	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item)
			throws CommandException {
		if (item == null || item.getLocation() == null || item.getLocation().isEmpty())
			throw new InvalidInputException("Item details are incorrect.");
		System.out.println(String.format("Reached at item location [%s].", item.getLocation()));
		return CommandFromDrone.REACHED_AT_ITEM_LOCATION;
	}

}
