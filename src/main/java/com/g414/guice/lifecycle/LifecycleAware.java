package com.g414.guice.lifecycle;

/**
 * LifecycleAware instances receive LifecycleEvent notifications from the
 * Lifecycle instance.
 */
public interface LifecycleAware {
    /** receive a LifecycleEvent */
    public void eventFired(LifecycleEvent event);
}
