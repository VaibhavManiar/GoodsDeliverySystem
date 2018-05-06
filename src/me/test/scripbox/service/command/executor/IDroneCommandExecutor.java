package me.test.scripbox.service.command.executor;

import me.test.scripbox.exception.command.CommandException;
import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public interface IDroneCommandExecutor {
	public CommandFromDrone execute(CommandToDrone command, CustomerAddress address, Item item) throws CommandException;
}
