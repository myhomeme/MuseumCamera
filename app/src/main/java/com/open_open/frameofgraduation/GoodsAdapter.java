package com.open_open.frameofgraduation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

class GoodsAdapter extends PagerAdapter {
    Context context;
    ArrayList<ImageView> ivGoodsList;
    public GoodsAdapter(Context context, ArrayList<ImageView> ivGoodsList){
        this.context=context;
        this.ivGoodsList=ivGoodsList;
    }

    @Override
    public int getCount() {
        return ivGoodsList.size();
    }



    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public ImageView instantiateItem(ViewGroup container, int position) {
        ImageView imageView=ivGoodsList.get(position);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ImageView imageView=(ImageView)object;
        container.removeView(imageView);
    }
}
