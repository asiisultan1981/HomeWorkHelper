package listView;



import android.content.Context;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.collection.ArraySet;

import com.example.homework_helper.R;
import model.Teacher;

import java.util.List;
import java.util.Set;


//public class TeacherAdapter extends ArrayAdapter<Teacher> {
//
//    public static final String TAG = "asii";
//    Context context;
//    List<Teacher> teacherList = new ArrayList<>();
//
//    public TeacherAdapter(Context context, int resourceId,
//                          List<Teacher> teacherList) {
//        super(context, resourceId);
//        this.context = context;
//        this.teacherList = teacherList;
//
//    }
//
//    private class ViewHolder {
//        ImageView iv;
//        RatingBar ratingBar;
//        TextView tvName;
//        TextView tvDetails;
//        TextView skill1;
//        TextView skill2;
//        TextView skill3;
//    }
//
//    @Override
//    public int getCount() {
//        Log.d(TAG, "getCount: " + teacherList.size());
//        return teacherList.size();
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder = null;
//        Teacher teacher = teacherList.get(position);
//
//        LayoutInflater mInflater = (LayoutInflater) context
//                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//        Log.d(TAG, "getView: Layoutinflater is set");
//        if (convertView == null) {
//            convertView = mInflater.inflate(R.layout.single_row, null);
//            holder = new ViewHolder();
//            holder.tvName = (TextView) convertView.findViewById(R.id.tvName);
//            holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingbar);
//            holder.iv = (ImageView) convertView.findViewById(R.id.iv);
//            holder.tvDetails = (TextView) convertView.findViewById(R.id.tvDetails);
//            holder.skill1 = (TextView) convertView.findViewById(R.id.tvSkill1);
//            holder.skill2 = (TextView) convertView.findViewById(R.id.tvSkill2);
//            holder.skill3 = (TextView) convertView.findViewById(R.id.tvSkill3);
//            convertView.setTag(holder);
//        } else
//            holder = (ViewHolder) convertView.getTag();
//
//        holder.tvName.setText(teacher.getName());
//        holder.tvDetails.setText(teacher.getDetails());
//        holder.iv.setImageResource(teacher.getImage());
//        holder.ratingBar.setRating(teacher.getRating());
//        holder.skill1.setText(teacher.getSkill1());
//        holder.skill2.setText(teacher.getSkill2());
//        holder.skill3.setText(teacher.getSkill3());
//
//        Log.d(TAG, "getView: View is set");
//
//        return convertView;
//
//
//    }
//}


//  ************* BASE ADAPTER **********************


//public class TeacherAdapter extends BaseAdapter {
//    private static final String TAG = "asii";
//    private Context context;
//    private List<Teacher> teacherList;
//    Set<View> viewSet;
//
//    public TeacherAdapter(Context context, int single_row, List<Teacher> teacherList) {
//        this.context = context;
//        this.teacherList = teacherList;
//        this.viewSet = new ArraySet<>();
//    }
//
//    @Override
//    public int getCount() {
////        Log.d(TAG, "getCount: "+teacherList.size());
//        return teacherList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return teacherList.indexOf(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//
//
//        if (convertView == null){
//            LayoutInflater layoutInflater = LayoutInflater.from(context);
//
//            convertView = layoutInflater.inflate(R.layout.single_row, null);
//
//        }
//            ImageView iv = convertView.findViewById(R.id.iv);
//            RatingBar ratingBar = convertView.findViewById(R.id.ratingbar);
//            TextView tvName = convertView.findViewById(R.id.tvName);
//            TextView tvDetails = convertView.findViewById(R.id.tvDetails);
//            TextView skill1 = convertView.findViewById(R.id.tvSkill1);
//            TextView skill2 = convertView.findViewById(R.id.tvSkill2);
//            TextView skill3 = convertView.findViewById(R.id.tvSkill3);
//
//
//            Teacher teacher = teacherList.get(position);
//            iv.setImageResource(teacher.getImage());
//            ratingBar.setRating(teacher.getRating());
//            tvName.setText(teacher.getName());
//            tvDetails.setText(teacher.getDetails());
//            skill1.setText(teacher.getSkill1());
//            skill2.setText(teacher.getSkill2());
//            skill3.setText(teacher.getSkill3());
//
//         viewSet.add(convertView);
//        Log.d(TAG, "Index: "+position + ", Size: " + viewSet.size() );
//        return convertView;
//    }
//
//}

// ******************************* BASE ADAPTER USING VIEW HOLDER CLASS ************************************
public class TeacherListAdapter extends BaseAdapter {
    private static final String TAG = "asii";
    private Context context;
    private List<Teacher> teacherList;
    Set<View> viewSet;


    public TeacherListAdapter(Context context, int single_row, List<Teacher> teacherList) {
        this.context = context;
        this.teacherList = teacherList;
        viewSet = new ArraySet<>();
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount: "+teacherList.size());
        return teacherList.size();
    }

    @Override
    public Object getItem(int position) {

        return teacherList.indexOf(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {
            LayoutInflater mInflater = LayoutInflater.from(context.getApplicationContext());
            Log.d(TAG, "getView: Layoutinflater is set");
            convertView = mInflater.inflate(R.layout.single_row, null);

            holder = new ViewHolder();

            holder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingbar);
            holder.iv = (ImageView) convertView.findViewById(R.id.iv);
            holder.tvDetails = (TextView) convertView.findViewById(R.id.tvDetails);
            holder.skill1 = (TextView) convertView.findViewById(R.id.tvSkill1);
            holder.skill2 = (TextView) convertView.findViewById(R.id.tvSkill2);
            holder.skill3 = (TextView) convertView.findViewById(R.id.tvSkill3);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

            Teacher teacher = teacherList.get(position);

            holder.tvName.setText(teacher.getName());
            holder.tvDetails.setText(teacher.getDetails());
            holder.iv.setImageResource(teacher.getImage());
            holder.ratingBar.setRating(teacher.getRating());
            holder.skill1.setText(teacher.getSkill1());
            holder.skill2.setText(teacher.getSkill2());
            holder.skill3.setText(teacher.getSkill3());

            viewSet.add(convertView);

            Log.d(TAG, "Index: "+": "+ convertView+ "Size "+viewSet.size());

        return convertView;
    }

    private static class ViewHolder{
        ImageView iv;
        RatingBar ratingBar;
        TextView tvName;
        TextView tvDetails;
        TextView skill1;
        TextView skill2;
        TextView skill3;
    }
}