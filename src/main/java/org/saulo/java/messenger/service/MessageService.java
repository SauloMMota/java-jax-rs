package org.saulo.java.messenger.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.saulo.java.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello world!", "Saulo");
		Message m2 = new Message(2L, "Hello Jersey!", "Saulo");
		List<Message> list = new ArrayList<>();
		list.addAll(Arrays.asList(m1, m2));
		return list;
	}
}
