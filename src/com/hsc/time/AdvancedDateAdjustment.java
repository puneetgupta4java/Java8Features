package com.hsc.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class AdvancedDateAdjustment {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		// to get the first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());

		System.out.println("firstDayOfNextMonth : " + dayOfNextMonth);

		// get the next saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

		System.out.println("next satuday from now is " + nextSaturday);

		// first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());

		System.out.println("firstDayOfMonth : " + firstDay);

		// last day of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());

		System.out.println("lastDayOfMonth : " + lastDay);

		LocalDate today = LocalDate.now();

		// Get the Year, check if it's leap year
		System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

		// Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

		// Create LocalDateTime from LocalDate
		System.out.println("Current Time=" + today.atTime(LocalTime.now()));

		// Subtract from dates
		System.out.println("10 days before today will be " + today.minusDays(10));
		System.out.println("3 weeks before today will be " + today.minusWeeks(3));
		System.out.println("20 months before today will be " + today.minusMonths(20));

		// Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= " + today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= " + lastDayOfYear);

		// Period between two dates
		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format= " + period);
		System.out.println("Months remaining in the year= " + period.getMonths());
	}
}