package me.test.scripbox.service.command.center;

import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;
import me.test.scripbox.service.item.delivery.IItemDeliveryService;
import me.test.scripbox.service.item.delivery.ItemDeliveryService;

public class CommandCenter {

	IItemDeliveryService service = new ItemDeliveryService();

	public static void main(String[] args) {
		deliverItem(getItem(), getAddress());
	}

	private static void deliverItem(Item item, CustomerAddress address) {
		CommandCenter commandCenter = new CommandCenter();
		commandCenter.service.deliverItem(item, address);
	}

	private static Item getItem() {
		Item item = new Item();
		item.setId(1);
		item.setLocation("S2-P1");
		item.setName("Item1");
		return item;
	}

	private static CustomerAddress getAddress() {
		CustomerAddress address = new CustomerAddress();
		address.setCity("NewYork");
		address.setCountry("US");
		address.setCustomerId(0);
		address.setLine1("line1");
		address.setLine2("line2");
		address.setPincode("09123");
		address.setState("US");
		return address;
	}
}
