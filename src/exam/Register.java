package exam;

import java.util.Scanner;

/*
 * readme��ʵ�ֻ�Աע�ᣬҪ���û������Ȳ�С��3�����볤�Ȳ�С��6��ע��ʱ�����������������ͬ���ַ�����
 */
public class Register {

	String name;
	String password;
	String newPassword;

	public void registerExe() {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û��������벢��ȷ������");
		System.out.print("�û�����");
		name = input.next();
		System.out.print("���룺");
		password = input.next();
		System.out.print("�ٴ��������룺");
		newPassword = input.next();

		while (name.length() < 3 || (password.equals(newPassword) == false) || (password.length() < 6)) {
			if (name.length() < 3) {
				System.out.println("�û�������С��3");
			}
			if ((password.equals(newPassword) == false) || (password.length() < 6)) {
				System.out.println("�����������벻һ�������벻��С��6λ");
			}

			System.out.println("\n" + "����������");
			System.out.print("�û�����");
			name = input.next();
			System.out.print("���룺");
			password = input.next();
			System.out.print("�ٴ��������룺");
			newPassword = input.next();

		}
		System.out.println("ע��ɹ���");

	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register n1 = new Register();
		n1.registerExe();

	}*/
}
