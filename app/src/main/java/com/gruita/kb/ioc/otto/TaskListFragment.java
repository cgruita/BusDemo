package com.gruita.kb.ioc.otto;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gruita.kb.ioc.otto.events.EventCompleteTask;
import com.gruita.kb.ioc.otto.events.EventReset;
import com.gruita.kb.ioc.otto.events.EventTaskCancel;
import com.squareup.otto.Subscribe;

/**
 * Created by Cristian Gruita on 3/14/15.
 */
public class TaskListFragment  extends BaseFragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View inflatedView = inflater.inflate(R.layout.tasklist, container, false);
            tv = (TextView)inflatedView.findViewById(R.id.btnTargetTop);


            return inflatedView;


        }

        @Subscribe
        public void onTestEvent(EventTaskCancel event) {
            tv.setText("TaskList: Completion Cancelled");
        }


        @Subscribe
        public void onTestEvent(EventCompleteTask event) {

            tv.setText("TaskList: completion: " + event.getMessage());
        }

        @Subscribe
        public void onTestEvent(EventReset event) {

            tv.setText("TaskList: Initial text");
        }






}
