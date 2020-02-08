package com.open_open.frameofgraduation;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CommunityActivity extends Activity {
    ViewPager mvpGoods;
    ArrayList<Integer> mGoodsList;
    ArrayList<ImageView> mivGoodsList;
    GoodsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        TextView t1 = (TextView)findViewById(R.id.textView4);
        String details=community();
        t1.setText(details);
        //viewpage的初始化函数
        intiViewPage();
    }
    /*
     * 在进入主界面的时候进行页面的初始化操作函数
     * 主要由内容运营提供
     * */
    private void intiViewPage() {
/*
        //准备数据源
        mGoodsList=new ArrayList<>();
        mGoodsList.add(R.layout.activity_view_one);
        mGoodsList.add(R.layout.activity_view_two);

        mivGoodsList=new ArrayList<>();
        for(int i=0;i<mGoodsList.size();i++){
            ImageView iv=new ImageView(this);
            iv.setImageResource(mGoodsList.get(i));
            mivGoodsList.add(iv);
        }
        mAdapter=new GoodsAdapter(this,mivGoodsList);
        mvpGoods= (ViewPager) findViewById(R.id.vpGoods);
        mvpGoods.setAdapter(mAdapter);
*/


    }

    /*
    * 互动社区平台内容函数
    * */
    private String community() {

        return "community()函数返回内容平台数据";
    }

}
