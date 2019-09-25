package ukdw.com.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ukdw.com.proteintracker.Model.Mahasiswa;
import ukdw.com.proteintracker.R;

public class TesAdapter extends  RecyclerView.Adapter<TesAdapter.ViewHolder>{

    ArrayList<Mahasiswa> mahasiswaArrayList;
    public 
    public  class  ViewHolder extends RecyclerView.ViewHolder{
        LayoutInflater layoutInflater = LayoutInflater,from(parent.getContext)
        private TextView txtNama, txtNoHp,txtNim;

        public  ViewHolder (View view){
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNim = view.findViewById(R.id.txt_nohp_mahasiswa);
            txtNoHp = view.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
