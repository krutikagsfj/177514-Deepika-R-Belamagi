package com.cg.tms.dto;

public class TicketBean 
{
	 private int ticketNo;
	 private String ticketCategoryId;
	 private String ticketDescription;
	 private String ticketPriority;
	 private String ticketStatus;
	 private String localDate;

	 public TicketBean(String ticketCategoryId, String ticketDescription,
			String ticketPriority, String ticketStatus) {
		super();
		this.ticketCategoryId = ticketCategoryId;
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
		this.ticketStatus = ticketStatus;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategoryId="
				+ ticketCategoryId + ", ticketDescription=" + ticketDescription
				+ ", ticketPriority=" + ticketPriority + ", ticketStatus="
				+ ticketStatus + ", localDate=" + localDate + "]";
	}
	
}
