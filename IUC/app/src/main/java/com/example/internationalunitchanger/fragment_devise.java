package com.example.internationalunitchanger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
/**
 * //////////////////////////////////////////////////////////////////////////////
 * POUR VOIR LES COMMENTAIRES POUR L4EXPLICATION DU CODE VOIR : fragment_cuisine
 * TOUT LES FRAGMENTS SONT FAIT DE LA MEME SORTE (sauf fragment_menu)
 * //////////////////////////////////////////////////////////////////////////////
 */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_devise#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_devise extends Fragment implements AdapterView.OnItemSelectedListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    EditText input;
    EditText output_eur;
    EditText output_usd;
    EditText output_jpy;
    EditText output_gbp;
    Button button;


    public fragment_devise() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_devise.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_devise newInstance(String param1, String param2) {
        fragment_devise fragment = new fragment_devise();
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
        View rootView = inflater.inflate(R.layout.fragment_devise,container,false);
        Spinner spinner = rootView.findViewById(R.id.spinner);
        input = rootView.findViewById(R.id.editTextNumber);
        output_eur = rootView.findViewById(R.id.editTextNumber2);
        output_usd = rootView.findViewById(R.id.editTextNumber3);
        output_jpy = rootView.findViewById(R.id.editTextNumber4);
        output_gbp = rootView.findViewById(R.id.editTextNumber5);

        button = rootView.findViewById(R.id.button2);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),R.array.inputs_devise, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        return rootView;
    }

    void Convert_eur(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue;
        final float outputValue2 = inputValue* 1.2020f;
        final float outputValue3 = inputValue*131.3787f;
        final float outputValue4 = inputValue*0.8699f;


        final String outputStr = String.format("%.4f",outputValue);
        final String outputStr2 = String.format("%.4f",outputValue2);
        final String outputStr3 = String.format("%.4f",outputValue3);
        final String outputStr4 = String.format("%.4f",outputValue4);
        ;

        output_eur.setText(outputStr);
        output_usd.setText(outputStr2);
        output_jpy.setText(outputStr3);
        output_gbp.setText(outputStr4);


    }

    void Convert_usd(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue*0.8319f;
        final float outputValue2 = inputValue;
        final float outputValue3 = inputValue*109.3005f;
        final float outputValue4 = inputValue*0.7237f;


        final String outputStr = String.format("%.4f",outputValue);
        final String outputStr2 = String.format("%.4f",outputValue2);
        final String outputStr3 = String.format("%.4f",outputValue3);
        final String outputStr4 = String.format("%.4f",outputValue4);
        ;

        output_eur.setText(outputStr);
        output_usd.setText(outputStr2);
        output_jpy.setText(outputStr3);
        output_gbp.setText(outputStr4);


    }
    void Convert_jpy(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue*0.0076f;
        final float outputValue2 = inputValue* 0.0091f;
        final float outputValue3 = inputValue;
        final float outputValue4 = inputValue*0.0066f;


        final String outputStr = String.format("%.4f",outputValue);
        final String outputStr2 = String.format("%.4f",outputValue2);
        final String outputStr3 = String.format("%.4f",outputValue3);
        final String outputStr4 = String.format("%.4f",outputValue4);
        ;

        output_eur.setText(outputStr);
        output_usd.setText(outputStr2);
        output_jpy.setText(outputStr3);
        output_gbp.setText(outputStr4);


    }
    void Convert_gbp(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue*1.1495f;
        final float outputValue2 = inputValue* 1.3817f;
        final float outputValue3 = inputValue*151.0210f;
        final float outputValue4 = inputValue;


        final String outputStr = String.format("%.4f",outputValue);
        final String outputStr2 = String.format("%.4f",outputValue2);
        final String outputStr3 = String.format("%.4f",outputValue3);
        final String outputStr4 = String.format("%.4f",outputValue4);
        ;

        output_eur.setText(outputStr);
        output_usd.setText(outputStr2);
        output_jpy.setText(outputStr3);
        output_gbp.setText(outputStr4);


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0)
        {
            button.setOnClickListener(this::Convert_eur);
        }
        if(position == 1)
        {
            button.setOnClickListener(this::Convert_usd);
        }
        if(position == 2)
        {
            button.setOnClickListener(this::Convert_jpy);
        }
        if(position == 3)
        {
            button.setOnClickListener(this::Convert_gbp);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}