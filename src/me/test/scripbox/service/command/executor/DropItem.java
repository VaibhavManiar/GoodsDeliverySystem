package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class DropItem implements IDroneCommandExecutor {

	@Override
	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item)
			throws CommandException {
		if (item == null || item.getLocation() == null || item.getLocation().isEmpty())
			throw new InvalidInputException("Item details are incorrect.");
		
		if (address == null 
				|| address.getLine1() == null || address.getLine1().isEmpty() 
				|| address.getCity() == null || address.getCity().isEmpty()
				|| address.getState() == null || address.getState().isEmpty()
				|| address.getCountry() == null || address.getCountry().isEmpty()
				|| address.getPincode() == null || address.getPincode().isEmpty())
			throw new InvalidInputException("Address details are incorrect.");
		System.out.println(String.format("Item [%s] droped at address [%s]", item.getName(), address.toString()));
		return CommandFromDrone.DROPED_ITEM;
	}

}
