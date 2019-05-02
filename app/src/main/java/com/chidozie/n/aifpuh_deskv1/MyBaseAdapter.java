package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.chidozie.n.aifpuh_deskv1.MyBaseAdapter.MyHolder;
import com.chidozie.n.aifpuh_deskv1.databinding.SimpleListItemBinding;

/**
 * Created by Chidozie on 12/29/2018.
 */
public class MyBaseAdapter extends Adapter<MyHolder> {

    private final String[] list;
    private Context context;

    public MyBaseAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    protected MyHolder getHolder(SimpleListItemBinding itemBinding) {
        return new MyHolder(itemBinding);
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final SimpleListItemBinding simpleListItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.simple_list_item, viewGroup, false);
        return getHolder(simpleListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        myHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        protected final SimpleListItemBinding binding;
        private String item;

        public MyHolder(SimpleListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(int position) {
            item = list[position];
            binding.textView.setText(item);
            binding.executePendingBindings();
        }

    }
}
