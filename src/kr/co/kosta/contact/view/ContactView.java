package kr.co.kosta.contact.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.ContactService;
import kr.co.kosta.contact.service.impl.FileContactService;

public class ContactView {

	public void run() throws IOException {
		String choice = "";
//		String text = "";

		do {
			printMainMenu();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			choice = br.readLine();

			if (choice.startsWith("1")) {

				Contact contact = makeContactFromUserInput();
				//
				ContactService service = new FileContactService();
				service.registContact(contact);

				// System.out.println("사용자 이름과 이메일, 나이, 주소를 각각 입력해 주세요(구분자는
				// space입니다.)");
				// text = br.readLine();
				// String[] text1 = text.split(" ", 4);
				// for (int i = 0; i < 4; i++)
				// System.out.println(text1[i]);

			} else if (choice.startsWith("2")) {
				System.out.println("2번을 누르셨습니다.");
			} else if (choice.trim().toUpperCase().startsWith("Q")) {
				System.out.println("종료되었습니다..");
				break;
			} else {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		} while (true);

	}

	private Contact makeContactFromUserInput() throws IOException {
		System.out.print("이름 이메일 나이 주소를 각각 ';'로 구분해서 입력해 주세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputFromUser = br.readLine();

		String[] spliitedData = inputFromUser.split(";");
		// 데이터를 가지고 Contact 객체를 생성
		Contact contact = new Contact();
		contact.setName(spliitedData[0]);
		contact.setEmail(spliitedData[1]);
		contact.setAge(Integer.parseInt(spliitedData[2]));
		contact.setAddress(spliitedData[3]);

		return contact;
	}

	private void printMainMenu() {
		System.out.println("=======================");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 전체보기");
		System.out.println("Q. 종료");
		System.out.println("=======================");
		System.out.println("선택 >");
	}
}
