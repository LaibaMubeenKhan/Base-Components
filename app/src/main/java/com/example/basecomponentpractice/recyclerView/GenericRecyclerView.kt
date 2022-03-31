package com.example.basecomponentpractice.recyclerView
import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.basecomponentpractice.databinding.ActivityBottomBinding.inflate
import com.example.basecomponentpractice.helper.OnClick
import com.example.basecomponentpractice.helper.Recycler
import java.util.*
import java.util.Collections.emptyList

open class GenericRecyclerView<T>(
    private val inflate: (layoutInflater: LayoutInflater, parent: ViewGroup?, attachToParent: Boolean) -> ViewBinding,
    private val bind: (item: T, binding: ViewBinding, position: Int) -> Unit,
//    private val onClick: (item: T, binding: ViewBinding, position: Int) -> Unit
) : RecyclerView.Adapter<GenericRecyclerView<T>.ItemViewHolder>() {

            var items = Collections.emptyList<T>()
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ItemViewHolder(inflate(LayoutInflater.from(parent.context), parent, false))


            @SuppressLint("NotifyDataSetChanged")
            fun setItem(items: List<T>?) {
                if (items != null) {
                    this.items = items
                    notifyDataSetChanged()
                }
            }

            fun setItemHome(items: List<T>) {
                items.let {
                    this.items = items
                }
            }
            override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
                    bind(
                    this.items.get(position),
                    holder.binding,
                    position
                )

            }


    override fun getItemCount(): Int {
                Log.e("Generic",items.size.toString())
                return this.items.size

            }
            inner class ItemViewHolder(val binding: ViewBinding) : RecyclerView.ViewHolder((binding).root)
        }