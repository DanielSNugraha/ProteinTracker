package ukdw.com.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ukdw.com.proteintracker.Adapter.MahasiswaAdapter2;
import ukdw.com.proteintracker.Model.Mahasiswa2;

public class RecycleViewActivityMhs extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter2 mahasiswaAdapter;
    private ArrayList<Mahasiswa2> mahasiswaArrayList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_mhs);

            addData();

            recyclerView = findViewById(R.id.rvMahasiswa);
            mahasiswaAdapter = new MahasiswaAdapter2(mahasiswaArrayList2);

            RecyclerView.LayoutManager layoutManager = new
                    LinearLayoutManager(RecycleViewActivityMhs.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(mahasiswaAdapter);
        }
        private void addData(){
            mahasiswaArrayList2 = new ArrayList<>();
            mahasiswaArrayList2.add(new Mahasiswa2("Eva Kristina",
                    "72170091","Perempuan", " Hobi : Bermain Game", " Cita-cita : Animal Resquer",
                    "Motto : Life is Simple", R.drawable.eva));
            mahasiswaArrayList2.add(new Mahasiswa2("Emma Norren",
                    "72170097", "Perempuan", "Hobi : Melukis",
                    "Cita-cita : Pengusaha Fashion", " Motto : Stop Dreaming & Start Doing", R.drawable.emma));
            mahasiswaArrayList2.add(new Mahasiswa2("Cynthia Kumalasari",
                    "72170101", "Perempuan", "Hobi : Nge-gym", "Cita-cita : President Team Herbalife",
                    "Motto : No Pain, No Gain", R.drawable.cynkum));
            mahasiswaArrayList2.add(new Mahasiswa2("Monica Carista",
                    "72170133", "Perempuan", "Hobi : Main Game", "Cita-cita : Berguna bagi keluarga",
                    "Motto : Don't Judge!", R.drawable.monic));
    }
}
