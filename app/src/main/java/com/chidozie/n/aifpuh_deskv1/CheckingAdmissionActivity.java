package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Chidozie on 06/08/2020.
 */
public class CheckingAdmissionActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, CheckingAdmissionActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return new CheckingAdmissionFragment();
    }
}
