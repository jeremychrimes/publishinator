package com.jeremychrimes.publishinator;

public class Event {
    private String eventName;
    private Object eventPayload;

    public Event(String eventName, Object eventPayload) {
        this.eventName = eventName;
        this.eventPayload = eventPayload;
    }

    public String getEventName() {
        return eventName;
    }

    public Object getEventPayload() {
        return eventPayload;
    }
}
