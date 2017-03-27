package inc.angga.mobile.appszakat.dalil_dan_hadis.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.DataDalil;
import inc.angga.mobile.appszakat.dalil_dan_hadis.model.DalilField;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilAdapterDetail extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private int mPosition;

    public DalilAdapterDetail(int position){
        mPosition = position;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dalil_detail_adapter_layout, parent, false);
        return new DalilAdapterDetail.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final DalilAdapterDetail.ViewHolder holder = (DalilAdapterDetail.ViewHolder) viewHolder;
        holder.tvNoSurat.setText(DataDalil.getDetailSuratDalil(mPosition).get(position).get(DalilField.noDalil).toString());
        holder.tvDetailSurat.setText(DataDalil.getDetailSuratDalil(mPosition).get(position).get(DalilField.DetailDalil).toString());
    }

    @Override
    public int getItemCount() {
        return DataDalil.getDetailSuratDalil(mPosition).size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNoSurat;
        private TextView tvDetailSurat;

        public ViewHolder(View view){
            super(view);
            tvNoSurat = (TextView)view.findViewById(R.id.tv_no_surat);
            tvDetailSurat = (TextView)view.findViewById(R.id.tv_detail_surat);

        }
    }
}
