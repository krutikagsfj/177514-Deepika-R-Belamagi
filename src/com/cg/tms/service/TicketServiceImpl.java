package com.cg.tms.service;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.exception.InvalidPriorityException;
//import com.cg.tms.dto.TicketCategory;



	
	

public class TicketServiceImpl implements TicketService 
{
	TicketDAO idao=null;
	
	private int generateTicketNo(){
		int id=0;
		id=(int) (Math.random()*10000);
		return id;
		}


	@Override
	public int raiseNewTicket(TicketBean ticketBean)
	{
		
		ticketBean.setTicketNo(generateTicketNo());
		idao=new TicketDAOImpl();
		return idao.raiseNewTicket(ticketBean);
	}
	@Override
	public Map<String, String> viewTicketCategory()
	{
		idao=new TicketDAOImpl();
		return idao.viewTicketCategory();
	}

	public boolean validatePriority(String plan) throws InvalidPriorityException
	{

		if(!Pattern.compile("(low|medium|high)").matcher(plan).find())
		{
		throw new InvalidPriorityException("invalid plan");
		}
		return true;
		
		
		
		}
	

}
