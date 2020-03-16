package com.gruita.kb.ioc.otto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.gruita.kb.ioc.otto.events.EventCompleteTask;
import com.gruita.kb.ioc.otto.events.EventReset;
import com.gruita.kb.ioc.otto.events.EventTaskCancel;


/**
* Should be replaced with LiveData now. 
* Will add a new project
*/
public class MainActivity extends Activity implements OnClickListener{
	
	
	private static final String TAG_COMPLETE_TASK_DIALOG = "TASK_COMPLETE_DIALOG";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button button = (Button) findViewById(R.id.btnCancel);
		button.setOnClickListener(this);

        button = (Button) findViewById(R.id.btnComplete);
        button.setOnClickListener(this);

        button = (Button) findViewById(R.id.btnReset);
        button.setOnClickListener(this);
	
		
	}



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCancel:
//			send cancel event
                OttoApplication.getEventBus().post(new EventTaskCancel());
                break;
            case R.id.btnComplete:

//			send complete event
                OttoApplication.getEventBus().post(new EventCompleteTask("Scored!"));

                break;

            case R.id.btnReset:

//			send complete event
                OttoApplication.getEventBus().post(new EventReset());

                break;

            default:
                break;
        }

    }

	
	
	
}
