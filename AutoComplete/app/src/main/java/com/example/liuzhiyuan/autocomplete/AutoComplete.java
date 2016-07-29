package com.example.liuzhiyuan.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import java.util.Objects;

public class AutoComplete extends AppCompatActivity {
     private AutoCompleteTextView acTextView;
     private MultiAutoCompleteTextView macTextView;
     private String[] res = {"beijing1","beijing2","beijing3","shanghai1","shanghai2","yubo嫖娼","yubo傻逼","yubo大傻逼"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        /*
        初始化控件
        第二部:需要一个适配器
        第三部:初始化数据源---这数据源去匹配文本框输入的内容
        第四步:jiangadptr和当前控件绑定
         */
        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCOmpleteTextView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);
            /*
        初始化控件
        第二部:需要一个适配器
        第三部:初始化数据源---这数据源去匹配文本框输入的内容
        第四步:jiangadptr和当前控件绑定
        第五步:设置分隔符
         */

        macTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        macTextView.setAdapter(adapter);
        //设置已都好为分隔符
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());



    }
}
