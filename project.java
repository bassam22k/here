import java.util.Scanner;
		import java.util.Date;

public class project {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner Student_data = new Scanner(System.in);
				Scanner Semester_Average = new Scanner(System.in);

				String name;
				String num;
				int age;

				float[] Material = new float[5];
				float SeAvg;
				try {
					System.out.print("���� ���� : ");
					name = Student_data.nextLine();

					System.out.print("��������� ���� ���� : ");
					num = Student_data.nextLine();
					System.out.print("���� ���� : ");
					age = Student_data.nextInt();

					System.out.println("\n ������ �������  ");
					System.out.println("����� : " + name);
					System.out.println("����� : " + num);
					System.out.println("����� : " + age);
					System.out.println("");

					System.out.println("������ ����� ����� ������� ������ �� ������ ���� : ");
					System.out.print("1 ������� ������� : ");
					Material[0] = Semester_Average.nextFloat();
					System.out.print("1 �������� ����� ����� : ");
					Material[1] = Semester_Average.nextFloat();
					System.out.print("������ ������ : ");
					Material[2] = Semester_Average.nextFloat();
					System.out.print("1 �������� ����� ����� : ");
					Material[3] = Semester_Average.nextFloat();
					System.out.print("1 ������ �������� �� ����� : ");
					Material[4] = Semester_Average.nextFloat();
					SeAvg = (Material[0] + Material[1] + Material[2] + Material[3] + Material[4]) / 100;

					if (SeAvg >= 2.95) {
						for (double i = 0; i <= 10; i++) {
							System.out.println("�� ����� ���� ��� ����� ��� : " + SeAvg);
						}
					} else {
						{
							System.out.println("�� ����� !���� ��� ����: " + SeAvg);
						}
					}

					Date currentDate = new Date();
					String D = currentDate.toString();
					System.out.println("����� ����� : " + D);
					
				} catch (Exception e) {
					System.out.print(e.toString());
				} finally {
					Student_data.close();
					Semester_Average.close();

					doSomething();
				}
			}

			private static void doSomething() {
				System.out.println("Hello dear, I'm bassam thanks for using my program, see you soon");
			}

		

	}


