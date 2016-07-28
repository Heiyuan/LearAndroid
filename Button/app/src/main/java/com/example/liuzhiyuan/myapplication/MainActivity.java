package com.example.liuzhiyuan.myapplication;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.*;
import android.widget.Toast;

import static android.graphics.drawable.Drawable.createFromPath;
import static com.example.liuzhiyuan.myapplication.R.color.colorAccent;

public class MainActivity extends AppCompatActivity implements  OnClickListener {
    private ImageButton LoginButton;
    private Button buttonOne;
    private Button buttonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * 1.初始化当前所需要的控件
         * findViewById--返回的是一个View对象
         *
         * 2.设置button的监听器,通过监听器实现我们点击button要操作的事情
         */
        LoginButton = (ImageButton)findViewById(R.id.imageButton);
        /*
         * 1.监听事件通过第一种方式实现(匿名内部类)
         */

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //在当前OnClick方法中监听点击Button的动作
                System.out.println("ImageButton被点击了");
            }
        });

        buttonOne = (Button) findViewById(R.id.button);

        /*
        点击事件外部类的写法和实现
         */

        buttonOne.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View view) {
                //调用父类的onClick
                super.onClick(view);
                Toast.makeText(MainActivity.this,"bt1要执行的逻辑",1).show();
            }
        });

        buttonThree = (Button) findViewById(R.id.buttonTWO);
        /*
        通过实现一个接口的方式实现监听事件
         */
        buttonThree.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.i("tag","第三种方式实现");
    }
}

class  MyOnClickListener implements OnClickListener {

    @Override
    public void onClick(View view) {

    }
}