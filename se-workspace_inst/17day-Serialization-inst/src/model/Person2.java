package model;

import java.io.Serializable;
/*
 * Serializable interface�� implements �ؾ߸� ����ȭ ������ ��ü�� �ȴ� 
 * ��ü�� ����ȭ�Ǿ� �ܺη� ���۵� �� Ư�� �ν��Ͻ� ������ ������
 * ����ȭ��󿡼� �����ϰ� �� �� transient Ű���带 �̿��Ѵ� 
 */
public class Person2 implements Serializable{
	private static final long serialVersionUID = 4261180539532798202L;
	private String name;
	private String address;
	private transient String password;
	public Person2(String name, String address, String password) {
		super();
		this.name = name;
		this.address = address;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
