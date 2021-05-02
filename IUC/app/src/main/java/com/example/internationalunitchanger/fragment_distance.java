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
 * Use the {@link fragment_distance#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class fragment_distance extends Fragment implements AdapterView.OnItemSelectedListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    EditText input;
    EditText output_kilo;
    EditText output_heca;
    EditText output_deca;
    EditText output_gram;
    EditText output_deci;
    EditText output_centi;
    EditText output_mili;
    Button button;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_distance.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_distance newInstance(String param1, String param2) {
        fragment_distance fragment = new fragment_distance();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public fragment_distance() {
        // Required empty public constructor
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
        // Inflate the layout for this fragment

        //Spinner
        View rootView = inflater.inflate(R.layout.fragment_distance,container,false);
        Spinner spinner = rootView.findViewById(R.id.spinner);
        input = rootView.findViewById(R.id.editTextNumber);
        output_kilo = rootView.findViewById(R.id.editTextNumber2);
        output_heca = rootView.findViewById(R.id.editTextNumber3);
        output_deca = rootView.findViewById(R.id.editTextNumber4);
        output_gram = rootView.findViewById(R.id.editTextNumber5);
        output_deci = rootView.findViewById(R.id.editTextNumber6);
        output_centi = rootView.findViewById(R.id.editTextNumber7);
        output_mili = rootView.findViewById(R.id.editTextNumber8);
        button = rootView.findViewById(R.id.button2);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),R.array.inputs_distance, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        return rootView;
    }
    void Convert_kilo(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue + 0.f; // kilo en kilo
        final float outputValue2 = inputValue*10.f; // kilo en heca
        final float outputValue3 = inputValue*100.f; // kilo en deca
        final float outputValue4 = inputValue*1000.f; // kilo en gram
        final float outputValue5 = inputValue*10000.f; // kilo en deci
        final float outputValue6 = inputValue*100000.f; // kilo en centi
        final float outputValue7 = inputValue*1000000.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }
    void Convert_hecto(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/10.f; // kilo en kilo
        final float outputValue2 = inputValue; // kilo en heca
        final float outputValue3 = inputValue*10.f; // kilo en deca
        final float outputValue4 = inputValue*100.f; // kilo en gram
        final float outputValue5 = inputValue*1000.f; // kilo en deci
        final float outputValue6 = inputValue*10000.f; // kilo en centi
        final float outputValue7 = inputValue*100000.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);
    }

    void Convert_deca(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/100.f; // kilo en kilo
        final float outputValue2 = inputValue/10.f; // kilo en heca
        final float outputValue3 = inputValue; // kilo en deca
        final float outputValue4 = inputValue*10.f; // kilo en gram
        final float outputValue5 = inputValue*100.f; // kilo en deci
        final float outputValue6 = inputValue*1000.f; // kilo en centi
        final float outputValue7 = inputValue*10000.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }

    void Convert_gram(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/1000.f; // kilo en kilo
        final float outputValue2 = inputValue/100.f; // kilo en heca
        final float outputValue3 = inputValue/10.f; // kilo en deca
        final float outputValue4 = inputValue; // kilo en gram
        final float outputValue5 = inputValue*10.f; // kilo en deci
        final float outputValue6 = inputValue*100.f; // kilo en centi
        final float outputValue7 = inputValue*1000.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }

    void Convert_deci(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/10000.f; // kilo en kilo
        final float outputValue2 = inputValue/1000.f; // kilo en heca
        final float outputValue3 = inputValue/100.f; // kilo en deca
        final float outputValue4 = inputValue/10.f; // kilo en gram
        final float outputValue5 = inputValue; // kilo en deci
        final float outputValue6 = inputValue*10.f; // kilo en centi
        final float outputValue7 = inputValue*100.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }
    void Convert_centi(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/100000.f; // kilo en kilo
        final float outputValue2 = inputValue/10000.f; // kilo en heca
        final float outputValue3 = inputValue/1000.f; // kilo en deca
        final float outputValue4 = inputValue/100.f; // kilo en gram
        final float outputValue5 = inputValue/10.f; // kilo en deci
        final float outputValue6 = inputValue; // kilo en centi
        final float outputValue7 = inputValue*10.f; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }

    void Convert_milli(View sender){
        String inputStr = input.getText().toString();
        final float inputValue = Float.parseFloat(inputStr);

        final float outputValue = inputValue/1000000.f; // kilo en kilo
        final float outputValue2 = inputValue/100000.f; // kilo en heca
        final float outputValue3 = inputValue/10000.f; // kilo en deca
        final float outputValue4 = inputValue/1000.f; // kilo en gram
        final float outputValue5 = inputValue/100.f; // kilo en deci
        final float outputValue6 = inputValue/10.f; // kilo en centi
        final float outputValue7 = inputValue; // kilo en milli

        final String outputStr = String.format("%.2f",outputValue);
        final String outputStr2 = String.format("%.2f",outputValue2);
        final String outputStr3 = String.format("%.2f",outputValue3);
        final String outputStr4 = String.format("%.2f",outputValue4);
        final String outputStr5 = String.format("%.2f",outputValue5);
        final String outputStr6= String.format("%.2f",outputValue6);
        final String outputStr7 = String.format("%.2f",outputValue7);

        output_kilo.setText(outputStr);
        output_heca.setText(outputStr2);
        output_deca.setText(outputStr3);
        output_gram.setText(outputStr4);
        output_deci.setText(outputStr5);
        output_centi.setText(outputStr6);
        output_mili.setText(outputStr7);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0)
        {
            button.setOnClickListener(this::Convert_kilo);
        }
        if(position == 1)
        {
            button.setOnClickListener(this::Convert_hecto);
        }
        if(position == 2)
        {
            button.setOnClickListener(this::Convert_deca);
        }
        if(position == 3)
        {
            button.setOnClickListener(this::Convert_gram);
        }
        if(position == 4)
        {
            button.setOnClickListener(this::Convert_deci);
        }
        if(position == 5)
        {
            button.setOnClickListener(this::Convert_centi);
        }
        if(position == 6)
        {
            button.setOnClickListener(this::Convert_milli);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}