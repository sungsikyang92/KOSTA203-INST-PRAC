package step3;

public class FriendService {
	public void findNamesByAge(FriendVO[] f, int age) {
		for(int i=0;i<f.length;i++) {
			if(age<=f[i].getAge()) {
				System.out.println(f[i].getName());
			}
		}//for
	}//method

	public void findNickByAddress(FriendVO[] f, String address) {
		for(int i=0;i<f.length;i++) {
			if(address.equals(f[i].getAddress())) {
				System.out.println(f[i].getNick());
			}//if
		}//for
	}//method
	public void findNameByFirstName(FriendVO[] f, String name) {
		for(int i=0;i<f.length;i++) {
			if(f[i].getName().startsWith(name)) {
				System.out.println(f[i].getName());
			}//if
		}//for
	}//method
}//class















