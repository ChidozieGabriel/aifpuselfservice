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

import com.chidozie.n.aifpuh_deskv1.databinding.FragmentMainBinding;
import com.chidozie.n.aifpuh_deskv1.databinding.SimpleListItemBinding;

/**
 * Created by Chidozie on 12/28/2018.
 */
public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FragmentMainBinding binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_main, container, false);

        binding.recyclerView.setLayoutManager(
            new LinearLayoutManager(getActivity()));
        binding.recyclerView.setAdapter(
            new SimpleAdapter(getActivity(),
                getResources().getStringArray(R.array.help_desk_list)));


        return binding.getRoot();
    }

    protected class SimpleAdapter extends MyBaseAdapter {
        public SimpleAdapter(Context context, String[] list) {
            super(context, list);
        }

        @Override
        protected MyHolder getHolder(SimpleListItemBinding itemBinding) {
            return new SimpleHolder(itemBinding);
        }

        protected class SimpleHolder extends MyHolder {
            public SimpleHolder(SimpleListItemBinding binding) {
                super(binding);
            }

            @Override
            public void bind(final int position) {
                super.bind(position);
                binding.getRoot().setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = null;
                        switch (position) {
                            case Constants.CHECK_RESULT:
                                intent = CheckingAdmissionActivity.newIntent(getActivity());
                                break;
                            case Constants.REGISTER_COURSE:
                                intent = RegistrationActivity.newIntent(getActivity());
                                break;
                            case Constants.GENERATE_REMITA:
                                // todo
                                break;
                            case Constants.ADMISSION:
                                intent = AllDepartmentsActivity.newIntent(getActivity());
                                break;
                        }
                        if (intent != null) {
                            startActivity(intent);
                        }
                    }
                });
            }
        }
    }

}
