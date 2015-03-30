package org.opentdc.addressbooks;

import java.util.Formatter;
import java.util.Locale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Present
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class AddressbookData {
	private String id;
	private String name;

	// TODO: List<Contact> contacts;
	// TODO: List<Address> addresses;

	public AddressbookData() {
		this.name = "undefined";
	}

	public AddressbookData(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder _sb = new StringBuilder();
		Formatter _formatter = new Formatter(_sb, Locale.US);
		_formatter.format("User [ID:%s\nname:%s\n", getId(), getName());
		_formatter.close();
		return _sb.toString();
	}
}