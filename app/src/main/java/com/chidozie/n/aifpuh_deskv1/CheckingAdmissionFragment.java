package com.chidozie.n.aifpuh_deskv1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chidozie.n.aifpuh_deskv1.databinding.FragmentCheckingAdmissionBinding;

/**
 * Created by Chidozie on 06/08/2020.
 */
public class CheckingAdmissionFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FragmentCheckingAdmissionBinding binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_checking_admission,
                container, false);

        String text = getString(R.string.checking_admission_details);
        binding.detailTextView.setText(Html.fromHtml(text));

        return binding.getRoot();
    }

}
