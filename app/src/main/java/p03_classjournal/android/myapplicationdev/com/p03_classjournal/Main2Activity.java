package p03_classjournal.android.myapplicationdev.com.p03_classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    Button btnAdd;
    ListView lvGrade;
    ArrayAdapter aa;
    ArrayList<String> module_grade;
    ArrayList<ArrayList<String>> grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        lvGrade = (ListView)findViewById(R.id.lvGrade);
        grade = new ArrayList<ArrayList<String>>();
        module_grade = new ArrayList<String>();
        module_grade.add("DG");
        module_grade.add("C");
        module_grade.add("asd");
        grade.add(module_grade);

        aa = new GradeAdapter(Main2Activity.this, R.layout.row, grade);
        lvGrade.setAdapter(aa);





        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



}
