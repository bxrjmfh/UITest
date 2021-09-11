package com.none.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.none.uitest.databinding.ActivityMainBinding
var is_set:Boolean=false

class MainActivity : AppCompatActivity()//, View.OnClickListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding_1=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding_1.root)
        binding_1.button1.setOnClickListener(){
           //一种按钮方法的写法
            Toast.makeText(this,binding_1.edittext1.text.toString()+"再看看图片吧",Toast.LENGTH_SHORT).show()
            if(!is_set){
                binding_1.image1.setImageResource(R.drawable.img_2)
                is_set=true
            }
            else
            {
                binding_1.image1.setImageResource(R.drawable.img_1)
                is_set=false
            }


        }
    }

    /*override fun onClick(p0: View?)
    {
        when(p0?.id){
            R.id.button_1->{
                //添加逻辑的第二种方法

                Toast.makeText(this,input_text,Toast.LENGTH_SHORT).show()
            }
        }
    }*/
}