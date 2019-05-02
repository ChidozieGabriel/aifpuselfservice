package com.chidozie.n.aifpuh_deskv1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chidozie.n.aifpuh_deskv1.databinding.FragmentDepartmentBinding;

/**
 * Created by Chidozie on 12/29/2018.
 */
public class DepartmentFragment extends Fragment {

    private static final String KEY_POS = "key_pos";
    private int position;

    public static DepartmentFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt(KEY_POS, position);

        DepartmentFragment fragment = new DepartmentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getArguments() != null;
        this.position = getArguments().getInt(KEY_POS, 0);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FragmentDepartmentBinding binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_department, container, false);

        AppCompatActivity activity = (AppCompatActivity) getActivity();

        final String titleBarText = getResources().getStringArray(R.array.department_list)[position];
        if (activity != null) {
            if (activity.getSupportActionBar() != null) {
                activity.getSupportActionBar().setTitle(titleBarText);
            }
        }

        int olevelArray = -1;
        int jambArray = -1;
        int olevelFollowArray = -1;
        int jambFollowArray = -1;
        switch (position) {
            case Departments.ACCOUNTANCY:
                olevelArray = R.array.accountancy_olevel;
                jambArray = R.array.accountancy_jamb;
                olevelFollowArray = R.array.accountancy_olevel_following;
                jambFollowArray = R.array.accountancy_jamb_following;
                break;
            case Departments.AGRIC:
                olevelArray = R.array.agric_olevel;
                jambArray = R.array.agric_jamb;
                olevelFollowArray = R.array.agric_olevel_following;
                jambFollowArray = R.array.agric_jamb_following;
                break;
            case Departments.ARCHI_TECH:
                olevelArray = R.array.archi_tech_olevel;
                jambArray = R.array.archi_tech_jamb;
                olevelFollowArray = R.array.archi_tech_olevel_following;
                jambFollowArray = R.array.archi_tech_jamb_following;
                break;
            case Departments.BUILD_TECH:
                olevelArray = R.array.build_tech_olevel;
                jambArray = R.array.build_tech_jamb;
                olevelFollowArray = R.array.build_tech_olevel_following;
                jambFollowArray = R.array.build_tech_jamb_following;
                break;
            case Departments.BUS_ADMIN:
                olevelArray = R.array.build_tech_olevel;
                jambArray = R.array.build_tech_jamb;
                olevelFollowArray = R.array.build_tech_olevel_following;
                jambFollowArray = R.array.build_tech_jamb_following;
                break;
            case Departments.CIVIL_ENGR:
                olevelArray = R.array.civil_engr_olevel;
                jambArray = R.array.civil_engr_jamb;
                olevelFollowArray = R.array.civil_engr_olevel_following;
                jambFollowArray = R.array.civil_engr_jamb_following;
                break;
            case Departments.COMP_ENGR:
                olevelArray = R.array.comp_engr_olevel;
                jambArray = R.array.comp_engr_jamb;
                olevelFollowArray = R.array.comp_engr_olevel_following;
                jambFollowArray = R.array.comp_engr_jamb_following;
                break;
            case Departments.COMP_SCI:
                olevelArray = R.array.comp_sci_olevel;
                jambArray = R.array.comp_sci_jamb;
                olevelFollowArray = R.array.comp_sci_olevel_following;
                jambFollowArray = R.array.comp_sci_jamb_following;
                break;
            case Departments.ELECTR_ENGR:
                olevelArray = R.array.electr_engr_olevel;
                jambArray = R.array.electr_engr_jamb;
                olevelFollowArray = R.array.electr_engr_olevel_following;
                jambFollowArray = R.array.electr_engr_jamb_following;
                break;
            case Departments.ESTATE:
                olevelArray = R.array.estate_olevel;
                jambArray = R.array.estate_jamb;
                olevelFollowArray = R.array.estate_olevel_following;
                jambFollowArray = R.array.estate_jamb_following;
                break;
            case Departments.FOOD_TECH:
                olevelArray = R.array.food_tech_olevel;
                jambArray = R.array.food_tech_jamb;
                olevelFollowArray = R.array.food_tech_olevel_following;
                jambFollowArray = R.array.food_tech_jamb_following;
                break;
            case Departments.GLASS_CERAMICS:
                olevelArray = R.array.glass_ceramics_olevel;
                jambArray = R.array.glass_ceramics_jamb;
                olevelFollowArray = R.array.glass_ceramics_olevel_following;
                jambFollowArray = R.array.glass_ceramics_jamb_following;
                break;
            case Departments.HORTICULTURE:
                olevelArray = R.array.horticulture_olevel;
                jambArray = R.array.horticulture_jamb;
                olevelFollowArray = R.array.horticulture_olevel_following;
                jambFollowArray = R.array.horticulture_jamb_following;
                break;
            case Departments.HOSPITALITY:
                olevelArray = R.array.hospitality_olevel;
                jambArray = R.array.hospitality_jamb;
                olevelFollowArray = R.array.hospitality_olevel_following;
                jambFollowArray = R.array.hospitality_jamb_following;
                break;
            case Departments.LIBRARY:
                olevelArray = R.array.library_olevel;
                jambArray = R.array.library_jamb;
                olevelFollowArray = R.array.library_olevel_following;
                jambFollowArray = R.array.library_jamb_following;
                break;
            case Departments.MARKETING:
                olevelArray = R.array.marketing_olevel;
                jambArray = R.array.marketing_jamb;
                olevelFollowArray = R.array.marketing_olevel_following;
                jambFollowArray = R.array.marketing_jamb_following;
                break;
            case Departments.MECH_ENGR:
                olevelArray = R.array.mech_engr_olevel;
                jambArray = R.array.mech_engr_jamb;
                olevelFollowArray = R.array.mech_engr_olevel_following;
                jambFollowArray = R.array.mech_engr_jamb_following;
                break;
            case Departments.MECHATRONICS:
                olevelArray = R.array.mechatronics_olevel;
                jambArray = R.array.mechatronics_jamb;
                olevelFollowArray = R.array.mechatronics_olevel_following;
                jambFollowArray = R.array.mechatronics_jamb_following;
                break;
            case Departments.METALLURGICAL:
                olevelArray = R.array.metallurgical_olevel;
                jambArray = R.array.metallurgical_jamb;
                olevelFollowArray = R.array.metallurgical_olevel_following;
                jambFollowArray = R.array.metallurgical_jamb_following;
                break;
            case Departments.OFFICE:
                olevelArray = R.array.office_olevel;
                jambArray = R.array.office_jamb;
                olevelFollowArray = R.array.office_olevel_following;
                jambFollowArray = R.array.office_jamb_following;
                break;
            case Departments.PUBLIC_ADMIN:
                olevelArray = R.array.public_admin_olevel;
                jambArray = R.array.public_admin_jamb;
                olevelFollowArray = R.array.public_admin_olevel_following;
                jambFollowArray = R.array.public_admin_jamb_following;
                break;
            case Departments.QUANTITY_SURVEYING:
                olevelArray = R.array.quantity_surveying_olevel;
                jambArray = R.array.quantity_surveying_jamb;
                olevelFollowArray = R.array.quantity_surveying_olevel_following;
                jambFollowArray = R.array.quantity_surveying_jamb_following;
                break;
            case Departments.SCI_LAB:
                olevelArray = R.array.sci_lab_olevel;
                jambArray = R.array.sci_lab_jamb;
                olevelFollowArray = R.array.sci_lab_olevel_following;
                jambFollowArray = R.array.sci_lab_jamb_following;
                break;
            case Departments.STATS:
                olevelArray = R.array.stats_olevel;
                jambArray = R.array.stats_jamb;
                olevelFollowArray = R.array.stats_olevel_following;
                jambFollowArray = R.array.stats_jamb_following;
                break;
            case Departments.SURVEYING:
                olevelArray = R.array.surveying_olevel;
                jambArray = R.array.surveying_jamb;
                olevelFollowArray = R.array.surveying_olevel_following;
                jambFollowArray = R.array.surveying_jamb_following;
                break;
            case Departments.URBAN_PLANNING:
                olevelArray = R.array.urban_planning_olevel;
                jambArray = R.array.urban_planning_jamb;
                olevelFollowArray = R.array.urban_planning_olevel_following;
                jambFollowArray = R.array.urban_planning_jamb_following;
                break;
        }

        // O Level
        final RecyclerView olevelRecycler = binding.includeListViewOlevel.recyclerViewCourse;
        olevelRecycler.setLayoutManager(new LinearLayoutManager(activity));
        final String[] olevelList = olevelArray < 0 ? null : getResources().getStringArray(olevelArray);
        final String[] olevelFollowList = olevelArray < 0 ? null : getResources().getStringArray(olevelFollowArray);
        olevelRecycler.setAdapter(new CourseAdapter(activity, olevelList, olevelFollowList) {
            @Override
            public int noOfCourses() {
                return 5;
            }
        });

        // Jamb
        final RecyclerView jambRecycler = binding.includeListViewJamb.recyclerViewCourse;
        jambRecycler.setLayoutManager(new LinearLayoutManager(activity));
        final String[] jambList = jambArray < 0 ? null : getResources().getStringArray(jambArray);
        final String[] jambFollowList = jambArray < 0 ? null : getResources().getStringArray(jambFollowArray);
        jambRecycler.setAdapter(new CourseAdapter(activity, jambList, jambFollowList) {
            @Override
            public int noOfCourses() {
                return 3;
            }
        });

        return binding.getRoot();
    }

}
