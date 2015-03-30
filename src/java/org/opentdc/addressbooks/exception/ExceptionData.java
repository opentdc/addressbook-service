package org.opentdc.addressbooks.exception;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

import org.opentdc.addressbooks.AddressbookData;

@XmlRootElement(name = "Exception")
public class ExceptionData {

	private String message;
	private Map<String, AddressbookData> data;

	public ExceptionData() {
	}

	public ExceptionData(String message, Map<String, AddressbookData> data) {
		this.setMessage(message);
		this.setData(data);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) throws JAXBException {
		Map<String, AddressbookData> map = new HashMap<String, AddressbookData>();
		map.put("0", new AddressbookData());

		ExceptionData em = new ExceptionData("hello", map);

		JAXBContext context = JAXBContext.newInstance(ExceptionData.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(em, System.out);
	}

	public Map<String, AddressbookData> getData() {
		return data;
	}

	public void setData(Map<String, AddressbookData> data) {
		this.data = data;
	}

}
