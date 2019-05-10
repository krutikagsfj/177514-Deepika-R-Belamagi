package com.cg.tms.dao;

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketDAO 
{
	int raiseNewTicket(TicketBean ticketBean);
	//List<TicketCategory>listTicketCategory();

	public Map<String, String> viewTicketCategory();
}
