package step1.model;

public class CompanyService {
	private Employee[] array;
	private int index;
	public CompanyService(int length) {
		array=new Employee[length];
	}
	public void add(Employee e) {
		// �����ü�� ���޵� ������ �迭 ��ҷ� ��� index�� �ϳ��� ������Ų�� 
		array[index++]=e;
	}
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(array[i]);
		}
	}
	/**
	 * ���޵� ������̵� ��ġ�Ǵ� �����ü(�����Ͼ�,�Ŵ��� ����)�� ȣ���� ������
	 * ��ȯ�ϴ� �޼��� 
	 * ���� ������̵� ��ġ�ϴ� �����ü�� �迭�� �������� �ʴ� �ٸ� null�� ��ȯ.
	 * @param empId
	 * @return
	 */
	public Employee findById(String empId) {
		Employee emp=null;
		for(int i=0;i<index;i++) { //�迭��Ұ� �����Ҷ������� �ݺ��ϸ� �ȴ� 
			//���޵� �����ȣ�� �迭����� �����ȣ�� ��ġ�ϸ� 
			if(empId.equals(array[i].getEmpId())) {
				emp=array[i];
				break; // ���๮�� ����� 
			}
		}
		return emp;
	}
	/**
	 * ������̵� �ش��ϴ� ����� index ��ġ�� ��ȯ�ϴ� �޼��� 
	 * ���� ��ġ�Ǵ� ������̵� �ش��ϴ� ��Ұ� �迭�� ���ٸ� -1�� ��ȯ 
	 * @param empId
	 * @return
	 */
	public int findIndexByEmpId(String empId) {
		int position=-1;
		for(int i=0;i<index;i++) {
			//������̵� �迭��һ�����̵�� ��ġ�ϸ�
			if(empId.equals(array[i].getEmpId())) {
				position=i;// �迭����� ��ġ�� ���������� �Ҵ��Ѵ� 
				break;
			}
		}
		return position;
	}
	/**
	 * �Ű������� ���޵� ������̵�� �迭����� �����ü�� ������̵� ��ġ�ϸ�
	 * �ش� �迭��Ҹ� �����ϴ� �޼��� 
	 * 1. findIndexByEmpId() �޼��带 �̿��� ������̵� �ش��ϴ� �迭�����
	 *    ��ġ�� ��ȯ�޴´�. ���� ��ġ�ϴ� ����� ������ -1 �� ��ȯ�ȴ� 
	 * 2. -1 �� ��ȯ�Ǹ� ��ġ�ϴ� ����� �����ϴ� ��� �޼����� ����ϰ� �۾����� 
	 * 3. -1 �� �ƴϸ� ��ġ�ϴ� ����� ������ �ش� ����� ��ġ�� ���� �̿���
	 * 	    �� �������� index(�����) ���� ���� ���� ��� �ݺ��ϸ鼭 �� ��Ҹ� 
	 *     �տ�ҿ� �Ҵ��ϴ� ������� �����Ѵ� 
	 *     3.1 ���� ������Ұ� ������ ��Ҷ�� ( array[i]=array[i+1] -> �Ұ��� )
	 *          ���� null�� �Ҵ��Ѵ� 
	 * @param empId
	 */
	public void removeById(String empId){
		int position=findIndexByEmpId(empId);//���� ��� �迭 ��� ��ġ ��ȯ 
		if(position==-1) {//���� ����� ������ 
			System.out.println(empId+" ������̵� �ش��ϴ� ����� ��� �����Ұ�!");
		}else {//���� ����� �迭�� ������ �����Ѵ� 
			for(int i=position;i<index;i++) {
				if(i+1==array.length) {//������ ��Ҹ� ������ ���� ���� null �� �Ҵ� 
					array[i]=null;
				}else {
					array[i]=array[i+1];
				}
			}//for
			index--; // ���� �����Ƿ� index�� 1 ���ҽ�Ų�� 
		}//else		
	}//method
}//class



























