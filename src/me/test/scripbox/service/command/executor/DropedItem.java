package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.InvalidInputException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public class DropedItem implements ICommandCenterCommandExecutor {

	@Override
	public CommandToDrone execute(CommandFromDrone command, CustomerAddress address, Item item) {
		if (item == null || item.getLocation() == null || item.getLocation().isEmpty())
			throw new InvalidInputException("Item details are incorrect.");
		
		if (address == null 
				|| address.getLine1() == null || address.getLine1().isEmpty() 
				|| address.getCity() == null || address.getCity().isEmpty()
				|| address.getState() == null || address.getState().isEmpty()
				|| address.getCountry() == null || address.getCountry().isEmpty()
				|| address.getPincode() == null || address.getPincode().isEmpty())
			throw new InvalidInputException("Address details are incorrect.");
		System.out.println(String.format("Droped item [%s] to address [%s]", item.getName(), address.toString()));
		return CommandToDrone.GET_BACK_TO_PARKING;
	}

}
