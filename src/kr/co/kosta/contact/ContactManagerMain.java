package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.co.kosta.contact.view.ContactView;

public class ContactManagerMain {
	public static void main(String[] args) throws Exception {

		// 1. 사용자에게 화면을 보여준다. (View)
		/*
		 * ======================= 1. 연락처 등록 2. 연락처 전체보기 Q. 종료
		 * ======================= 선택 >
		 * 
		 * 1. 선택하면 -->
		 * 
		 * 사용자 이름과 이메일, 나이, 주소를 각각 입력해 주세요(구분자는 space입니다.)
		 * 
		 */

		ContactView view = new ContactView();
		view.run();

		// 콘솔(터미널)을 통해 사용자입력을 받을 수 있는 스트림 생성
		/**
		 * System.in 키보드, System.out 모니터
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	

		// System.out.println("이름을 입력해 주세요: ");
		// String name = br.readLine();
		//
		// System.out.println("이메일을 입력해 주세요: ");
		// String email = br.readLine();
		//
		// System.out.println("나이를 입력해 주세요: ");
		// String age = br.readLine();
		//
		// System.out.println("지역을 입력해 주세요: ");
		// String address = br.readLine();

		// System.out.println(typed);

		// Contact contact = new Contact(name, email, age, address);

		// System.out.println(contact);

	}

}