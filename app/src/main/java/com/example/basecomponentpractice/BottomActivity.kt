package com.example.basecomponentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.basecomponentpractice.base.BaseActivity
import com.example.basecomponentpractice.databinding.ActivityBottomBinding
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class BottomActivity : BaseActivity<ActivityBottomBinding,BottomBaseViewModel>() {
    lateinit var navController: NavController
    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun inflateLayout(layoutInflater: LayoutInflater) = ActivityBottomBinding.inflate(layoutInflater)

    override fun initViews() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}