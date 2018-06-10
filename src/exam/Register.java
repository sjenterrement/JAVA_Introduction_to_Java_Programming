package exam;

import java.util.Scanner;

/*
 * readme：实现会员注册，要求用户名长度不小于3，密码长度不小于6，注册时两次输入密码必须相同（字符串）
 */
public class Register {

	String name;
	String password;
	String newPassword;

	public void registerExe() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名，密码并再确认密码");
		System.out.print("用户名：");
		name = input.next();
		System.out.print("密码：");
		password = input.next();
		System.out.print("再次输入密码：");
		newPassword = input.next();

		while (name.length() < 3 || (password.equals(newPassword) == false) || (password.length() < 6)) {
			if (name.length() < 3) {
				System.out.println("用户名不能小于3");
			}
			if ((password.equals(newPassword) == false) || (password.length() < 6)) {
				System.out.println("两次输入密码不一样或密码不能小于6位");
			}

			System.out.println("\n" + "请重新输入");
			System.out.print("用户名：");
			name = input.next();
			System.out.print("密码：");
			password = input.next();
			System.out.print("再次输入密码：");
			newPassword = input.next();

		}
		System.out.println("注册成功！");

	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register n1 = new Register();
		n1.registerExe();

	}*/
}
