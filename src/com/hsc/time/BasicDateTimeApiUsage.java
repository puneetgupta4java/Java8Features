package com.hsc.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class BasicDateTimeApiUsage {
	public static void main(String[] args) {
		// Current Date
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime = " + today);

		// Current Date using LocalDate and LocalTime
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime = " + today);

		// Creating LocalDateTime by providing input arguments of year, month,
		// day, hour, minute, seconds and milliseconds
		LocalDateTime specificDate = LocalDateTime.of(2020, Month.APRIL, 1, 10, 10, 30, 40);
		System.out.println("Specific Date = " + specificDate);

		// New Instant class for working on time stamp
		Instant instant = Instant.now();
		System.out.println("Current timestamp is " + instant);

		// to print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = today.format(format);

		System.out.println("in formatted manner " + formatedDateTime);

		// printing months days and seconds
		Month month = today.getMonth();
		int day = today.getDayOfMonth();
		int seconds = today.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);
		LocalDateTime changedDate = today.withDayOfMonth(24).withYear(2016);

		System.out.println("specfic date with " + "current time : " + changedDate);
	}
}
