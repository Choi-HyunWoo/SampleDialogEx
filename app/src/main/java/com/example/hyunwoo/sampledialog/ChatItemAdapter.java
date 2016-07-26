package com.example.hyunwoo.sampledialog;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hyunwoo on 2016. 7. 26..
 */
public class ChatItemAdapter extends BaseAdapter {

    List<String> items = new ArrayList<>();

    public void add(String message) {
        items.add(message);
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatItemView view;

        if (convertView == null) {
            view = new ChatItemView(parent.getContext());
        } else {
            view = (ChatItemView) convertView;
        }

        view.setMessageView(items.get(position));

        return view;
    }
}








