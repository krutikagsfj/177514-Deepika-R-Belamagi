package com.cg.tms.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.exception.InvalidPriorityException;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;


public class MainUI
{	
	static Scanner sc=new Scanner(System.in);
	static TicketService tserv=null;
	static boolean res=true;
	public static void main(String[] args)
	{
		
		
		int a;
			do{
			System.out.println("Welcom to ITIMD Help Desk");	
			System.out.println("1.Raise a Ticket\n 2.Exit from the system");
			
			//System.out.println("recharge successful on:"+LocalDate.now());
			
		
			switch(sc.nextInt())
			{
				case 1:					
					int ticketID=raiseNewTicket();
				System.out.println("ticket number "+"logged successfully at"+LocalDate.now()+LocalDateTime.now());
					
					
				break;
					
				case 2:System.out.println("quit from application");
					
					break;
					
				
				default:
					break;
					
			}
			System.out.println("do you wann continue 1/0 ");
			 a=sc.nextInt();
		}while(a!=0);
	}
	
	static String ticketCategoryId=null;
	static String ticketStatus=null;
	static String ticketDescription=null;
	static String ticketPriority=null;
	

		public static int raiseNewTicket()
		{
			tserv=new TicketServiceImpl(); 
			//System.out.println("enter the ticket category");
			
			
			System.out.println("enter ticket category from below list");
			viewTicketCategory();
			ticketCategoryId = sc.next();
			//int b=sc.nextInt();
				
			
			System.out.println("enter the ticket description");
			ticketDescription = sc.next();
			
			
			do {
				try 
				{
					System.out.println("enter the ticket priotity");
					ticketPriority = sc.next();
					res = tserv.validatePriority(ticketPriority);
				} catch (InvalidPriorityException e){
				System.out.println(e.getMessage());
			}
		} while(!res);
	
			res=false;
			
			System.out.println("enter the ticket status");
			ticketStatus = sc.next();
			
			
	
	TicketBean ticketBean1=new TicketBean( ticketCategoryId,ticketDescription,ticketPriority,ticketStatus);
	
	
		int id=tserv.raiseNewTicket( ticketBean1);
		return id;
		
	
		
		}
		public static Map<String, String> viewTicketCategory()
		{
			tserv=new TicketServiceImpl();
			return tserv.viewTicketCategory();
		}
		
	}


