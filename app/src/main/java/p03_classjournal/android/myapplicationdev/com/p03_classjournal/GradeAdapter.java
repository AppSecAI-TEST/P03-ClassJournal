package p03_classjournal.android.myapplicationdev.com.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017096 on 4/5/2017.
 */

public class GradeAdapter extends ArrayAdapter<ArrayList<String>> {

    private ArrayList<ArrayList<String>> grade;
    private Context context;
    private TextView tvGrade, tvTitle;
    private ImageView ivImage;

    public GradeAdapter(Context context, int resource, ArrayList<ArrayList<String>> objects, ArrayList<ArrayList<String>> grade){
        super(context, resource, objects);
        this.grade = grade;
        // Store the food that is passed to this adapter
        grade = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        // Get the ImageView object
        ivImage = (ImageView) rowView.findViewById(R.id.ivImage);
        tvGrade = (TextView)rowView.findViewById(R.id.tvGrade);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        ArrayList<String> currentGrade = grade.get(position);
        // Set the TextView to show the food

        tvTitle.setText(currentGrade.get(0));
        tvGrade.setText(currentGrade.get(1));


        // Return the nicely done up View to the ListView
        return rowView;
    }

}
