package com.aaditya.securedoc.events;

import com.aaditya.securedoc.entity.UserEntity;
import com.aaditya.securedoc.enumeration.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class UserEvent {
    private UserEntity userEntity;
    private EventType type;
    private Map<?,?> data;
}
