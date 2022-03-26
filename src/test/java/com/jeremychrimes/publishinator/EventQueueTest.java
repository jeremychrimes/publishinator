package com.jeremychrimes.publishinator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventQueueTest {
    private EventQueue eq;

    private final String EVENT_ONE = "event-one";
    private final String EVENT_TWO = "event-two";

    @BeforeEach
    void setUp() {
        this.eq = new EventQueue();
    }

    @Test
    void queueEvent() {
        this.eq.queueEvent(EVENT_ONE, new Object());
        this.eq.queueEvent(new Event(EVENT_TWO, new Object()));
    }

    @Test
    void dequeEvent() {
        this.queueEvent();
        assertEquals(this.eq.dequeEvent().getEventName(), EVENT_ONE);
        assertEquals(this.eq.dequeEvent().getEventName(), EVENT_TWO);
        assertEquals(this.eq.dequeEvent(), null);
    }
}