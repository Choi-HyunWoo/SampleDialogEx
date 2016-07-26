package com.example.hyunwoo.sampledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListItemAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        mAdapter = new ListItemAdapter();
        listView.setAdapter(mAdapter);

        mAdapter.add(R.mipmap.ic_launcher, "최현우", "ㅇㅇㅇ");
        mAdapter.add(R.mipmap.ic_launcher, "조정욱", "ㅁㅁㅁ");
        mAdapter.add(R.mipmap.ic_launcher, "김세광", "ㄴㄴㄴ");
        mAdapter.add(R.mipmap.ic_launcher, "조윤민", "234");
        mAdapter.add(R.mipmap.ic_launcher, "황유지", "123");
        mAdapter.add(R.mipmap.ic_launcher, "최영서", "444");
        mAdapter.add(R.mipmap.ic_launcher, "진소린", "ㄸ");
        mAdapter.add(R.mipmap.ic_launcher, "차세훈", "ㄴㅇ");
        mAdapter.add(R.mipmap.ic_launcher, "서혁규", "ㅇㅈㄷ");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                ChatDialog dialog = new ChatDialog();
                dialog.show(getFragmentManager(), "");



                /*
                ListItem clickedItem = (ListItem) mAdapter.getItem(position);
                String clickedName = clickedItem.name;
                String clickedMessage = clickedItem.message;

                // 1. Alert Dialog
                // 1) Builder라는 객체로 Dialog를 정의
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setTitle("다이알로그 테스트 : "+clickedName);
                builder.setMessage("상태메세지 : "+clickedMessage);
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                    }
                });

                // 2) AlertDialog 객체를 생성 (builder 객체로)
                AlertDialog dialog = builder.create();

                // 3) dialog를 화면에 뿌림
                dialog.show();
                */


            }
        });

    }
}
