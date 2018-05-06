package me.test.scripbox.model.command;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;
import me.test.scripbox.service.command.executor.DeliverItemToAddress;
import me.test.scripbox.service.command.executor.DropItem;
import me.test.scripbox.service.command.executor.GetBackToParking;
import me.test.scripbox.service.command.executor.GoToItemLocation;
import me.test.scripbox.service.command.executor.PickItem;

public enum CommandToDrone {
	GO_TO_ITEM_LOCATION, PICK_ITEM, DELIVER_ITEM_TO_ADDRESS, DROP_ITEM, GET_BACK_TO_PARKING;

	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item) {
		switch (command) {
		case GO_TO_ITEM_LOCATION:
			return new GoToItemLocation().execute(command, address, item);

		case PICK_ITEM:
			return new PickItem().execute(command, address, item);

		case DELIVER_ITEM_TO_ADDRESS:
			return new DeliverItemToAddress().execute(command, address, item);

		case DROP_ITEM:
			return new DropItem().execute(command, address, item);

		case GET_BACK_TO_PARKING:
			return new GetBackToParking().execute(command, address, item);
			
		default:
			throw new CommandException("Command not found.");
		}
	}
}
