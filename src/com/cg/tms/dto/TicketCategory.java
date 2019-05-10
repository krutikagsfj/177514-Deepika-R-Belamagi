package com.cg.tms.dto;

public class TicketCategory 
{
	private String ticketCategoryId;
	private String ticketCategoryName;
	
	
	
	
	public TicketCategory() {
		super();
	}
	

	public TicketCategory(String ticketCategoryId, String ticketCategoryName) {
		super();
		this.ticketCategoryId = ticketCategoryId;
		this.ticketCategoryName = ticketCategoryName;
	}
	
	public String getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getTicketCategoryName() {
		return ticketCategoryName;
	}

	public void setTicketCategoryName(String ticketCategoryName) {
		this.ticketCategoryName = ticketCategoryName;
	}

	@Override
	public String toString() {
		return "TicketCategory [ticketCategoryId=" + ticketCategoryId
				+ ", ticketCategoryName=" + ticketCategoryName + "]";
	}

	

}
