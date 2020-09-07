package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.techcafe.wantum.wannado.databinding.FragmentWannadoBinding

class WannadoFragment : Fragment(R.layout.fragment_wannado) {

    private lateinit var binding: FragmentWannadoBinding

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

        binding = FragmentWannadoBinding.bind(view)

        val wishListDataBindingViewController = WannadoDataBindingViewController(object :
                WannadoDataBindingViewController.ClickListener {
                override fun onClicked(item: String) {
                    val action = WannadoFragmentDirections.actionWannadoToWannadoDetail(item)
                    findNavController().navigate(action)
                }
            })

        binding.recyclerViewWannado.apply {
            adapter = wishListDataBindingViewController.adapter
            layoutManager = LinearLayoutManager(context).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
        }

        wishListDataBindingViewController.setData(toDoList)
    }
}
