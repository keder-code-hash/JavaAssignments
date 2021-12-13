class MainTest {
	Teacher teacher[] = new Teacher[5];
	Student student[] = new Student[5];

	MainTest() {
		for (int i = 0; i < 5; i++) {
			this.teacher[i] = new Teacher("teacher" + i, "1234","a"+i);
		}
		for (int i = 0; i < 5; i++) {
			this.student[i] = new Student("student" + i, "2345","cse"+i,"a");
		}
	}

	public static void main(String[] args) {

		MainTest t1 = new MainTest();
		System.out.println(t1.teacher[0].toString());
		System.out.println(t1.teacher[1].toString());
		System.out.println(t1.teacher[2].toString());

		System.out.println(t1.student[0].toString());
		System.out.println(t1.student[1].toString());
		System.out.println(t1.student[2].toString());
		// System.out.println(t1.getType());
	}
}