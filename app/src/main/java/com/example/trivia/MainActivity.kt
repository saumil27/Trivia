package com.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding  = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

       // back button support
        val navController = this.findNavController(R.id.myNavHost_fragment)
        NavigationUI.setupActionBarWithNavController(this,navController)



    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHost_fragment)
        return  navController.navigateUp()
    }

}
