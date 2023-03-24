package com.codewitharjun.fullstackbackend.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id) {
        super("User not found ID :" + id);
    }
}
