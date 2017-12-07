package com.lsf.tea1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Q1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fg1);

        UserAdapter teacherAdapter = new UserAdapter(this, R.layout.item_user, User.getAllTeachers_q());

        ListView listView = (ListView) findViewById(R.id.user_list);

        listView.setAdapter(teacherAdapter);
    }
}



   /* private List<Tea_b> fruitList = new ArrayList<Tea_b>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
        initFruits(); // 初始化水果数据
        Tea_b_Adapter adapter = new Tea_b_Adapter(b1Activity.this, R.layout.tea_b_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_viewb1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
              //  Tea_b fruit = fruitList.get(position);
               // Toast.makeText(b1Activity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
              //  Intent intent = new Intent(getContext(), Bug3Activity.class);
               // intent.putExtra("teacher_image",fruit.getImageId());
              //  intent.putExtra("teacher_desc", fruit.getDesc());
             //   getContext().startActivity(intent);
                if(position==1){
                Intent intent = new Intent(b1Activity.this,Bug2Activity.class);
                startActivity(intent);
                }

                if(position==2){
                    Intent intent = new Intent(b1Activity.this,Bug3Activity.class);
                    startActivity(intent);}
            }
        });
    }
    private void initFruits() {
        //for (int i = 0; i < 2; i++) {
            Tea_b apple = new Tea_b("炭疽病", R.drawable.t);
            fruitList.add(apple);
            Tea_b banana = new Tea_b("黑斑病", R.drawable.b2_1);
            fruitList.add(banana);
            Tea_b orange = new Tea_b("灰斑病", R.drawable.b3_1);
            fruitList.add(orange);
            Tea_b watermelon = new Tea_b("白星病", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Tea_b pear = new Tea_b("藻斑病", R.drawable.pear_pic);
            fruitList.add(pear);
            Tea_b grape = new Tea_b("叶肿病", R.drawable.grape_pic);
            fruitList.add(grape);
            Tea_b pineapple = new Tea_b("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Tea_b strawberry = new Tea_b("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Tea_b cherry = new Tea_b("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Tea_b mango = new Tea_b("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }*/

