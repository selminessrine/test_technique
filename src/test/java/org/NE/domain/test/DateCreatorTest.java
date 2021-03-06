package org.NE.domain.test;

import static org.NE.matchers.DayMonthYearMatcher.hasDayMonthYear;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.NE.builders.DateCreator;
import org.junit.Test;

public class DateCreatorTest {
	
	@Test public void
	should_create_a_date_from_string() {
		Date date = DateCreator.date("10/01/2012");
		
		assertThat(date, hasDayMonthYear(10, 1, 2012));
	}
	
}
