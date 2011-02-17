package com.g414.guice.lifecycle;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Lifecycle {
    private final ConcurrentLinkedQueue<LifecycleAware> listeners = new ConcurrentLinkedQueue<LifecycleAware>();

    public void register(LifecycleAware listener) {
        listeners.add(listener);
    }

    public void init() {
        fireEvent(LifecycleEvent.INIT);
    }

    public void start() {
        fireEvent(LifecycleEvent.START);
    }

    public void announce() {
        fireEvent(LifecycleEvent.ANNOUNCE);
    }

    public void unannounce() {
        fireEvent(LifecycleEvent.UNANNOUNCE);
    }

    public void shutdown() {
        fireEvent(LifecycleEvent.SHUTDOWN);
    }

    public void stop() {
        fireEvent(LifecycleEvent.STOP);
    }

    private void fireEvent(LifecycleEvent event) {
        for (LifecycleAware listener : listeners) {
            listener.eventFired(event);
        }
    }
}
