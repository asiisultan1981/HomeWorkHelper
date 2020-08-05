package recyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homework_helper.R;
import model.TeacherCollection;

public class MyRecyclerView extends AppCompatActivity {
    public static final String TAG = "MyRecyclerView";
    private RecyclerView recyclerView;
    private TeacherRecyclerAdapter teacherRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        teacherRecyclerAdapter = new TeacherRecyclerAdapter(this, TeacherCollection.getTeachers());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(teacherRecyclerAdapter);


    }
}