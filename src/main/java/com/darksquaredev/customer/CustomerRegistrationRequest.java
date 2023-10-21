package com.darksquaredev.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
