package com.example.pratul.insurancepolicy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class InputDetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_details);
        Spinner mySpinner = (Spinner) findViewById(R.id.Cars);
        Spinner fuel = (Spinner) findViewById(R.id.fuel);
        Spinner cc = (Spinner) findViewById(R.id.CC);
        Spinner zone = (Spinner) findViewById(R.id.zoneSP);
        Spinner ncb = (Spinner) findViewById(R.id.ncbSP);
        Spinner plan = (Spinner) findViewById(R.id.carPlanSP);
        Spinner choice = (Spinner) findViewById(R.id.choiceSP);
        Button result = (Button) findViewById(R.id.generateResult);


        //CAR MANUFACTURERS
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Manufacturers,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(this);


        //MODEL CARS ADAPTER  DAALNA BAAKI






        //FUEL ADAPTER
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Fuel,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fuel.setAdapter(adapter1);
        fuel.setOnItemSelectedListener(this);

        //ENGINE CC ADAPTER
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.EngineCC,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cc.setAdapter(adapter2);
        cc.setOnItemSelectedListener(this);

        //ZONES ADAPTER
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.Zones,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        zone.setAdapter(adapter3);
        zone.setOnItemSelectedListener(this);

        //NCB ADAPTER
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.ncbValues,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ncb.setAdapter(adapter4);
        ncb.setOnItemSelectedListener(this);

        //PLAN ADAPTER
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.PlanValues,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plan.setAdapter(adapter5);
        plan.setOnItemSelectedListener(this);

        //PLAN ADAPTER
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.ChoiceValues,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choice.setAdapter(adapter6);
        choice.setOnItemSelectedListener(this);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InputDetails.this,OutputDetails.class);
                startActivity(intent);

            }
        });
        }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
