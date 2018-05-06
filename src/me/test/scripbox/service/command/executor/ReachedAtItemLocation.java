package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class ReachedAtItemLocation implements ICommandCenterCommandExecutor {

	@Override
	public CommandToDrone execute(CommandFromDrone command, CustomerAddress address, Item item) {
		if (item == null || item.getLocation() == null || item.getLocation().isEmpty())
			throw new InvalidInputException("Item details are incorrect.");
		System.out.println(String.format("Pick item [%s]", item.getName()));
		return CommandToDrone.PICK_ITEM;
	}

}
