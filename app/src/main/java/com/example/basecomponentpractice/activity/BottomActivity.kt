package com.example.basecomponentpractice.activity

import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.basecomponentpractice.Model.MainRecInnerClass
import com.example.basecomponentpractice.Model.TopRecylerDataClass
import com.example.basecomponentpractice.R
import com.example.basecomponentpractice.base.BaseActivity
import com.example.basecomponentpractice.databinding.ActivityBottomBinding
import com.example.basecomponentpractice.databinding.ItemTopRecyclerBinding
import com.example.basecomponentpractice.fragment.BlankFragment
import com.example.basecomponentpractice.fragment.CatchUpFragment
import com.example.basecomponentpractice.fragment.ShowsFragment
import com.example.basecomponentpractice.helper.OnClick
import com.example.basecomponentpractice.recyclerView.GenericRecyclerView
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel


class BottomActivity : BaseActivity<ActivityBottomBinding, BottomBaseViewModel>(),
    View.OnClickListener, OnClick {
    public var topList = mutableListOf<TopRecylerDataClass>()
    public var sliderList = mutableListOf<SlideModel>()
//    lateinit var navController: NavController

    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun inflateLayout(layoutInflater: LayoutInflater) =
        ActivityBottomBinding.inflate(layoutInflater)

    override fun initViews() {

//        progress(Status.Loading,binding.progressBar)
        binding.home.setOnClickListener(this)
        binding.live.setOnClickListener(this)
        binding.entertainment.setOnClickListener(this)
        binding.tapshop.setOnClickListener(this)
        binding.catchup.setOnClickListener(this)

//        setBottomNav()
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainerView2.id, ShowsFragment()).commit()

        addItemsInTopRecycler()
        setSLider()

    }

    private fun addItemsInTopRecycler() {
        topList.add(TopRecylerDataClass("Movies"))
        topList.add(TopRecylerDataClass("Shows"))
        topList.add(TopRecylerDataClass("Category"))
        topList.add(TopRecylerDataClass("Catchup"))
        topList.add(TopRecylerDataClass("UpComing"))
        topList.add(TopRecylerDataClass("Tapmad Exclusive"))
        topList.add(TopRecylerDataClass("Kids"))
        topList.add(TopRecylerDataClass("Comedy"))
        topList.add(TopRecylerDataClass("Horror"))

        val horizontalLayoutManagaer =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        var adapter2 = GenericRecyclerView<TopRecylerDataClass>(
            { li, parent, attach -> ItemTopRecyclerBinding.inflate(li, parent, attach) },
            { item, vb, _ -> setTopCategory(item, vb as ItemTopRecyclerBinding) },
        )
        binding.recyclerView.layoutManager = horizontalLayoutManagaer
        adapter2.setItem(topList)
        binding.recyclerView.adapter = adapter2


    }

    private fun setTopCategory(item: TopRecylerDataClass, Vb: ItemTopRecyclerBinding) {
        Vb.textView.text = item.category
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.live -> {
                Toast.makeText(this, "Live Clicked", Toast.LENGTH_LONG).show()
            }
            binding.entertainment -> {
                changeFragment(BlankFragment())
            }
            binding.home -> {
                changeFragment(ShowsFragment())
            }
            binding.tapshop -> {
                Toast.makeText(this, "Tapshop Clicked", Toast.LENGTH_LONG).show()
            }
            binding.catchup -> {
                changeFragment(CatchUpFragment())
            }
        }
    }

    private fun changeFragment(frag: Fragment) {
        val fragment = supportFragmentManager.beginTransaction()
        fragment.replace(binding.fragmentContainerView2.id, frag).commit()
    }

    override fun showToast(name: String) {
        Toast.makeText(this, "Clicked $name", Toast.LENGTH_LONG).show()
    }




    fun setSLider(){
        sliderList.add(SlideModel(R.drawable.one))
        sliderList.add(SlideModel(R.drawable.two))
        sliderList.add(SlideModel(R.drawable.three))
        sliderList.add(SlideModel(R.drawable.four))
        sliderList.add(SlideModel(R.drawable.five))
        sliderList.add(SlideModel(R.drawable.six))
        sliderList.add(SlideModel(R.drawable.seven))
        sliderList.add(SlideModel(R.drawable.eight))
        sliderList.add(SlideModel(R.drawable.nine))
        sliderList.add(SlideModel(R.drawable.ten))

        binding.imageSlider.setImageList(sliderList, ScaleTypes.FIT)
    }


}
