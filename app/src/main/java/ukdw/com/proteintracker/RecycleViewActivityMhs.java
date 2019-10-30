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



        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter2(mahasiswaArrayList2);

        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecycleViewActivityMhs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }}


