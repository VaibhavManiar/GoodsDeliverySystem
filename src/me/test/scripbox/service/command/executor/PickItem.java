package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class PickItem implements IDroneCommandExecutor {

	@Override
	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item)
			throws CommandException {
		if (item == null || item.getLocation() == null || item.getLocation().isEmpty())
			throw new InvalidInputException("Item details are incorrect.");
		System.out.println(String.format("Picked item [%s].", item.getName()));
		return CommandFromDrone.PICKED_ITEM;
	}

}
