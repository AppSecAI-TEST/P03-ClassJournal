package p03_classjournal.android.myapplicationdev.com.p03_classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvModules);
        al = new ArrayList<String>();
        al.add("C347");

        aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);
        aa.notifyDataSetChanged();

    }
}
