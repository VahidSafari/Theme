package ir.part.theme.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import ir.part.theme.R
import ir.part.theme.utils.GlideApp

class StudentAdapter(private val data: List<StudentEntity>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image: CircleImageView = itemView.findViewById(R.id.image)
        private val name: AppCompatTextView = itemView.findViewById(R.id.name)
        private val description: AppCompatTextView = itemView.findViewById(R.id.description)

        fun onBind(student: StudentEntity) {
            GlideApp.with(itemView.context).load(student.image).into(image)
            name.text = student.name
            description.text = student.description
        }
    }
}