package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_wanna_do.*

class WannaDoFragment : Fragment(R.layout.fragment_wanna_do) {
    private val toDoList = listOf<String>(
        "オンラインデート",
        "オフライン飲み会",
        "ディズニーランド",
        "富士山",
        "アメリカに行く",
        "オンラインデート",
        "オフライン飲み会",
        "ディズニーランド",
        "富士山",
        "アメリカに行く",
        "社長になる"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wishListDataBindingViewController = WannaDoDataBindingViewController(object :
            WannaDoDataBindingViewController.ClickListener {
            override fun onClicked(item: String) {
                Toast.makeText(context, "FuckYouNiwatori", Toast.LENGTH_SHORT).show()
            }
        })

        wanna_do_recycler_view.apply {
            adapter = wishListDataBindingViewController.adapter
            layoutManager = LinearLayoutManager(context).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
        }

        wishListDataBindingViewController.setData(toDoList, false)
    }
}
