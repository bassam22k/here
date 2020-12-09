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
					System.out.print("ÃÓãß ÃÏÎá : ");
					name = Student_data.nextLine();

					System.out.print("ÇáÃßÇÏíãí ÑÞãß ÃÏÎá : ");
					num = Student_data.nextLine();
					System.out.print("ÚãÑß ÃÏÎá : ");
					age = Student_data.nextInt();

					System.out.println("\n ÇáØÇáÈ ãÚáæãÇÊ  ");
					System.out.println("ÇáÅÓã : " + name);
					System.out.println("ÇáÑÞã : " + num);
					System.out.println("ÇáÚãÑ : " + age);
					System.out.println("");

					System.out.println("ÇáÝÕáí ãÚÏáß áÍÓÇÈ ÇáÊÇáíÉ ÇáãæÇÏ Ýí ÏÑÌÇÊß ÃÏÎá : ");
					System.out.print("1 ÇáÈÑãÌÉ ÃÓÇÓíÇÊ : ");
					Material[0] = Semester_Average.nextFloat();
					System.out.print("1 ÇáÅäÊÑäÊ ÕÝÍÇÊ ÈÑãÌÉ : ");
					Material[1] = Semester_Average.nextFloat();
					System.out.print("ÇáÊÚáã ãåÇÑÇÊ : ");
					Material[2] = Semester_Average.nextFloat();
					System.out.print("1 ÇáÈíÇäÇÊ ÞæÇÚÏ ãÈÇÏÆ : ");
					Material[3] = Semester_Average.nextFloat();
					System.out.print("1 ÇáÍÇÓÈ ÊÊØÈíÞÇÊ Ýí ãÞÏãÉ : ");
					Material[4] = Semester_Average.nextFloat();
					SeAvg = (Material[0] + Material[1] + Material[2] + Material[3] + Material[4]) / 100;

					if (SeAvg >= 2.95) {
						for (double i = 0; i <= 10; i++) {
							System.out.println("åæ ãÚÏáß äÇÌÍ ÃäÊ ãÈÑæß ÃáÝ : " + SeAvg);
						}
					} else {
						{
							System.out.println("åæ ãÚÏáß !ÑÇÓÈ ÃäÊ ÚÐÑÇ: " + SeAvg);
						}
					}

					Date currentDate = new Date();
					String D = currentDate.toString();
					System.out.println("Çáíæã ÊÇÑíÎ : " + D);
					
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


