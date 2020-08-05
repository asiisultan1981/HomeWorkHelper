package recyclerView;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework_helper.R;
import com.example.homework_helper.TeacherDetails;

import model.Teacher;

import java.util.List;

public class TeacherRecyclerAdapter extends RecyclerView.Adapter<TeacherRecyclerAdapter.MyRecViewHolder> {
    public static final String TAG = "RecAdapter";

    private Context context;
    List<Teacher> teacherList;
    public TeacherRecyclerAdapter(Context context, List<Teacher> teacherList) {
        this.context = context;
        this.teacherList = teacherList;
    }


    @Override
    public MyRecViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row, parent,false);

        return new MyRecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecViewHolder holder, int position) {
        Teacher teacher = teacherList.get(position);

        holder.iv.setImageResource(teacher.getImage());
        holder.ratingBar.setRating(teacher.getRating());
        holder.tvName.setText(teacher.getName());
        holder.tvDetails.setText(teacher.getDetails());
        holder.skill1.setText(teacher.getSkill1());
        holder.skill2.setText(teacher.getSkill2());
        holder.skill3.setText(teacher.getSkill3());
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TeacherDetails.class);
//                intent.putExtra()
            }
        });


    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "RecyclerView CountItem: "+teacherList.size());
        return teacherList.size();
    }

    public class MyRecViewHolder extends RecyclerView.ViewHolder  {

        ImageView iv;
        RatingBar ratingBar;
        TextView tvName;
        TextView tvDetails;
        TextView skill1;
        TextView skill2;
        TextView skill3;
        LinearLayout parent_layout;


        public MyRecViewHolder(@NonNull View itemView) {
            super(itemView);



            iv = itemView.findViewById(R.id.iv);
            ratingBar = itemView.findViewById(R.id.ratingbar);
            tvName = itemView.findViewById(R.id.tvName);
            tvDetails = itemView.findViewById(R.id.tvDetails);
            skill1 = itemView.findViewById(R.id.tvSkill1);
            skill2 = itemView.findViewById(R.id.tvSkill2);
            skill3 = itemView.findViewById(R.id.tvSkill3);
            parent_layout = itemView.findViewById(R.id.parent_layout);


        }


    }

}
