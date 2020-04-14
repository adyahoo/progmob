package id.ac.unud1805551035;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{
    private ArrayList<Mahasiswa> datalist;

    public MahasiswaAdapter(ArrayList<Mahasiswa> datalist){
        this.datalist = datalist;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.tampil_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position){
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.txtNim.setText(datalist.get(position).getNim());
        holder.txtEmail.setText(datalist.get(position).getEmail());
    }

    @Override
    public int getItemCount(){
        return (datalist != null)? datalist.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtNim, txtEmail;

        public MahasiswaViewHolder(View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mhs);
            txtNim = (TextView) itemView.findViewById(R.id.txt_nim_mhs);
            txtEmail = (TextView) itemView.findViewById(R.id.txt_email_mhs);
        }
    }
}
