package com.g414.guice.lifecycle;

import com.google.inject.Inject;

public interface LifecycleRegistration {
    @Inject
    public void register(Lifecycle lifecycle);
}
