package com.jeremychrimes.publishinator;

import java.util.Hashtable;
import java.util.LinkedList;

public class ListenerStore {
    private Hashtable<String, LinkedList<Listener>> eventListeners;

    protected ListenerStore() {
        this.eventListeners = new Hashtable<String, LinkedList<Listener>>();
    }

    protected void addListener(String eventName, Listener listener) {
        if (!this.eventListeners.containsKey(eventName))
            this.eventListeners.put(eventName, new LinkedList<Listener>());
        this.eventListeners.get(eventName).push(listener);
    }

    protected LinkedList<Listener> getListenersForEvent(String eventName) {
        return eventListeners.containsKey(eventName) ? eventListeners.get(eventName) : new LinkedList<Listener>();
    }

}
