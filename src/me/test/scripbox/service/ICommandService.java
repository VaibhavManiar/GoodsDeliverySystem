package me.test.scripbox.service;

import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.drone.Drone;
import me.test.scripbox.model.item.Item;

public interface ICommandService {
	public void connectWithDrone(Drone drone);
	
	public void executeCommands(CommandToDrone commandToDrone, CustomerAddress address, Item item);
}
