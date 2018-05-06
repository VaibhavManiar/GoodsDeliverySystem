package me.test.scripbox.model.drone;

import java.io.Serializable;

public class Drone  implements Serializable {
	private static final long serialVersionUID = 2073252331370707700L;
	
	private int id;
	private String name;
	private int itemId;

	public Drone() {
		super();
	}

	public Drone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Drone(int id, String name, int itemId) {
		super();
		this.id = id;
		this.name = name;
		this.itemId = itemId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drone other = (Drone) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drone [id=" + id + ", name=" + name + "]";
	}

}
