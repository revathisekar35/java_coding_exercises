package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
	private LocalDateTime localDatetime;
	private final int GIGA_SECONDS = 1000000000;

	public Exercise004(LocalDate date) {
		localDatetime = date.atStartOfDay();
	}

	public Exercise004(LocalDateTime dateTime) {
		localDatetime = dateTime;
	}

	/**
	 * Adding gig seconds to localDatetime
	 * 
	 * @return
	 */
	public LocalDateTime getDateTime() {
		return localDatetime.plusSeconds(GIGA_SECONDS);
	}
}
