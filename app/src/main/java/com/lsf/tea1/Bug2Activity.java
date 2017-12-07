package com.lsf.tea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Bug2Activity extends AppCompatActivity {
    private RollPagerView mRollViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug2);
        String  name = getIntent().getStringExtra("teacher_name");
        String desc = getIntent().getStringExtra("teacher_desc");
        TextView textView1= (TextView) findViewById(R.id.textView1);
        //ImageView imageView = (ImageView) findViewById(R.id.teacher_large_imageView);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView1.setText(name);
       // imageView.setImageResource(imageId);
        textView.setText(desc);
    }
}




        /*mRollViewPager = (RollPagerView) findViewById(R.id.roll_view_pager);
       // TextView textView=(TextView)findViewById(R.id.news_item_content_text_view);
     // ViewFlipper  flipper= ( ViewFlipper) findViewById(R.id.flipper);
        //设置播放时间间隔
        mRollViewPager.setPlayDelay(1000*2);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager.setHintView(new ColorPointHintView(this, Color.YELLOW,Color.WHITE));
        //mRollViewPager.setHintView(new TextHintView(this));
        //mRollViewPager.setHintView(null);
    }

    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.t,
                R.drawable.b1_1,
                R.drawable.b1_2,
                R.drawable.b1_3,
                R.drawable.b1_4,
        };


        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }
    }

}*/