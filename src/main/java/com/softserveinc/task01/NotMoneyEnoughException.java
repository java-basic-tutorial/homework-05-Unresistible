package com.softserveinc.task01;

public class NotMoneyEnoughException extends Error {

    public NotMoneyEnoughException(String message) {
        super(message);
    }

}
