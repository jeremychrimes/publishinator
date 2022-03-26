package com.jeremychrimes.publishinator;

import java.util.LinkedList;
import java.util.Queue;

class EventQueue {
    private Queue<Event> que;

    protected EventQueue() {
        this.que = new LinkedList<Event>();
    }

    protected void queueEvent(String eventName, Object payload) {
        queueEvent(new Event(eventName, payload));
    }

    protected void queueEvent(Event event) {
        this.que.add(event);
    }

    protected Event dequeEvent(){
        return this.que.poll();
    }

}
