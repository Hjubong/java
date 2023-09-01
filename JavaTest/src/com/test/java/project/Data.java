package com.test.java.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Data {

	public static Set<Integer> teacherNumSet;

	public static Set<String> targetSet;

	public static ArrayList<Lecture> list;

	static {
		Data.targetSet = new HashSet<>();

		Data.teacherNumSet = new HashSet<>();

		Data.list = new ArrayList<Lecture>();
	}

	public static void load() {

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\user\\Desktop\\우리2조 프로젝트\\06.데이터\\이문강의최종.txt"));

			String line = null;

			line = reader.readLine();

			while ((line = reader.readLine()) != null) {

				line = line.replace("\"", ""); // 파일의 "" 제거
				
				// System.out.println(line);

				String[] temp = line.split(",");

				// System.out.println(Arrays.toString(temp));

				// temp[1] 카테고리, temp[2] 강좌명, temp[3]시작시간, temp[4]요일, temp[5]대상, temp[6]수강료,
				// temp[7]정원 데이터에서 가져와야함

				// 만들어야하는 변수 강좌번호(k) 강사번호(f) 강좌내용(수정이) 시작날짜(년월) 강의실번호(f)

				Lecture lecture = new Lecture(temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);

				Data.list.add(lecture);

				String target = getTarget(temp[5]);

			}
			reader.close();

			String teacherNum = getTeacherNum(); // 강사 번호

			System.out.println(Data.targetSet);

			for (Lecture l : Data.list) {
				// System.out.println(l.toString());
			}

		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}

	}

	
	private static String getTarget(String string) {

		Data.targetSet.add(string);

//		System.out.println(targetSet);

		return string;
	}

	
	private static String getTeacherNum() {

		Random random = new Random();

		int num = 0;

		while (true) {

			num = random.nextInt(150) + 1;

			if (!Data.teacherNumSet.contains(num)) {

				Data.teacherNumSet.add(num);

				break;
			}

		}

		System.out.printf("T%03d", num);

		return String.format("T%03d", num);
		// 1부터 150까지 넘버링

	}

//	private static String getTeacherNum() {
//
//	      Random random = new Random();
//
//	      String num = "";
//
//	      boolean flag = true;
//
//	      while (flag) {
//
//	         num = "" + (random.nextInt(150) + 1);
//
//	         if (!Data.set.contains(num)) {
//	            Data.set.add(num);
//	            flag = false;
//	         }
//	      }
//
//	      System.out.println(num);
//
//	      return num;
//	   }

}
