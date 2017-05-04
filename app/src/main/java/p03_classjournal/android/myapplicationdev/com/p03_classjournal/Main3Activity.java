package p03_classjournal.android.myapplicationdev.com.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tvWeek, tvDG;
    ImageView iv;
    Button submit;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();
        String title = i.getStringExtra("title");
        String image = i.getStringExtra("image");
        int week = i.getIntExtra("week",0);

        tvWeek = (TextView)findViewById(R.id.textViewWeek);
        tvDG = (TextView)findViewById(R.id.textViewDG);
        iv = (ImageView)findViewById(R.id.imageView);
        submit = (Button)findViewById(R.id.buttonSubmit);


        tvDG.setText(title);
        tvWeek.setText("Week " + week);
//        int resID = Main3Activity.this.getResources().getIdentifier(image , "drawable", Main3Activity.this.getPackageName());
//        iv.setImageResource(resID);
//        iv.setImageResource(R.drawable.image);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);

                Intent i = new Intent();
                i.putExtra("grade", rb.getText());
                // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                setResult(RESULT_OK, i);
                finish();

            }
        });


    }
}

