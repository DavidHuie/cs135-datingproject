package messaging;

import java.sql.Date;

public class Message implements Comparable<Message>{
	String sender;
	String recipient;
	String message_body;
	Date time_stamp;

	public Message(String sender, String recipient, String message_body,  Date time_stamp) {
		this.sender = sender;
		this.recipient = recipient;
		this.message_body = message_body;
		this.time_stamp = time_stamp;
	}
	
	public int compareTo(Message m) {
		return this.time_stamp.compareTo(m.time_stamp);
	}
}