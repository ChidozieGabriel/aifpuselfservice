package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Chidozie on 12/28/2018.
 */
public class AllDepartmentsActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, AllDepartmentsActivity.class);
    }
    @Override
    protected Fragment createFragment() {
        return new AllDepartmentsFragment();
    }
}
