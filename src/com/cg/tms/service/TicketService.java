package com.cg.tms.service;


import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.InvalidPriorityException;

public interface TicketService
{	
	int raiseNewTicket(TicketBean ticketBean);
	//List<TicketCategory>listTicketCategory();

	boolean validatePriority(String ticketPriority) throws InvalidPriorityException;

	public Map<String, String> viewTicketCategory();
}
