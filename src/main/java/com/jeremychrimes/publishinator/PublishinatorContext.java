package com.jeremychrimes.publishinator;

class PublishinatorContext {
    private ListenerStore listenerStore;
    private Publishinator publishinator;
    private EventQueue eventQueue;

    public PublishinatorContext() {
        this.listenerStore = new ListenerStore();
        this.publishinator = new Publishinator(this);
        this.eventQueue = new EventQueue();
    }

    public ListenerStore getListenerStore() {
        return listenerStore;
    }

    public Publishinator getPublishinator() {
        return publishinator;
    }

    public EventQueue getEventQueue() {
        return eventQueue;
    }
}
