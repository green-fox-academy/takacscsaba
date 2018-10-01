package com.greenfoxacademy.restbackend.models;

public class Doubled {
    private Integer received;
    private Integer result;

    public Doubled(Integer received) {
        this.received = received;
        this.result = received*2;
    }

    public Doubled() {
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(Integer recieved) {
        this.received = recieved;
    }

    public int getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
