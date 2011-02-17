package com.g414.guice.lifecycle;

import com.google.inject.AbstractModule;

public class LifecycleModule extends AbstractModule {
    @Override
    protected void configure() {
        binder().bind(Lifecycle.class).asEagerSingleton();
    }
}
