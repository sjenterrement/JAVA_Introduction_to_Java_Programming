package theComputerClass;

public class StuOperation {
	Student stuInfoArray[];
	int currentNum = 0;

	public StuOperation() {
		// TODO Auto-generated constructor stub
		stuInfoArray = new Student[35];
	}

	public Student[] getStuInfoArray() {
		return stuInfoArray;
	}

	public int getCurrentNum() {
		return currentNum;
	}

	public boolean addStudent(Student newStu) {
		if (currentNum < 35) {
			stuInfoArray[currentNum] = newStu;
			currentNum++;
			return true;
		} else {
			System.out.println("beyond the border");
			return false;
		}
	}

	public boolean deleStudent(String stuno) {
		for (int i = 0; i < stuInfoArray.length; i++) {
			if (stuInfoArray[i].equals(stuno)) {
				for (int j = i; j < stuInfoArray.length; j++)
					stuInfoArray[j] = stuInfoArray[j + 1];
				stuInfoArray[currentNum] = null;
				currentNum--;
				return true;
			}
		}
		return false;

	}
}
