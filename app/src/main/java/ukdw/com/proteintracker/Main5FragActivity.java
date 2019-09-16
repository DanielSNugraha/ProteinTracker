package ukdw.com.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5FragActivity extends AppCompatActivity
        implements ProteinFragment.SendMessages{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button btnTesFragment = findViewById(R.id.btnFrag5);
        btnTesFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai","Para Progmobers");
                ft.replace(R.id.frameMain, proteinFragment);
                ft.commit();
            }
        });

    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Protein2Fragment protein2Fragment = Protein2Fragment.newInstance(Message,"Para Progmobers");
        ft.replace(R.id.frameMain, protein2Fragment);
        ft.commit();
    }
}


