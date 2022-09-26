package com.Surge.FactoryMethodPatternExamples.ExamplePattern3;

class SMSNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending an SMS notification");
	}
}
