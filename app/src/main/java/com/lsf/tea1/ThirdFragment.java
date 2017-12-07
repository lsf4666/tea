package com.lsf.tea1;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dm on 16-3-29.
 * 第一个页面
 */
public class ThirdFragment extends Fragment {
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg3, container, false);

        //et_search = (ClearEditText) view.findViewById(R.id.et_search);
        // user_list = (ListView) view.findViewById(R.id.user_list);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initFruits() {
        fruitList.add(new Fruit(R.drawable.t1_1, "油茶白星病危害状"));
        fruitList.add(new Fruit(R.drawable.t1_5, "白星病子实体"));
        fruitList.add(new Fruit(R.drawable.t1_3, "白星病后期病斑融合或脱落呈孔状"));
        fruitList.add( new Fruit(R.drawable.t15_1, "黑斑病危害状"));
        fruitList.add( new Fruit(R.drawable.t15_2, "黑斑病新、老叶背面病斑"));
        fruitList.add( new Fruit(R.drawable.t16_1, "油茶灰斑病危害状"));
        fruitList.add( new Fruit(R.drawable.t16_2, "油茶灰斑病无限病斑"));
        fruitList.add( new Fruit(R.drawable.t16_5, "灰斑病有限病斑型后期症状"));
        fruitList.add( new Fruit(R.drawable.t29_5, "炭疽病病斑与子实体"));
        fruitList.add( new Fruit(R.drawable.t29_1, "炭疽病病苗嫩茎变黑褐色"));
        fruitList.add( new Fruit(R.drawable.t41_5, "藻斑病病斑"));
        fruitList.add( new Fruit(R.drawable.t41_1, "藻斑病病斑中,后期危害状"));
        fruitList.add( new Fruit(R.drawable.t32_1, "油茶叶肿病感病后呈中空的桃形茶泡"));
        fruitList.add( new Fruit(R.drawable.t32_5, "油茶叶肿病嫩叶受害后叶片呈肥耳状"));
        fruitList.add( new  Fruit(R.drawable.t2_5, "半带黄毒蛾成虫背面观"));
        fruitList.add( new  Fruit(R.drawable.t5_1, "茶用克尺蛾幼虫及危害状"));
        fruitList.add( new  Fruit(R.drawable.t5_5, "茶用克尺蛾幼虫侧面观"));
        fruitList.add( new  Fruit(R.drawable.t5_3, "茶用克尺蛾成虫仿石春华"));
        fruitList.add( new  Fruit(R.drawable.t6_1, "茶斑蛾危害状"));
        fruitList.add( new  Fruit(R.drawable.t6_5, "茶斑蛾成虫栖息在油茶树上"));
        fruitList.add( new  Fruit(R.drawable.t6_2, "茶斑蛾幼虫背面观,仿蒋芝云等"));
        fruitList.add( new  Fruit(R.drawable.t7_1, "茶大簑蛾危害状"));
        fruitList.add( new  Fruit(R.drawable.t7_5, "茶大簑蛾雄成虫"));
        fruitList.add( new  Fruit(R.drawable.t7_2, "茶大簑蛾蓑囊及幼虫"));
        fruitList.add( new  Fruit(R.drawable.t12_1, "茶堆沙蛀蛾危害状"));
        fruitList.add( new  Fruit(R.drawable.t12_5, "茶堆沙蛀蛾分叉处的蛀道口"));
        fruitList.add( new  Fruit(R.drawable.t12_2, "茶堆沙蛀蛾大龄幼虫背面观"));
        fruitList.add( new  Fruit(R.drawable.t12_3, "茶堆沙蛀蛾严重受害株频萎"));
         fruitList.add( new  Fruit(R.drawable.t17_5, "幻带黄毒蛾成虫背面观"));
        fruitList.add( new  Fruit(R.drawable.t18_5, "黄点带锦斑蛾展翅成虫"));
         fruitList.add( new  Fruit(R.drawable.t19_1, "褐簑蛾危害状"));
        fruitList.add( new  Fruit(R.drawable.t19_2, "褐簑蛾成虫"));
        fruitList.add( new  Fruit(R.drawable.t19_5, "褐簑蛾后期蓑囊"));
         fruitList.add( new  Fruit(R.drawable.t23_1, "蜡彩簑蛾危害状"));
        fruitList.add( new  Fruit(R.drawable.t23_2, "蜡彩簑蛾幼虫正在取食"));
        fruitList.add( new  Fruit(R.drawable.t23_3, "蜡彩簑蛾小龄幼虫危害状"));
          fruitList.add( new Fruit(R.drawable.t26_1, "南大簑蛾危害状"));
        fruitList.add( new Fruit(R.drawable.t26_2, "南大簑蛾幼虫"));
        fruitList.add( new Fruit(R.drawable.t26_5, "南大簑蛾展翅雄成虫"));
          fruitList.add( new  Fruit(R.drawable.t27_1, "丝脉簑蛾蓑囊戟危害状"));
        fruitList.add( new  Fruit(R.drawable.t27_5, "丝脉簑蛾幼虫背面观及蓑囊"));
        fruitList.add( new  Fruit(R.drawable.t27_2, "丝脉簑蛾雄成虫,仿赵仲苓"));
        fruitList.add( new  Fruit(R.drawable.t33_1, "油茶枯叶蛾灾害状"));
        fruitList.add( new  Fruit(R.drawable.t33_2, "油茶枯叶蛾组合图"));
           fruitList.add( new Fruit(R.drawable.t34_1, "油茶毒蛾危害状"));
        fruitList.add( new Fruit(R.drawable.t34_5, "油茶毒蛾老熟幼虫"));
        fruitList.add( new Fruit(R.drawable.t34_2, "油茶毒蛾雄成虫"));
            fruitList.add( new Fruit(R.drawable.t35_5, "油茶褐刺蛾绿紫型幼虫及危害状"));
        fruitList.add( new Fruit(R.drawable.t35_1, "油茶褐刺蛾橙红色幼虫及危害状"));
           fruitList.add( new Fruit(R.drawable.t36_5, "野茶带锦斑蛾危害状"));
        fruitList.add( new Fruit(R.drawable.t36_1, "野茶带锦斑蛾成虫自然态"));
            fruitList.add( new Fruit(R.drawable.t39_1, "油茶织蛾危害状"));
        fruitList.add( new Fruit(R.drawable.t39_5, "油茶织蛾幼虫及虫道"));
        fruitList.add( new Fruit(R.drawable.t39_2, "油茶织蛾成虫-仿张汉鹄等"));
           fruitList.add( new Fruit(R.drawable.t40_1, "油茶尺蛾危害状"));
        fruitList.add( new Fruit(R.drawable.t40_5, "油茶尺蛾大龄幼虫正在取食"));
        fruitList.add( new Fruit(R.drawable.t40_2, "油茶尺蛾雄成虫"));
        fruitList.add( new Fruit(R.drawable.t3_5, "白蛾蜡蝉青翅型与白翅型成虫为害枝条"));
       fruitList.add( new Fruit(R.drawable.t3_1, "白蛾蜡蝉低龄若虫"));
       fruitList.add( new Fruit(R.drawable.t4_1, "八点广翅蜡蝉成虫在油茶树上危害"));
        fruitList.add( new Fruit(R.drawable.t4_2, "八点广翅蜡蝉若虫侧面观"));
        fruitList.add( new Fruit(R.drawable.t4_5, "八点广翅蜡蝉成虫背面"));
       fruitList.add( new Fruit(R.drawable.t20_1, "褐缘蛾蜡蝉若虫前侧面观"));
        fruitList.add( new Fruit(R.drawable.t20_2, "褐缘蛾蜡蝉成虫"));
        fruitList.add( new Fruit(R.drawable.t20_5, "褐缘蛾蜡蝉大龄若虫侧面观"));
       fruitList.add(new Fruit(R.drawable.t37_2, "缘纹广翅蜡蝉若虫后面观"));
        fruitList.add(new Fruit(R.drawable.t37_1, "缘纹广翅蜡蝉成虫为害油茶"));
       fruitList.add( new Fruit(R.drawable.t8_1, "茶二叉蚜夏初的无翅若蚜"));
        fruitList.add( new Fruit(R.drawable.t8_2, "茶二叉蚜夏初的有翅成蚜与若蚜"));
        fruitList.add( new Fruit(R.drawable.t8_3, "茶二叉蚜秋末的无翅蚜"));
        fruitList.add( new Fruit(R.drawable.t8_4, "茶二叉蚜秋末的有翅蚜"));
       fruitList.add(new Fruit(R.drawable.t9_1, "长白蚧雌蚧群集危害"));
        fruitList.add(new Fruit(R.drawable.t9_5, "长白蚧雄蚧与雌蚧"));
       fruitList.add( new Fruit(R.drawable.t10_1, "吹绵蚧在油茶上危害状"));
        fruitList.add( new Fruit(R.drawable.t10_2, "吹绵蚧雌成虫及卵囊"));
       fruitList.add(new Fruit(R.drawable.t11_1, "茶天牛危害状"));
        fruitList.add(new Fruit(R.drawable.t11_2, "茶天牛幼虫及蛀道"));
        fruitList.add(new Fruit(R.drawable.t11_5, "茶天牛成虫"));
        fruitList.add( new Fruit(R.drawable.t13_1, "短角外斑腿蝗成虫背面观"));
       fruitList.add( new Fruit(R.drawable.t13_5, "短角外斑腿蝗成虫交尾"));
       fruitList.add( new Fruit(R.drawable.t14_5, "广西灰象成虫背面观"));
       fruitList.add(new Fruit(R.drawable.t21_5, "黄带楔天牛成虫"));
       fruitList.add( new Fruit(R.drawable.t22_5, "阔边梳龟甲成虫前面观"));
        fruitList.add(new Fruit(R.drawable.t24_1, "龙眼鸡成虫正在树干上为害"));
       fruitList.add(new Fruit(R.drawable.t24_5, "龙眼鸡成虫背侧面观"));
       fruitList.add( new Fruit(R.drawable.t25_1, "麻皮蝽初孵幼虫及卵壳"));
        fruitList.add( new Fruit(R.drawable.t25_5, "麻皮蝽成虫背面观"));
       fruitList.add( new Fruit(R.drawable.t28_5, "山茶片盾蚧危害状"));
        fruitList.add( new Fruit(R.drawable.t28_1, "山茶片盾蚧雌蚧与雄蚧"));
       fruitList.add( new Fruit(R.drawable.t30_1, "同型巴蜗牛危害状"));
        fruitList.add( new Fruit(R.drawable.t30_5, "同型巴蜗牛成贝"));
       fruitList.add( new Fruit(R.drawable.t31_1, "星天牛危害状及虫粪"));
        fruitList.add( new Fruit(R.drawable.t31_5, "星天牛成虫交尾"));
        fruitList.add( new Fruit(R.drawable.t31_2, "星天牛幼虫及蛀道"));
       fruitList.add( new Fruit(R.drawable.t38_5, "油茶宽盾蝽成虫与若虫"));
       fruitList.add( new Fruit(R.drawable.t42_5, "中华皮蓟马成虫群集危害"));
        fruitList.add( new Fruit(R.drawable.t42_1, "中华皮蓟马成虫背面观"));
    }

}