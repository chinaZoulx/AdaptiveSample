package org.example.chriszou.testapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.quick.component.QuickToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        QuickToast.showToastDefault("已经运行起来了")

    }
}
