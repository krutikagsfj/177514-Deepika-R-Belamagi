package com.cg.tms.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class Util 
{

	private static HashMap<String, String> ticketCategory=new HashMap<String, String>();
	
	static TicketCategory t1=new  TicketCategory ("tc001","software installation");
	static TicketCategory t2=new  TicketCategory ("tc001","software installation");	
	static TicketCategory t3=new  TicketCategory ("tc001","software installation");
	
			public static Map<String, String>getTicketCategoryEntries()
			{
				 ticketCategory.put(t1.getTicketCategoryId(), t1.getTicketCategoryName());
				 ticketCategory.put(t1.getTicketCategoryId(), t2.getTicketCategoryName());
				 ticketCategory.put(t1.getTicketCategoryId(), t3.getTicketCategoryName());
			
	
			return ticketCategory;
		
		
			}
}	

