package com.example.hyunwoo.sampledialog;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Hyunwoo on 2016. 7. 26..
 */
public class ChatItemView extends LinearLayout {

    TextView messageView;

    public ChatItemView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.chat_item , this);

        // View Initialize
        messageView = (TextView) findViewById(R.id.messageView);

    }

    public void setMessageView(String message) {
        messageView.setText(message);
    }




}








