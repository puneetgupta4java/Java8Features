package com.hsc.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class BasicDateApiUsage {
	public static void main(String[] args) {
		LocalDate date = LocalDate.ofEpochDay(365 * 51 - 120);
		System.out.println(date);
		System.out.println(LocalDate.now());

		// Get normal date by providing date, month and year
		LocalDate firstDayApril = LocalDate.of(2020, Month.APRIL, 1);
		System.out.println(firstDayApril);

		// We can get the current date on the basis of particular zone
		LocalDate date_india = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(date_india);

		// Get particular day of the particular year
		LocalDate hundredDay2020 = LocalDate.ofYearDay(2020, 150);
		System.out.println(hundredDay2020);

		// Get period between dates which gives us data in number of
		// years,months and days between both of dates
		Period gap = Period.between(hundredDay2020, date_india);
		System.out.println(gap);
		
		date = LocalDate.now();
		//Now we can simply add months,years,weeks,days in any date
		System.out.println("After adding two years "+date.plusYears(2));
		System.out.println("Add three months "+date.plusMonths(3));
		System.out.println("Adding four weeks "+date.plusWeeks(4));
		System.out.println("Adding five days "+date.plusDays(5));
		System.out.println("Adding 2 decades "+date.plus(2, ChronoUnit.DECADES));
	}
}
