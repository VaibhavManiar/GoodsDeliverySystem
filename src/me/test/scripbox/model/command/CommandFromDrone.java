package me.test.scripbox.model.command;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;
import me.test.scripbox.service.command.executor.DropedItem;
import me.test.scripbox.service.command.executor.PickedItem;
import me.test.scripbox.service.command.executor.ReachedAtAddress;
import me.test.scripbox.service.command.executor.ReachedAtItemLocation;
import me.test.scripbox.service.command.executor.ReachedAtParking;

public enum CommandFromDrone {
	REACHED_AT_ITEM_LOCATION, PICKED_ITEM, REACHED_AT_ADDRESS, DROPED_ITEM, REACHED_AT_PARKING;
	
	public CommandToDrone execute(CommandFromDrone command, CustomerAddress address, Item item) {
		switch (command) {
		case REACHED_AT_ITEM_LOCATION:
			return new ReachedAtItemLocation().execute(command, address, item);

		case PICKED_ITEM:
			return new PickedItem().execute(command, address, item);

		case REACHED_AT_ADDRESS:
			return new ReachedAtAddress().execute(command, address, item);

		case DROPED_ITEM:
			return new DropedItem().execute(command, address, item);

		case REACHED_AT_PARKING:
			return new ReachedAtParking().execute(command, address, item);
			
		default:
			throw new CommandException("Command not found.");
		}
	}
}
