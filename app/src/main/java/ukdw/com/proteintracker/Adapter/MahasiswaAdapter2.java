package ukdw.com.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ukdw.com.proteintracker.Model.Mahasiswa;
import ukdw.com.proteintracker.Model.Mahasiswa2;
import ukdw.com.proteintracker.R;


public class MahasiswaAdapter2 extends RecyclerView.Adapter<MahasiswaAdapter2.ViewHolder>{

    ArrayList<Mahasiswa2> mahasiswaArrayList2;

    public MahasiswaAdapter2(ArrayList<Mahasiswa2> mahasiswaArrayList2) {
        this.mahasiswaArrayList2 = mahasiswaArrayList2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mahasiswa,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mahasiswaArrayList2.get(position).getNama());
        holder.txtNim.setText(mahasiswaArrayList2.get(position).getNim());
        holder.txtGender.setText(mahasiswaArrayList2.get(position).getGender());
        holder.txtHobi.setText(mahasiswaArrayList2.get(position).getHobi());
        holder.txtCita.setText(mahasiswaArrayList2.get(position).getCita());
        holder.txtMotto.setText(mahasiswaArrayList2.get(position).getMotto());
        holder.imgFoto.setImageResource(mahasiswaArrayList2.get(position).getFoto());

        /*holder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = mahasiswaArrayList2.get(position).getNama().toString();
                Toast.makeText(context, nama + " is selected", Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (mahasiswaArrayList2 != null) ?mahasiswaArrayList2.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtGender, txtHobi, txtCita, txtMotto;
        ImageView imgFoto;

        public ViewHolder(View view){
            super(view);

            txtNama = view.findViewById(R.id.txt_nama);
            txtNim = view.findViewById(R.id.txt_nim);
            txtGender = view.findViewById(R.id.txt_gender);
            txtHobi = view.findViewById(R.id.txt_hobi);
            txtCita = view.findViewById(R.id.txt_citacita);
            txtMotto = view.findViewById(R.id.txt_motto);
            imgFoto = view.findViewById(R.id.imageView);
        }
    }
}
