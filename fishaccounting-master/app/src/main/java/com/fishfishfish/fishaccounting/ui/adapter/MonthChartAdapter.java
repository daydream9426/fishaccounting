package com.fishfishfish.fishaccounting.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fishfishfish.fishaccounting.R;
import com.fishfishfish.fishaccounting.model.bean.local.FishBill;

import java.util.List;

/**
 * ChartFragment
 */
public class MonthChartAdapter extends RecyclerView.Adapter<MonthChartAdapter.ViewHolder> {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<FishBill> mDatas;
    private String sortName;

    public MonthChartAdapter(Context context, List<FishBill> datas) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public void setmDatas(List<FishBill> mDatas) {
        this.mDatas = mDatas;
    }

    @Override
    public int getItemCount() {
        return (mDatas == null) ? 0 : mDatas.size();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_tallytype_rank, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.rank.setText(position + 1 + "");
        holder.title.setText(sortName);
        if (mDatas.get(position).isIncome())
            holder.money.setText("+" + mDatas.get(position).getCost());
        else
            holder.money.setText("-" + mDatas.get(position).getCost());
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView money;
        private TextView rank;

        public ViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);
            money = (TextView) view.findViewById(R.id.money);
            rank = (TextView) view.findViewById(R.id.rank);

        }


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
            }
        }
    }

}
