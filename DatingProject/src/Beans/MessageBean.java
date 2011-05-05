package Beans;
import java.util.*;

public class MessageBean {
	private String sender;
	private String recipient;
	private String body;
	private String date;
	
	public MessageBean(String sender, String recipient, String body, String date)
	{
		this.sender = sender;
		this.recipient = recipient;
		this.body = body;
		this.date = date;
	}
	
	public MessageBean()
	{
		sender = "";
		recipient = "";
		body = "";
		date = "";
	}

	public String getSender()
	{
		return sender;
	}

	public void setSender(String param)
	{
		this.sender = param;
	}

	public String getRecipient()
	{
		return recipient;
	}

	public void SetRecipient(String param)
	{
		this.recipient = param;
	}

	public String getBody()
	{
		return body;
	}

	public void setBody(String param)
	{
		this.body = param;
	}
	
	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

}
