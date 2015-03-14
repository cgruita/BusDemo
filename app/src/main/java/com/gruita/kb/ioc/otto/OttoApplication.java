package com.gruita.kb.ioc.otto;

import android.app.Application;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Application class
 */
public class OttoApplication extends Application{

    /**
     * Event bus object. Only one needed for the whole app.
     * It will be used to pass event objects.
     */
    private static Bus mEventBus = null;


    public static Bus getEventBus() {
        if(mEventBus == null) {
            mEventBus = new Bus(ThreadEnforcer.ANY);
        }
        return mEventBus;
    }

}