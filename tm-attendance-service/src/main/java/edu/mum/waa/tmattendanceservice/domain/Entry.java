package edu.mum.waa.tmattendanceservice.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Entry {
	@Id
	private String entryId;
	private LocalDate startDate;
	private LocalDate endDate;

	private String epochStartWeek;
	private String epochEndWeek;

	private List<Block> blockList;

	public Entry(Block block) {
		super();
		blockList = new ArrayList<>();
		blockList.add(block);
	}

	public Entry(String entryId, LocalDate startDate, LocalDate endDate, String epochStartWeek, String epochEndWeek,
			List<Block> blockList) {
		super();
		this.entryId = entryId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.epochStartWeek = epochStartWeek;
		this.epochEndWeek = epochEndWeek;
		this.blockList = blockList;
	}

	/**
	 * @return the entryId
	 */
	public String getEntryId() {
		return entryId;
	}

	/**
	 * @param entryId the entryId to set
	 */
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the epochStartWeek
	 */
	public String getEpochStartWeek() {
		return epochStartWeek;
	}

	/**
	 * @param epochStartWeek the epochStartWeek to set
	 */
	public void setEpochStartWeek(String epochStartWeek) {
		this.epochStartWeek = epochStartWeek;
	}

	/**
	 * @return the epochEndWeek
	 */
	public String getEpochEndWeek() {
		return epochEndWeek;
	}

	/**
	 * @param epochEndWeek the epochEndWeek to set
	 */
	public void setEpochEndWeek(String epochEndWeek) {
		this.epochEndWeek = epochEndWeek;
	}

	/**
	 * @return the blockList
	 */
	public List<Block> getBlockList() {
		return blockList;
	}

	/**
	 * @param blockList the blockList to set
	 */
	public void setBlockList(List<Block> blockList) {
		this.blockList = blockList;
	}

}
