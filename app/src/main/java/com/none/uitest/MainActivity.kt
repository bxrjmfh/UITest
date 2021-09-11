package com.none.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.none.uitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding_1=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding_1.root)
        /*binding_1.button1.setOnClickListener(){
           //一种按钮方法的写法
        }*/
    }

    override fun onClick(p0: View?)
    {
        when(p0?.id){
            R.id.button_1->{
                //添加逻辑的第二种方法
            }
        }
    }
}