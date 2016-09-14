package com.example.dayuan.intenaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);
        Button buttonOne = (Button) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.tttttt);
        Button buttonTwo = (Button) findViewById(R.id.buttons);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                * 1.无返回的跳转
                * 2.参数1上下文的this 参数2目标文件2的类
                * */
                Intent integer = new Intent(FActivity.this,SActivity.class);
                startActivity(integer);
            }
        });


        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,SActivity.class);
                /*
                * 第一个参数传intent , 第二个参数传表示
                * */
                startActivityForResult(intent,1);
            }
        });

    }
    /*通过startActivityForResult跳转,接收返回的方法
    *第一个参数:requestCode:请求的标识
    *第二个参数: resultCode返回的表示
    * 第三个参数:Intent返回的数据
    * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 2){
           String constss =  data.getStringExtra("data");
            tv.setText(constss);
        }
    }
}
