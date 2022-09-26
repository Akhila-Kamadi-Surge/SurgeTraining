package com.Surge.FactoryMethodPatternExamples.ExamplePattern3;

class NotificationService {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new  NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();

	}

}
