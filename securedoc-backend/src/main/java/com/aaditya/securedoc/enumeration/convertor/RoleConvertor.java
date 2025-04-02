package com.aaditya.securedoc.enumeration.convertor;

import com.aaditya.securedoc.enumeration.Authority;
import jakarta.persistence.AttributeConverter;

import java.util.Arrays;

public class RoleConvertor implements AttributeConverter<Authority, String> {
    @Override
    public String convertToDatabaseColumn(Authority authority) {
        if(authority == null) return null;
        return authority.getValue();
    }

    @Override
    public Authority convertToEntityAttribute(String code) {
        if (code == null) return null;
        return Arrays.stream(Authority.values())  // Stream over all Authority enum values
                .filter(authority -> authority.getValue().equals(code))  // Filter by code
                .findFirst()  // Get the first match (if any)
                .orElseThrow(IllegalArgumentException::new);
    }
}
