package com.braincorp.githandbook.adapter

import android.view.View
import android.widget.TextView
import com.braincorp.githandbook.R
import com.braincorp.githandbook.model.Command

class CommandViewHolder(itemView: View) : ViewHolder<Command>(itemView) {

    private val txtName by bindView<TextView>(R.id.txt_name)
    private val txtParams by bindView<TextView>(R.id.txt_params)

    override fun bindTo(item: Command) {
        txtName.text = item.name
        txtParams.text = context.resources.getQuantityString(
                R.plurals.params_plural,
                item.params.size,
                item.params.size
        )
    }

}