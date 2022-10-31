package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);//12(Month -1)
		cal.set(Calendar.DATE,24);
		
		cal.set(2020, 11, 24);
		cal.add(Calendar.DATE, -1000); // 날짜 더하기 , 빼기
		printDate(cal);
		}

	private static void printDate(Calendar cal) {
		final String[] DAYS = {"일" , "월", "화", "수", "목", "금", "토"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0 ~11 +1
		int date = cal.get(Calendar.DATE);
		int day  = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~ 7 (토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println((year) + "-" + (month + 1) + "-"
				+ date + " "
				+ DAYS[day-1] + "요일 "
				+ hour + ":" + minute + ":" + second);		
		}

}
