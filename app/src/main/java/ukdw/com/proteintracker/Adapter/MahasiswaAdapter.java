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
        RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {
    private ArrayList<Mahasiswa> dataList ;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this . dataList = dataList;
    }
    public ViewHolder onCreateViewHolder( @NonNull ViewGroup parent,
                                          int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater. from (parent.getContext());
        View view = layoutInflater.inflate(R.layout. card_view_mhs ,
                parent, false );
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int
            position) {
        holder. txtNama .setText( dataList .get(position).getNama());
        holder. txtNim .setText( dataList .get(position).getNpm());
        holder. txtNoHp .setText( dataList .get(position).getNohp());
    }
    @Override
    public int getItemCount() {
        return ( dataList != null ) ? dataList .size() : 0 ;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama , txtNim , txtNoHp ;
        public ViewHolder(View view){
            super (view);
            txtNama = view.findViewById(R.id. txt_nama_mahasiswa );
            txtNoHp = view.findViewById(R.id. txt_nohp_mahasiswa );
            txtNim = view.findViewById(R.id. txt_nim_mahasiswa );
        }
    }
}