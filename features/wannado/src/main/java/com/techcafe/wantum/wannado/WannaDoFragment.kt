package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.techcafe.wantum.wannado.databinding.FragmentWannaDoBinding
import kotlinx.android.synthetic.main.fragment_wanna_do.*

class WannaDoFragment : Fragment() {

    private lateinit var binding: FragmentWannaDoBinding

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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannaDoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wishListDataBindingViewController = WannaDoDataBindingViewController(object :
            WannaDoDataBindingViewController.ClickListener {
            override fun onClicked(item: String) {
                findNavController().navigate(R.id.action_wannado_to_wannado_detail)
                Toast.makeText(context, "$item is Clicked", Toast.LENGTH_SHORT).show()
            }
        })

        binding.recyclerViewWannaDo.apply {
            adapter = wishListDataBindingViewController.adapter
            layoutManager = LinearLayoutManager(context).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
        }

        wishListDataBindingViewController.setData(toDoList)
    }
}
