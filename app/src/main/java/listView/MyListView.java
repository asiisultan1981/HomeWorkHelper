package listView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.RatingBar;

import com.example.homework_helper.R;
import model.TeacherCollection;

public class MyListView extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private RatingBar ratingBar;
    private ListView listView;
    TeacherListAdapter teacherListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view);

        listView = findViewById(R.id.lv);
        ratingBar = findViewById(R.id.ratingbar);

        teacherListAdapter = new TeacherListAdapter(MyListView.this, R.layout.single_row, TeacherCollection.getTeachers());
        listView.setAdapter(teacherListAdapter);
    }
}