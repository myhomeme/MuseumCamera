package com.open_open.frameofgraduation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        String details=textDetail();
        t1.setText(details);
    }

    /*
    * 请求返回文物详情文本内容函数
    * */
    private String textDetail() {

        return "拍照后，利用myOpenCV（）函数返回值进行网络请求例如：http://192.168.0.0/demo/pic，成功再获取数据到本页面";
    }

}
