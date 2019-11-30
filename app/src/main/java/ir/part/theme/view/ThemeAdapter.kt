package ir.part.theme.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import ir.part.theme.R
import ir.part.theme.utils.ThemeModel

class ThemeAdapter(
    private val theme: Int,
    private val data: List<ThemeModel>,
    private val helper: ThemeHelper
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_theme_selected, parent, false)
            ThemeSelectedViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_theme, parent, false)
            ThemeViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ThemeSelectedViewHolder)
            holder.onBind(data[position])
        else if (holder is ThemeViewHolder)
            holder.onBind(data[position], helper)
    }

    override fun getItemViewType(position: Int): Int {
        return if (theme == data[position].theme) 1 else 0
    }

    class ThemeSelectedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val cardView: MaterialCardView = itemView.findViewById(R.id.cardView)
        private val name: AppCompatTextView = itemView.findViewById(R.id.name)

        fun onBind(theme: ThemeModel) {
            cardView.setCardBackgroundColor(
                ContextCompat.getColor(
                    itemView.context,
                    theme.colorPrimary
                )
            )
            name.setTextColor(ContextCompat.getColor(itemView.context, theme.textColor))
            name.text = theme.name
        }
    }

    class ThemeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val cardView: MaterialCardView = itemView.findViewById(R.id.cardView)
        private val name: AppCompatTextView = itemView.findViewById(R.id.name)

        fun onBind(theme: ThemeModel, helper: ThemeHelper) {
            cardView.setCardBackgroundColor(
                ContextCompat.getColor(
                    itemView.context,
                    theme.colorPrimary
                )
            )
            name.setTextColor(ContextCompat.getColor(itemView.context, theme.textColor))
            name.text = theme.name
            itemView.setOnClickListener {
                helper.onSelectTheme(theme.theme)
            }
        }
    }
}