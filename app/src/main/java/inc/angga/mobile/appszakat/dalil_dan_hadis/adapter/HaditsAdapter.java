package inc.angga.mobile.appszakat.dalil_dan_hadis.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.DataDalilHadits;
import inc.angga.mobile.appszakat.dalil_dan_hadis.DetailHaditsActivity;

/**
 * Created by ACER on 4/2/2017.
 */

public class HaditsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private Context mContext;

    public HaditsAdapter(Context context){
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hadits_adapter_layout, parent, false);
        return new HaditsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        final HaditsAdapter.ViewHolder holder = (HaditsAdapter.ViewHolder) viewHolder;
        holder.tvHadits.setText(DataDalilHadits.getTitleHadits().get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailHaditsActivity.class);
                intent.putExtra("position", position);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataDalilHadits.getTitleHadits().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvHadits;

        public ViewHolder(View view){
            super(view);
            tvHadits = (TextView)view.findViewById(R.id.tv_hadits);
        }
    }
}
