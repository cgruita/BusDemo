package com.gruita.kb.ioc.otto.events;

/**
 * Event corresponding to completing a task
 */
public class EventCompleteTask {

    private String message;

    public EventCompleteTask(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
	
}
