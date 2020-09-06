package com.techcafe.wantum.wannado

import com.airbnb.epoxy.TypedEpoxyController

class WannaDoDataBindingViewController(
    private val clickListener: ClickListener
) : TypedEpoxyController<List<String>>() {

    override fun buildModels(titles: List<String>) {
        titles.forEachIndexed { index, title ->
            wannaDo{
                id("$index")
                title(title)
                onClickListener { _ -> clickListener.onClicked(title) }
            }
        }
    }

    interface ClickListener {
        fun onClicked(item: String)
    }
}
