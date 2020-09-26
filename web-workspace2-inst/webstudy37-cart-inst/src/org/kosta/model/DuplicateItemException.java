package org.kosta.model;

public class DuplicateItemException extends Exception{
	private static final long serialVersionUID = 797551095658553029L;
	public DuplicateItemException() {
		super("상품아이템이 중복되어 카트에 추가할 수 없습니다!");
	}
}
