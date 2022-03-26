package com.jeremychrimes.publishinator;

public class EventPublisher {
    private PublishinatorContext context;

    protected EventPublisher(PublishinatorContext publishinatorContext) {
        this.context = publishinatorContext;
    }
}
