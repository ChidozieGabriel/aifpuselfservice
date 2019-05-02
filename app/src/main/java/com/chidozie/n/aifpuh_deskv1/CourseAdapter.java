package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.chidozie.n.aifpuh_deskv1.CourseAdapter.CourseHolder;
import com.chidozie.n.aifpuh_deskv1.databinding.VerySimpleListItemBinding;

/**
 * Created by Chidozie on 14-Jan-19.
 */
public abstract class CourseAdapter extends RecyclerView.Adapter<CourseHolder> {

    private final String[] list;
    private final String[] fList;
    private final Context context;
    private final int noOfCourses;

    public CourseAdapter(Context context, String[] list, String[] fList) {
        this.list = list;
        this.fList = fList;
        this.context = context;
        noOfCourses = noOfCourses();
    }

    @NonNull
    @Override
    public CourseHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final VerySimpleListItemBinding binding = DataBindingUtil.inflate(
            inflater, R.layout.very_simple_list_item, viewGroup, false);
        return new CourseHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseHolder courseHolder, int position) {

        courseHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.length + fList.length + (fList.length > 0 ? 1 : 0);
    }

    public abstract int noOfCourses();

    public class CourseHolder extends RecyclerView.ViewHolder {

        private final VerySimpleListItemBinding itemBinding;

        public CourseHolder(@NonNull VerySimpleListItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }

        public void bind(int position) {
            String formatted, text;
            final int length = list.length;
            if (position < length) {
                text = list[position];
                formatted = context.getString(R.string.course_item_format, position + 1, text);
            } else if (position == length) {
                formatted = context.getString(R.string.course_item_f_statement_format, position + 1, noOfCourses - length);
            } else {

                final int fPos = position - 1 - length;
                text = fList[fPos];
                String append = fPos + 1 == fList.length ? "." : ",";
                formatted = context.getString(R.string.course_item_f_format, text, append);
            }

            itemBinding.textView.setText(formatted);
        }
    }

}
