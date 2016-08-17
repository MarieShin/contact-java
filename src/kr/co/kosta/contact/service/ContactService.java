/**
 * license.. etc
 */
package kr.co.kosta.contact.service;

import java.util.List;

import kr.co.kosta.contact.model.Contact;

/**
 * 메소드 정의
 * @author User
 *
 */
public interface ContactService {
	
	/**
	 * 연락처 등록 하기
	 * @param contact
	 */
	void registContact(Contact contact);
	
	/**
	 * 연락처 전체보기
	 * @return
	 */
	List<Contact> listContact();
	
	/**
	 * 연락처 상세보기
	 * @param name
	 * @return
	 */
	Contact detailContact(String name);
	
	/**
	 * 연락처 삭제하기
	 * @param name
	 */
	void removeContact(String name);

}