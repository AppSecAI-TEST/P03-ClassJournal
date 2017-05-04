package p03_classjournal.android.myapplicationdev.com.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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


    Button btnInfo;
    Button btnEmail;

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


        btnInfo = (Button)findViewById(R.id.btnInfo);
        btnEmail = (Button)findViewById(R.id.btnEmail);
        btnInfo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "Test Email from C347");
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));
            }
        });
    }



}
