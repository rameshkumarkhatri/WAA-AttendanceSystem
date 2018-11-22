package edu.mum.waa.tmattendanceservice.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AcademicCalendar {
	@Id
	private String calendarId;
	private int year;

	private List<Entry> entryList;

	public AcademicCalendar(Entry entry) {
		super();
		entryList = new ArrayList<>();
		entryList.add(entry);
	}

	public AcademicCalendar(String calendarId, int year, List<Entry> entryList) {
		super();
		this.calendarId = calendarId;
		this.year = year;
		this.entryList = entryList;
	}

	/**
	 * @return the calendarId
	 */
	public String getCalendarId() {
		return calendarId;
	}

	/**
	 * @param calendarId the calendarId to set
	 */
	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the entryList
	 */
	public List<Entry> getEntryList() {
		return entryList;
	}

	/**
	 * @param entryList the entryList to set
	 */
	public void setEntryList(List<Entry> entryList) {
		this.entryList = entryList;
	}

}
