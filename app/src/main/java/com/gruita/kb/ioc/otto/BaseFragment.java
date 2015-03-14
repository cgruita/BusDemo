package com.gruita.kb.ioc.otto;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Base class for our fragments.
 * Used for registering and unregistering the bus objects
 */
public abstract class BaseFragment extends Fragment{
	
	protected TextView tv = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

    @Override
    public void onDestroy() {
        OttoApplication.getEventBus().unregister(this);
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        OttoApplication.getEventBus().register(this);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


}
