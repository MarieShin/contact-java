package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;

public class ContactManagerMain {
	public static void main(String[] args) throws Exception {

		// 1. ����ڿ��� ȭ���� �����ش�. (View)
		/*
		 * ======================= 
		 * 1. ����ó ��� 
		 * 2. ����ó ��ü���� 
		 * Q. ����
		 * ======================= 
		 * ���� >
		 * 
		 * 1. �����ϸ� -->
		 * 
		 * ����� �̸��� �̸���, ����, �ּҸ� ���� �Է��� �ּ���(�����ڴ� space�Դϴ�.)
		 * 
		 */

		show();

		// �ܼ�(�͹̳�)�� ���� ������Է��� ���� �� �ִ� ��Ʈ�� ����
		/**
		 * System.in Ű����, System.out �����
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch (br.readLine()) {
		case "1":
			System.out.println("����� �̸��� �̸���, ����, �ּҸ� ���� �Է��� �ּ���(�����ڴ� space�Դϴ�.)");
			br.readLine();
			break;
		case "2":
			break;
		case "Q":
			break;
		default:

		}

		// System.out.println("�̸��� �Է��� �ּ���: ");
		// String name = br.readLine();
		//
		// System.out.println("�̸����� �Է��� �ּ���: ");
		// String email = br.readLine();
		//
		// System.out.println("���̸� �Է��� �ּ���: ");
		// String age = br.readLine();
		//
		// System.out.println("������ �Է��� �ּ���: ");
		// String address = br.readLine();

		// System.out.println(typed);

		// Contact contact = new Contact(name, email, age, address);

		// System.out.println(contact);

	}

	public static void show() {
		System.out.println("=======================");
		System.out.println("1. ����ó ���");
		System.out.println("2. ����ó ��ü����");
		System.out.println("Q. ����");
		System.out.println("=======================");
		System.out.println("���� >");
	}
}
