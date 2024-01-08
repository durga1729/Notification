package com.platform.notification.service;

import java.util.Date;

public abstract class Notification {
    int notificationId;
    Date createdOn;
    String content;
    public abstract boolean sendNotification();
}
