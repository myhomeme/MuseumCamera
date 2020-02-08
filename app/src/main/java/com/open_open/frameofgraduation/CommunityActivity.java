package com.open_open.frameofgraduation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        TextView t1 = (TextView)findViewById(R.id.textView4);
        String details=community();
        t1.setText(details);
    }


    /*
    * 互动社区平台内容函数
    * */
    private String community() {

        return "community()函数返回内容平台数据";
    }

}
