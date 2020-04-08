package com.hsc.time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class BasicTimeApiUsage {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current Time=" + time);

		// Creating LocalTime by providing input arguments
		LocalTime specificTime = LocalTime.of(14, 20, 25, 40);
		System.out.println("Specific Time of Day=" + specificTime);

		// Current date in "Asia/Kolkata", you can get it from ZoneId
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST=" + timeKolkata);

		// We can add number of Days,hours,minutes,seconds,milliseconds and
		// nanoseconds using new class Duration and also extract
		// the duration between two times
		Duration twoHours = Duration.ofHours(2);
		LocalTime time2 = time.plus(twoHours);
		System.out.println(time2);
		
		Duration duration = Duration.between(time, time2);
		System.out.println(duration);
		
	}

}
