package com.chidozie.n.aifpuh_deskv1;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Chidozie on 12/29/2018.
 */
public class DepartmentActivity extends SingleFragmentActivity {
    private static final String EXTRA_POS = "com.chidozie.n.aifpuh_deskv1.DepartmentActivity.extra_pos";

    public static Intent newIntent(Context context, int position) {
        Intent i = new Intent(context, DepartmentActivity.class);
        i.putExtra(EXTRA_POS, position);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        final int pos = getIntent().getIntExtra(EXTRA_POS, 0);
        return DepartmentFragment.newInstance(pos);
    }
}
