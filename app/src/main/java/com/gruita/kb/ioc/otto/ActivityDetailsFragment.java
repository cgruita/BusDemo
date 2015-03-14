package com.gruita.kb.ioc.otto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gruita.kb.ioc.otto.events.EventCompleteTask;
import com.gruita.kb.ioc.otto.events.EventReset;
import com.gruita.kb.ioc.otto.events.EventTaskCancel;
import com.squareup.otto.Subscribe;

public class ActivityDetailsFragment extends BaseFragment {
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {				
		
		
		View inflatedView = inflater.inflate(R.layout.activity, container, false);

		tv = (TextView)inflatedView.findViewById(R.id.btnTargetBottom);
		

		return inflatedView;	
		
		
	}
	

	@Subscribe
    /**
     * These method can have any name, but they need the annotation @Subscribe
     */
    public void onTestEvent(EventTaskCancel event) {
		tv.setText("Details: Completion Cancelled");
    }
	
	
	@Subscribe
    public void onTestEvent(EventCompleteTask event) {
			tv.setText("Details: completion: " + event.getMessage());
    }
	
	
	@Subscribe
    public void onTestEvent(EventReset event) {

        tv.setText("Details: Initial text");
    }
	

}
