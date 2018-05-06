package me.test.scripbox.service.command.executor;

import me.test.scripbox.model.command.CommandFromDrone;
import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public interface ICommandCenterCommandExecutor {
	public CommandToDrone execute(CommandFromDrone command, CustomerAddress address, Item item);
}
