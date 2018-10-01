package com.greenfoxacademy.restbackend.models;

public class ErrorMessage {
    String error = "Please provide an input!";

    public ErrorMessage(String error) {
        this.error = error;
    }

    public ErrorMessage() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
