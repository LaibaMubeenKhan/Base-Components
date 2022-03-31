package com.example.basecomponentpractice.fragment

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.example.basecomponentpractice.Model.MainRecDataClass
import com.example.basecomponentpractice.Model.MainRecInnerClass
import com.example.basecomponentpractice.R
import com.example.basecomponentpractice.base.BaseFragment
import com.example.basecomponentpractice.databinding.*
import com.example.basecomponentpractice.recyclerView.GenericRecyclerView
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class ShowsFragment : BaseFragment<FragmentShowsBinding, BottomBaseViewModel>() {
    var listI = mutableListOf<MainRecInnerClass>()
    var listO = mutableListOf<MainRecDataClass>()
    lateinit var innerAdapter: GenericRecyclerView<MainRecInnerClass>
    override fun inflateLayout(layoutInflater: LayoutInflater) =
        FragmentShowsBinding.inflate(layoutInflater)

    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun initViews() {
        addItemsInLIst()
        outerAdapter.setItem(listO)
        _binding.recyclerView4.adapter = outerAdapter
    }

    fun addInner(position: Int) {
        when (position) {

            0, 4 -> {
                innerAdapter = GenericRecyclerView<MainRecInnerClass>(
                    { li, parent, attach ->
                        ItemInnerRecyc3Binding.inflate(li, parent, attach)
                    },
                    { item, vb, _ -> setMainInner(item, vb as ItemInnerRecyc3Binding) },
                )
            }
            1 -> {
                innerAdapter = GenericRecyclerView(
                    { li, parent, attach ->
                        ItemInnerRecyc2Binding.inflate(
                            li,
                            parent,
                            attach
                        )
                    },
                    { item, vb, _ -> setMainInner(item, vb as ItemInnerRecyc2Binding) },
                )
            }
            else -> {
                innerAdapter = GenericRecyclerView<MainRecInnerClass>(
                    { li, parent, attach ->
                        ItemInnerRecyclerBinding.inflate(
                            li,
                            parent,
                            attach
                        )
                    },
                    { item, vb, _ -> setMainInner(item, vb as ItemInnerRecyclerBinding) },
                )
            }
        }

        innerAdapter.setItem(listI)


    }
    fun setMainOuter(item: MainRecDataClass, vb: ItemMainRecyclerBinding, position: Int) {
        addInner(position)
        vb.textView2.text = item.title
        vb.recyclerView2.adapter = innerAdapter
    }
    fun addItemsInLIst() {
        //outer List
        listO.add(MainRecDataClass("One"))
        listO.add(MainRecDataClass("Two"))
        listO.add(MainRecDataClass("Three"))
        listO.add(MainRecDataClass("Four"))
        listO.add(MainRecDataClass("Five"))
        listO.add(MainRecDataClass("Six"))
        listO.add(MainRecDataClass("Seven"))
        listO.add(MainRecDataClass("Eight"))
        listO.add(MainRecDataClass("Nine"))
        listO.add(MainRecDataClass("Ten"))

        //innerlist
        listI.add(MainRecInnerClass(R.drawable.one))
        listI.add(MainRecInnerClass(R.drawable.two))
        listI.add(MainRecInnerClass(R.drawable.three))
        listI.add(MainRecInnerClass(R.drawable.four))
        listI.add(MainRecInnerClass(R.drawable.five))
        listI.add(MainRecInnerClass(R.drawable.six))
        listI.add(MainRecInnerClass(R.drawable.seven))
        listI.add(MainRecInnerClass(R.drawable.eight))
        listI.add(MainRecInnerClass(R.drawable.nine))
        listI.add(MainRecInnerClass(R.drawable.ten))
    }
    fun setMainInner(item: MainRecInnerClass, vb: ViewBinding) {
        Glide.with(this).load(item.innerImage)
            .into(vb.root.findViewById(R.id.imageView))

    }





        var outerAdapter = GenericRecyclerView<MainRecDataClass>(
            { li, parent, attach -> ItemMainRecyclerBinding.inflate(li, parent, attach) },
            { item, vb, position ->
                setMainOuter(item, vb as ItemMainRecyclerBinding, position)
            },
        )

    }




