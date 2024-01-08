package com.platform.notification.controller;

import com.platform.notification.service.NotificationService;
import com.sun.nio.sctp.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/getNotificationBySMS")
    public ResponseEntity<Boolean> getNotificationBySms() {
        return ResponseEntity.ok(notificationService.sendNotificationBySms());
    }

    @GetMapping("/getNotificationByEmail")
    public ResponseEntity<Boolean> getNotificationEmail() {
        return ResponseEntity.ok(notificationService.sendNotificationByEmail());
    }

}
