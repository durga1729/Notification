package com.platform.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    Notification notification;


    public boolean sendNotificationBySms() {
        notification = new SmsNotification();
        return notification.sendNotification();
    }

    public boolean sendNotificationByEmail() {
        notification = new EmailNotification();
        return notification.sendNotification();
    }
}
