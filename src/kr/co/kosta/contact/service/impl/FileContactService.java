package kr.co.kosta.contact.service.impl;

import java.util.List;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.ContactService;

public class FileContactService implements ContactService {

	@Override
	public void registContact(Contact contact) {
		System.out.println("contact regist ok..");
	}

	@Override
	public List<Contact> listContact() {
		return null;
	}

	@Override
	public Contact detailContact(String name) {
		return null;
	}

	@Override
	public void removeContact(String name) {

	}

}
