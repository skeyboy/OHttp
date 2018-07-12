package com.xsk.filter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xsk.filter.filter.OHttpRequestFilter;
import com.xsk.filter.http.OHttpManager;
import com.xsk.filter.http.OHttpMethod;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建一个氢气管理器
        OHttpManager oHttpManager = OHttpManager.manager;


        //网络请求管理器中添加过滤器
        oHttpManager.addRequestFilter(new OHttpRequestFilter() {
            @Override
            public boolean filter(Object object) {
                //TODO

                return false;
            }
        }).addRequestFilter(new OHttpRequestFilter() {
            @Override
            public boolean filter(Object object) {
                //TODO 对数据进行检查

                 return false;
            }
        });

        Map<String, Object> params = new HashMap<>();

        oHttpManager.POST("https",OHttpMethod.GET, params);


    }
}
