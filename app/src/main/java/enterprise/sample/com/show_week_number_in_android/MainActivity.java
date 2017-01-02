package enterprise.sample.com.show_week_number_in_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = (TextView)findViewById(R.id.textView);
        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button1);
        Button btn3 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String i="Length from String";
                textView1.setText(Integer.toString(i.length()));

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, Integer.toString(getWeek()), Toast.LENGTH_LONG).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String toastFormat = "%-20s %-15s%n";
                ArrayList<String> strings = new ArrayList<>();
                strings.add(String.format(toastFormat, "SuperPosition1", "E=mc²"));
                strings.add(String.format(toastFormat, "SuperPosition2", "E=mc²"));
                strings.add(String.format(toastFormat, "SuperPosition3", "E=mc²"));
                strings.add(String.format(toastFormat, "SuperPosition4", "E=mc²"));

                StringBuilder builder = new StringBuilder();
                for(String s : strings) {
                    builder.append(s);
                }

                Toast.makeText(getApplicationContext(), builder, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Max Value: "+Integer.toString(Integer.MAX_VALUE), Toast.LENGTH_LONG).show();
            }
        });
    }






    public static int getWeek() {
        return Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
    }
}
