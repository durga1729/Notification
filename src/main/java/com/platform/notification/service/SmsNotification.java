package com.platform.notification.service;

public class SmsNotification extends Notification{
    @Override
    public boolean sendNotification() {
        return false;
    }
}
