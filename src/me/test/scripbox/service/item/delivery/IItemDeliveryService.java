package me.test.scripbox.service.item.delivery;

import me.test.scripbox.model.customer.CustomerAddress;
import me.test.scripbox.model.item.Item;

public interface IItemDeliveryService {
	public void deliverItem(Item item, CustomerAddress address);
}
