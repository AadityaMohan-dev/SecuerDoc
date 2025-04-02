package com.aaditya.securedoc.events.listner;

import com.aaditya.securedoc.events.UserEvent;
import com.aaditya.securedoc.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEventListener {
    private final EmailService emailService;
    @EventListener
    public void onUserEvent(UserEvent event){
        switch(event.getType()){
            case REGISTRATION -> emailService.sendNewAccountEmail(event.getUserEntity().getFirstName(), event.getUserEntity().getEmail(), (String) event.getData().get("key"));
            case RESET_PASSWORD -> emailService.sendPasswordResetEmail(event.getUserEntity().getFirstName(), event.getUserEntity().getEmail(),(String) event.getData().get("key"));
            default -> {}
        }
    }

}
