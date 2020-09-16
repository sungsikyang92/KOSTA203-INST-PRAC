package model;
/*
 * 테스트를 위한 가짜 DAO 
 * Singleton Design Pattern 적용해 단 한번 객체 생성하고 
 * public static method로 객체를 외부에 공유한다 
 */
public class MockDAO {
	private static MockDAO dao=new MockDAO();
	private MockDAO(){}
	public static MockDAO getInstance() {
		return dao;
	}
	public CarVO selectCarById(String id) {
		CarVO car=null;
		if(id.equals("1234"))
			car=new CarVO(id,"양성식","아우디","판교");
		return car;
	}
	public void registerCar(CarVO carVO) {
		System.out.println(carVO+" 정보를 db table에 insert~");
	}
}



















