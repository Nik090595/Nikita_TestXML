package com.Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static  String GetDate() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
		LocalDateTime Current = LocalDateTime.now();
		String S = d.format(Current);
		return S;
	}
	
	public static void main(String[] args) {
		String Date = DateFormat.GetDate();
		System.out.println(Date);
	}
}
