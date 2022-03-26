package com.jeremychrimes.publishinator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EventListener;

import static org.junit.jupiter.api.Assertions.*;

class ListenerStoreTest {

    private ListenerStore ls;
    private final String EVENT_ONE = "event-one";
    private final String EVENT_TWO = "event-two";
    @BeforeEach
    void setUp() {
        this.ls = new ListenerStore();
    }

    @Test
    void addListener() {
        this.ls.addListener(EVENT_ONE, new Listener() {
            @Override
            public void handle(Object payload) {

            }
        });

        this.ls.addListener(EVENT_ONE, new Listener() {
            @Override
            public void handle(Object payload) {

            }
        });

        this.ls.addListener(EVENT_TWO, new Listener() {
            @Override
            public void handle(Object payload) {

            }
        });

    }

    @Test
    void getListenersForEvent() {
        this.addListener();
        assertEquals(this.ls.getListenersForEvent(EVENT_ONE).size(), 2);
        assertEquals(this.ls.getListenersForEvent(EVENT_TWO).size(), 1);
        assertEquals(this.ls.getListenersForEvent("nothing").size(), 0);
    }
}