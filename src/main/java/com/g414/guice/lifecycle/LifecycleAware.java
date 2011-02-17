package com.g414.guice.lifecycle;

import com.google.inject.Inject;

public interface LifecycleAware {
    @Inject
    void register(Lifecycle lifecycle);

    public void eventFired(LifecycleEvent event);
}
