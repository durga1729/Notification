package com.platform.notification.service;

public class EmailNotification extends Notification{
    @Override
    public boolean sendNotification() {
        return false;
    }
}
