package com.cg.tms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO
{
	static  Map<Integer,TicketBean> tlist=new HashMap<Integer,TicketBean>();
    
	@Override
	public int raiseNewTicket(TicketBean ticketBean) {
		tlist.put(ticketBean.getTicketNo(),ticketBean );
		System.out.println(tlist);
		return ticketBean.getTicketNo();	
		
	}
	
	public Map<String, String> viewTicketCategory() {
		
		return Util.getTicketCategoryEntries();
	}

	
	
}
