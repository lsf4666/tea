package com.lsf.tea1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 项目名称：EditSearch
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2016/4/25 17:31
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class UserAdapter extends ArrayAdapter<User> {

    private Context mContext;

    /**
     * Contains the list of objects that represent the data of this Adapter.
     * Adapter数据源
     */
    private List<User> mDatas;

    private LayoutInflater mInflater;

    //过滤相关
    /**
     * This lock is also used by the filter
     * (see {@link #getFilter()} to make a synchronized copy of
     * the original array of data.
     * 过滤器上的锁可以同步复制原始数据。
     */


    // A copy of the original mObjects array, initialized from and then used instead as soon as
    // the mFilter ArrayFilter is used. mObjects will then only contain the filtered values.
    //对象数组的备份，当调用ArrayFilter的时候初始化和使用。此时，对象数组只包含已经过滤的数据。



    public UserAdapter(Context context,int resource, List<User> datas) {
        super(context, resource, datas);
        mContext = context;
        mDatas = datas;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return mDatas.size() > 0 ? mDatas.size() : 0;
    }



    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       final User user =mDatas.get(position);
       convertView = mInflater.inflate(R.layout.item_user, parent, false);
       ImageView imageView = (CircleImageView) convertView.findViewById(R.id.iv_avatar);
       TextView textView = (TextView) convertView.findViewById(R.id.tv_name);
        imageView.setImageResource( user.getAvatarResId());
        textView.setText( user.getName());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                Intent intent = new Intent( mContext, Bug2Activity.class);

                // 往Intent中传入Teacher相关的数据，供TeacherDetailActivity使用
                intent.putExtra("teacher_name", user.getName());
                intent.putExtra("teacher_desc", user.getDesc());

                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                mContext.startActivity(intent);
            }
        });

        return convertView;
    }

}
