package ukdw.com.proteintracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProteinTrackerApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteintrackerapp);

        Button resetButton = (Button)findViewById(R.id.btnReset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProteinTrackerApp.this);
                builder.setMessage("Apakah anda yakin untuk mereset nilai protein?")

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ProteinTrackerApp.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();
                            } })

                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ProteinTrackerApp.this, "Melakukan RESET !!", Toast.LENGTH_SHORT).show();
                            } });
                AlertDialog dialog = builder.create(); dialog.show();
            }
        });
    }
}
