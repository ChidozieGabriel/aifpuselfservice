//package com.chidozie.n.aifpuh_deskv1;
//
///**
// * Created by Chidozie on 09-Jan-19.
// */
//
//import android.databinding.ViewDataBinding;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.RecyclerView.Adapter;
//import android.view.ViewGroup;
//
//import com.chidozie.n.aifpuh_deskv1.MineBaseAdapter.MineHolder;
//
//
//public abstract class MineBaseAdapter<
//    Item,
//    ItemBinding extends ViewDataBinding>
//    extends Adapter<MineHolder> {
//
//    private final Item[] list;
//
//    public MineBaseAdapter(Item[] list) {
//        this.list = list;
//    }
//
//    public abstract ItemBinding getItemBinding(ViewGroup parent);
//
//    @NonNull
//    @Override
//    public MineHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
//        return new MineHolder(getItemBinding(viewGroup));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MineHolder mineHolder, int position) {
//        mineHolder.bind(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.length;
//    }
//
//    /**
//     * Override method {@link #bind(int) bind}
//     * to bind each {@link Item item} to it's {@link ItemBinding view}.
//     */
//    public class MineHolder extends RecyclerView.ViewHolder {
//        protected final ItemBinding itemBinding;
//        protected Item item;
//
//        MineHolder(ItemBinding itemBinding) {
//            super(itemBinding.getRoot());
//            this.itemBinding = itemBinding;
//        }
//
//        void bind(int position) {
//            item = list[position];
//            itemBinding.executePendingBindings();
//        }
//    }
//}
//
