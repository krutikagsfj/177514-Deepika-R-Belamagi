package com.cg.tms.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;

public class Testticket 
{	
	
	static TicketDAO idao=null;
	@Before
	public static void setup()
	{
		idao=new TicketDAOImpl();
	}
	@After
	public void teardown()
	{
		idao=null;
	}

	@Test
	public void test() {
		TicketBean b=new TicketBean("234","done","low","new");
		b.setTicketPriority("low");
		Assert.assertNotNull("low",b.getTicketPriority());
		//Assert.assertEquals("low",b.getTicketPriority());
	}

}
