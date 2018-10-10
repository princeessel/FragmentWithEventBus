package com.example.genius_otis.fragmentwitheventbus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;



public class BlankFragment extends Fragment implements View.OnClickListener{

    private TextView textView;
    private EditText editText;
    private Button button;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        EventBus.getDefault().register(this);
        View itemView = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = itemView.findViewById(R.id.textView);
        editText = itemView.findViewById(R.id.editText);
        button = itemView.findViewById(R.id.button1);
        button.setOnClickListener(this);
        return itemView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                BlankFragmentListener msg = new BlankFragmentListener(editText.getText().toString(), 0);
                EventBus.getDefault().post(msg);
                editText.setText("");
                break;
        }
    }

    @Subscribe
    public void onEvent(BlankFragmentListener msg){
        if(msg.getMessageID() != 0){
            textView.setText(msg.getMessage());
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}