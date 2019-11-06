package ukdw.com.proteintracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProteinTrackerApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin",null); Button btnLogin = (Button)findViewById(R.id.btnLogim);
        btnLogin.setOnClickListener(myBtnLoginClick);
        if (statusLogin != null){ btnLogin.setText("Logout");
        }
        else{ btnLogin.setText("Login");
        }

        setContentView(R.layout.activity_main);
        Button btnSetting = (Button)findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(myBtnSettingClick);


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
    private View.OnClickListener myBtnSettingClick = new View.OnClickListener() {
        @Override public void onClick(View v) {
            Intent intent = new Intent(ProteinTrackerApp.this, SettingsProteinTracker.class);
            startActivity(intent);
        };
    };

    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
        @Override public void onClick(View v) {
            SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
            String statusLogin = prefs.getString("isLogin",null); SharedPreferences.Editor edit = prefs.edit();
            Button btnLogin = (Button)findViewById(R.id.btnLogim); if (statusLogin != null){ edit.putString("isLogin",null);
            btnLogin.setText("Login"); }else{ edit.putString("isLogin","Admin"); btnLogin.setText("Logout");
            }
            edit.commit();
        }
    };
}

