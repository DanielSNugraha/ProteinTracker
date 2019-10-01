package ukdw.com.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ukdw.com.proteintracker.Model.Mahasiswa;
import ukdw.com.proteintracker.R;

public class MahasiswaAdapter extends
        RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>{
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArrayList) {
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNohp.setText(mahasiswaArrayList.get(position).getNohp());
        holder.txtNpm.setText(mahasiswaArrayList.get(position).getNpm());
    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (mahasiswaArrayList != null) ?mahasiswaArrayList.size() : 0; }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNohp, txtNpm;

        public ViewHolder(View view){
            super(view);

            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
            txtNohp = view.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
