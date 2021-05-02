package com.example.internationalunitchanger;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_menu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_menu extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    CardView bt1;
    CardView bt2;
    CardView bt3;
    CardView bt4;
    Button bt5;

    public fragment_menu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_menu.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_menu newInstance(String param1, String param2) {
        fragment_menu fragment = new fragment_menu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        /**Menu de notre application qui nous permet de voyager dans la navigation de l'application*/
     View rootView = inflater.inflate(R.layout.fragment_menu,container,false);

        bt1 = rootView.findViewById(R.id.cardview1);
        bt1.setOnClickListener(v ->{
            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_poid);
        });

        bt2 = rootView.findViewById(R.id.cardview2);
        bt2.setOnClickListener(v ->{
            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_distance);
        });

        bt3 = rootView.findViewById(R.id.cardview3);
        bt3.setOnClickListener(v ->{
            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_cuisine);
        });

        bt4 = rootView.findViewById(R.id.cardview4);
        bt4.setOnClickListener(v ->{
            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_devise);
        });
        bt5 = rootView.findViewById(R.id.button);
        bt5.setOnClickListener(v ->{
            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_historique);
        });
     return rootView;
    }
}