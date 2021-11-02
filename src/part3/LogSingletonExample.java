package part3;

import java.util.ArrayList;

public class LogSingletonExample {

	public static LogSingletonExample THE_LOG = 
			new LogSingletonExample();
	
	private ArrayList<String> messages;
	private LogSingletonExample() {
		messages = new ArrayList<>();
	}
	
	public void writeMessage(String theMessage) {
		messages.add(theMessage);
	}
	
	public static void main(String[] args) {
		LogSingletonExample.THE_LOG.writeMessage("hello");
	}
}
