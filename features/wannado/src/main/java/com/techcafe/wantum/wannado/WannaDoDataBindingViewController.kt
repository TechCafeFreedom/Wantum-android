package com.techcafe.wantum.wannado

import com.airbnb.epoxy.Typed2EpoxyController

class WannaDoDataBindingViewController(
    private val clickListener: ClickListener
) : Typed2EpoxyController<List<String>, Boolean>() {

    override fun buildModels(titles: List<String>, loadingMore: Boolean) {
        titles.forEach { title ->

/*
                id("content")
                titleXml(title)
                onClickListener(View.OnClickListener { clickListener.onClicked(title) })
*/
        }
    }

    interface ClickListener{
        fun onClicked(item: String)
    }
}
