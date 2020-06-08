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

import com.chidozie.n.aifpuh_deskv1.databinding.FragmentRegistrationBinding;

/**
 * Created by Chidozie on 06/08/2020.
 */
public class RegistrationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FragmentRegistrationBinding binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_registration,
                container, false);

        String online = getString(R.string.registration_online_details);
        binding.onlineRegistrationDetailTextView.setText(Html.fromHtml(online));
        String course = getString(R.string.registration_course_details);
        binding.courseRegistrationDetailTextView.setText(Html.fromHtml(course));

        return binding.getRoot();
    }

}
