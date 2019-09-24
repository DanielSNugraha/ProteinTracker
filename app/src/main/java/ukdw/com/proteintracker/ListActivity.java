package ukdw.com.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam",
            "vel", "erat", "placerat", "ante", "porttitor", "sodales",
            "pellentesque", "augue", "purus"};

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ListView lv = (ListView)findViewById(R.id.lvLoremIpsum);

        Spinner spinner = findViewById((R.id.spinnerProgmob));

        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,items));
        ArrayAdapter<String> aa = new ArrayAdapter<>(ListActivity.this, android.R.layout.simple_spinner_item);
        spinner.setAdapter((new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_spinner_item)));
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {



          @Override public void onItemClick(AdapterView<?> parent, View view, int i, long l)
           { Toast.makeText(ListActivity.this,"Anda memilih " + items[i], Toast.LENGTH_SHORT).show();
                }
             }
        );
    }
}

