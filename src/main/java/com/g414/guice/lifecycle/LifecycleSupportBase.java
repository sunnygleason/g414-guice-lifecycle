package com.g414.guice.lifecycle;

public abstract class LifecycleSupportBase implements LifecycleAware {
    @Override
    public void register(Lifecycle lifecycle) {
        lifecycle.register(this);
    }

    public void init() {
    }

    public void start() {
    }

    public void announce() {
    }

    public void unannounce() {
    }

    public void shutdown() {
    }

    public void stop() {
    }

    @Override
    public void eventFired(LifecycleEvent event) {
        switch (event) {
        case INIT:
            init();
            break;
        case START:
            start();
            break;
        case ANNOUNCE:
            announce();
            break;
        case UNANNOUNCE:
            unannounce();
            break;
        case SHUTDOWN:
            shutdown();
            break;
        case STOP:
            stop();
            break;
        }
    }
}
