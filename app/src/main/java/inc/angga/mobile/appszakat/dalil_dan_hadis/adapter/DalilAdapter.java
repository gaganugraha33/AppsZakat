package inc.angga.mobile.appszakat.dalil_dan_hadis.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.DataDalil;
import inc.angga.mobile.appszakat.dalil_dan_hadis.fragment.DalilDownFragment;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private FragmentManager mfragmentManager;

    public DalilAdapter(FragmentManager fragmentManager){
        mfragmentManager = fragmentManager;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dalil_adapter_layout, parent, false);
        return new DalilAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        final DalilAdapter.ViewHolder holder = (DalilAdapter.ViewHolder) viewHolder;
        holder.tvSurat.setText(DataDalil.getTitleDalil().get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mfragmentManager.beginTransaction()
                        .replace(R.id.fl_container_2, DalilDownFragment.newInstance(position)).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataDalil.getTitleDalil().size();
    }

     public class ViewHolder extends RecyclerView.ViewHolder{
         private TextView tvSurat;

        public ViewHolder(View view){
            super(view);
            tvSurat = (TextView)view.findViewById(R.id.tv_surat);
        }
    }
}
