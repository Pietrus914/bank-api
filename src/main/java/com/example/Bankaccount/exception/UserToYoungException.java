package com.example.Bankaccount.exception;

public class UserToYoungException extends  RuntimeException{

    public UserToYoungException(Long id) {
        super("User with id number:  " + id + " is to young!");
    }
}
