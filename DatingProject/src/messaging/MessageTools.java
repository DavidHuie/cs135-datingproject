package messaging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import database.AccessDB;

public class MessageTools{
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public static ArrayList<Message> get_sender_messages(String username) throws SQLException {
		return resultset_to_list(get_sender_messages_resultset(username));
	}
	
	public static ArrayList<Message> get_recipient_messages(String username) throws SQLException {
		return resultset_to_list(get_recipient_messages_resultset(username));
	}
	
	public static ResultSet get_sender_messages_resultset(String username) {
		String query = "SELECT recipient, message_body, time_stamp FROM messages WHERE messages.sender = \"" + username + "\"";
		return AccessDB.get_result_set(query);
	}
	
	public static ResultSet get_recipient_messages_resultset(String username) {
		String query = "SELECT sender, message_body, time_stamp FROM messages WHERE messages.recipient = \"" + username + "\"";
		return AccessDB.get_result_set(query);
	}
	
	public static ArrayList<Message> resultset_to_list(ResultSet set) throws SQLException {
		if (set == null)
			return null;
		
		ArrayList<Message> message_list = new ArrayList<Message>();
		
		while(set.next()) {
			Message m = new Message(set.getString("sender"),
								set.getString("recipient"),
								set.getString("message_body"),
								set.getDate("time_stamp"));
			
			message_list.add(m);
		}
		
		Collections.sort(message_list);
		
		return message_list;
	}
	
	public static String get_timestamp() {
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public static void send_message(String sender, String recipient, String message) throws SQLException {
		String time_stamp = get_timestamp();
		String query = "INSERT INTO messages(sender, recipient, message, timestamp) " +
					   "VALUES(" + sender + "," + recipient + "," + message + "," + time_stamp + ")";
		AccessDB.execute_update_query(query);
	}

}
