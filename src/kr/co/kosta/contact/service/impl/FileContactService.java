package kr.co.kosta.contact.service.impl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.ContactService;

public class FileContactService implements ContactService {

	@Override
	public void registContact(Contact contact) {

		String name = contact.getName();
		String email = contact.getEmail();
		int age = contact.getAge();
		String addr = contact.getAddress();

		/**
		 * Java7에서 새로 추가된 문법
		 */
		try (BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("contact.txt"), "UTF-8"))) {

			bw.write(name + " " + email + " " + age + " " + addr);
			bw.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

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
