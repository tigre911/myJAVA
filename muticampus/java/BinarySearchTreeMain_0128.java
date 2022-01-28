package algorismProject2;

import java.util.Scanner;

public class BinarySearchTreeMain {

	static Scanner s = new Scanner(System.in);
	
	//	�����͸� ���� ��ü
	static class Data{
		
		private int no;				//	�Է¹��� ��ȣ
		private String name;		//	�Է¹��� �̸�
		
		
		//
		static final int NO = 1;			//	��ȣ �Է� ���� �� ȭ��
		static final int NAME = 2;			//	�̸� �Է� ���� �� Ȯ��
		
		
		//	��ȣ�� ���� �� �ִ� �޼ҵ�
		Integer getKeyCode() {
			return no;
		}
		//	�̸����� �� �ִ� �޼ҵ�
		public String toString() {
			return name;
		}
		
		
		//	������ �Է¹޴� �޼ҵ�
		public void inData(String msg, int sw) {
//			System.out.println("��ǰ ���");
			
			if((sw&NO) == NO) {
				System.out.print("��ǰ ��ȣ : ");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME) == NAME) {
				System.out.print("��ǰ�� : ");
				name = s.nextLine();
			}
			System.out.println();
		}	
	}//	Data
	
	//	Menu
	enum Menu{
		ADD("��ǰ ����"),
		REMOVE("��ǰ ����"),
		SEARCH("��ǰ �˻�"),
		PRINT("��ü ��ǰ ��ȸ"),
		TERMINATE("����");
		private final String message;
		
		Menu(String msg){
			message = msg;
		}
		
		String getMessage() {
			return message;
		}
		
		//	����ڰ� �Է��� �޴���ü�� �����ϴ� �޼ҵ�
		static Menu menuAt(int idx) {
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) {
					return m;
				}
			}
			return null;
		}
	}//	Menu
	//	�޴� ����ϰ� ����ڿ��� �޴��� �Է¹��� �޼ҵ�
	//	    ��ȯ�� : ������ �޴� ��ü
	static Menu selectMenu() {
		int menuNo;
		do {	//	�޴��� �߸� �Է��ϸ� �ٽ� �Է¹ޱ� ���ؼ� �ݺ��� �����Ѵ�.
			for(Menu m : Menu.values()) {	//	�޴����
				System.out.printf("(%d) %s  ",m.ordinal()+1, m.getMessage());
			}
			System.out.println();
			System.out.print("�޴� ���� : ");
			menuNo = Integer.parseInt(s.nextLine())-1;	//	������ ����
		}while(menuNo < Menu.ADD.ordinal() || menuNo > Menu.TERMINATE.ordinal());
		return Menu.menuAt(menuNo);	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu m;
		
		///
		BinaryTree<Integer, Data> tree = new BinaryTree<Integer, Data>();
		Data data;
		///
		
		do {
			m = selectMenu();		//	����ڰ� ������ �޴�
			switch (m) {
			case ADD:				//	��ȣ, �̸��� �Է¹޾� Node�� �ְ� tree�� ����
				System.out.println("��ǰ ���");
				data = new Data();
				data.inData("ȸ������", data.NO | data.NAME);
				//	���ο� ��� �߰��ϱ�
				tree.add(data.getKeyCode(), data);
				break;
				
			case REMOVE:
				System.out.println("��ǰ ����");
				//	������ Ű�� �Է¹ޱ�
				data = new Data();
				data.inData("������ key", data.NO);
				boolean result = tree.remove(data.getKeyCode());
				////////
				if(result)
					System.out.println("��ǰ ���� �Ϸ�");
				else
					System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
				break;
			
			case SEARCH:
				System.out.println("��ǰ �˻�");
				data = new Data();
				data.inData("�˻��� key", data.NO);	//	key�� �����
				//	�˻��� ��������Ϲ޴´�.
				Data searchData = tree.search(data.getKeyCode());
				if(searchData == null) {
					System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
				}else {	//	�˻� ����� ���� ��
					System.out.println("��ǰ�� : "+searchData);
				}
				break;
				
			case PRINT:
				tree.print();
				System.out.println();
				break;
		
			}
		}while(m != Menu.TERMINATE);
		System.out.println("�����մϴ�.");
		//	���α׷� �����
	}

}


