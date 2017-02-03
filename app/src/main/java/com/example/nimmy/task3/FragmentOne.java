package com.example.nimmy.task3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nimmy on 31-01-2017.
 */

 public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentone, container, false);

        Button button1;
        button1 = (Button) view.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTwo fragmentTwo = new FragmentTwo();
                //FragmentManager fm = getFragmentManager().popBackStack();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_fragment,fragmentTwo);
                ft.addToBackStack("");
                ft.commit();

            }
        });
        return view;

    }
}

//    @Override
//    public void onClick(View v) {
//
//                FragmentTwo fragmentTwo = new FragmentTwo();
//                //FragmentManager fm = getFragmentManager().popBackStack();
//        FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.fragment2,fragmentTwo);
//                ft.addToBackStack("");
//                ft.commit();
//    }
//}




 //   }
