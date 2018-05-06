package me.test.scripbox.service.item.delivery;

import me.test.scripbox.model.command.CommandToDrone;
import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.drone.Drone;
import me.test.scripbox.model.item.Item;
import me.test.scripbox.service.CommandService;
import me.test.scripbox.service.ICommandService;

public class ItemDeliveryService implements IItemDeliveryService {

	ICommandService commandService = new CommandService();
	
	@Override
	public void deliverItem(Item item, CustomerAddress address) {
		Drone drone = this.getDrone(item);
		commandService.connectWithDrone(drone);
		commandService.executeCommands(CommandToDrone.GO_TO_ITEM_LOCATION, address, item);
	}
	
	private Drone getDrone(Item item) {
		Drone drone = new Drone();
		drone.setId(1);
		drone.setItemId(item.getId());
		drone.setName("Drone1");
		return drone;
	}

}
