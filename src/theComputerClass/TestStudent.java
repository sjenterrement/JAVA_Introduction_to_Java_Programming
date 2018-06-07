package theComputerClass;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager manager = new Manager();
		System.out.println("1.添加学生\n2.删除学生\n3.查询学生\n4.修改学生\n5.打印学生\n6.统计学生\n7.退出");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			int input = 9;
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Wrong operation.");
				flag = false;
			}
			switch (input) {
			case 1:
				System.out.println("Enter the information(stuno,name,math,english,computer):");
				Student student1 = new Student();
				student1.setStuno(scanner.next());
				student1.setName(scanner.next());
				student1.setMath(scanner.nextFloat());
				student1.setEnglish(scanner.nextFloat());
				student1.setComputer(scanner.nextFloat());
				if (manager.addStudent(student1))
					System.out.println("success");
				else
					System.out.println("Enter the stuno:");
				if (manager.removeStudent(scanner.next()))
					System.out.println("success.");
				else
					System.out.println("fail");
				break;

			case 2:
				System.out.println("Enter the stuno:");
				if (manager.removeStudent(scanner.next()))
					System.out.println("success.");
				else
					System.out.println("fail.");
				break;
			case 3:
				System.out.println("Enter the stuno or name:");
				Student student3 = manager.findStudent(scanner.next());
				if (student3 != null) {
					System.out.println(student3.getStuno() + "\t\t" + student3.getName() + "\t\t" + student3.getMath()
							+ "\t\t" + student3.getEnglish() + "\t\t" + student3.getComputer());
				} else
					System.out.println("There is no such a student.");
				break;

			case 4:
				System.out.println("Enter the changest student(stuno,name,math,english,computer):");
				Student student4 = new Student();
				student4.setStuno(scanner.next());
				student4.setName(scanner.next());
				student4.setMath(scanner.nextFloat());
				student4.setEnglish(scanner.nextFloat());
				student4.setComputer(scanner.nextFloat());
				if (manager.changeStudent(student4))
					System.out.println("change success.");
				else
					System.out.println("change fail.");
				break;

			case 5:
				manager.print();
				break;
			case 6:
				try {
					manager.caculate();
					break;

				} catch (Exception e) {
					System.out.println("There is no student.");
				}
			case 7:
				flag = false;
				System.out.println("退出.");
				break;
			default:
				System.out.println("Wrong operation.");

			}
		}

	}

}
