package com.bridgeit.behavioralPatterns;

import java.util.Observer;

public interface Subject 
{
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
	Object getUpdate(com.bridgeit.behavioralPatterns.Observer obj);
	public String getUpdate(MyTopicSubscriber obj);
	
}
