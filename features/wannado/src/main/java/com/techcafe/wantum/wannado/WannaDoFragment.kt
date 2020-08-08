package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_wanna_do.*

class WannaDoFragment : Fragment(R.layout.fragment_wanna_do) {
    private val toDoList = listOf<String>(
        "1オンラインデート",
        "2オフライン飲み会",
        "3ディズニーランド",
        "4富士山",
        "5アメリカに行く",
        "6オンラインデート",
        "7オフライン飲み会",
        "8ディズニーランド",
        "9富士山",
        "10アメリカに行く",
        "11社長になる"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wishListDataBindingViewController = WannaDoDataBindingViewController(object :
            WannaDoDataBindingViewController.ClickListener {
            override fun onClicked(item: String) {
                Toast.makeText(context, "$item is Clicked", Toast.LENGTH_SHORT).show()
            }
        })

        wanna_do_recycler_view.apply {
            adapter = wishListDataBindingViewController.adapter
            layoutManager = LinearLayoutManager(context).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
        }

        wishListDataBindingViewController.setData(toDoList)
    }
}
