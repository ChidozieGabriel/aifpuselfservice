package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.chidozie.n.aifpuh_deskv1.databinding.FragmentAllDepartmentsBinding;
import com.chidozie.n.aifpuh_deskv1.databinding.SimpleListItemBinding;

/**
 * Created by Chidozie on 12/28/2018.
 */
public class AllDepartmentsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FragmentAllDepartmentsBinding binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_all_departments,
                container, false);

        binding.recyclerView.setLayoutManager(
            new LinearLayoutManager(getActivity()));

        binding.recyclerView.setAdapter(new DepartmentAdapter(getActivity(),
            getResources().getStringArray(R.array.department_list)));

        return binding.getRoot();
    }

    public class DepartmentAdapter extends MyBaseAdapter {
        public DepartmentAdapter(Context context, String[] list) {
            super(context, list);
        }

        @Override
        protected MyHolder getHolder(SimpleListItemBinding itemBinding) {
            return new DepartmentHolder(itemBinding);
        }

        public class DepartmentHolder extends MyHolder {
            public DepartmentHolder(SimpleListItemBinding binding) {
                super(binding);
                binding.textView.setTextSize(16);
            }

            @Override
            public void bind(final int position) {
                super.bind(position);

                binding.getRoot().setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // from position go to respective activity
                        Intent i = DepartmentActivity.newIntent(getActivity(), position);
                        startActivity(i);
                    }
                });
            }
        }

    }
}
