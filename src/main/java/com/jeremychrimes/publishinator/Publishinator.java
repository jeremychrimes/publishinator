package com.jeremychrimes.publishinator;

public class Publishinator {
    private PublishinatorContext context;
    private ListenerStore listenerStore;
    private EventQueue eventQueue;

    protected Publishinator(PublishinatorContext context) {
        this.context = context;
        this.listenerStore = context.getListenerStore();
    }

    public void addListener(String eventName, Listener listener) {
        listenerStore.addListener(eventName, listener);
    }

    public void publishEvent(String eventName, Object eventPayload) {
        publishEvent(new Event(eventName, eventPayload));
    }

    protected void publishEvent(Event event) {
        this.eventQueue.queueEvent(event);
    }
}
