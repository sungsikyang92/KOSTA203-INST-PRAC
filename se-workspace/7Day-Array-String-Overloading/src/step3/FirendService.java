package step3;

public class FirendService {

	public void findNamesByAge(FriendVO[] f, int age) {
		for(int i=0;i<f.length;i++) {
			if(f[i].getAge()>=age) {
				System.out.println(f[i].getName());
			}
		}
	}
	public void findNickByAddress(FriendVO[] f, String address) {
		for(int i=0;i<f.length;i++) {
			if(f[i].getAddress().equals(address)) {
			System.out.println(f[i].getNick());
			}
		}
	}
	public void findNameByLastName(FriendVO[] f, String lastName) {
		for(int i=0;i<f.length;i++) {
			if(f[i].getName().startsWith("°­")) {
				System.out.println(f[i].getName());
			}
		}
	}
}
