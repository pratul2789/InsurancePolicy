package com.example.pratul.insurancepolicy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class InputDetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int curAge,carDisc;
    int tpRateVal;
    double preVal,odVal;
    String text,zoneCar,carModel,carSegment;
    Spinner mySpinner,fuel,cc,zone,ncb,plan,choice,model;
    EditText seatVal,yearOfManufacture,setIdv,disc;
    TextView paPass,odPremium,tpRate,segment,premium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_details);
        mySpinner = (Spinner) findViewById(R.id.Cars);
        fuel = (Spinner) findViewById(R.id.fuel);
        cc = (Spinner) findViewById(R.id.CC);
        zone = (Spinner) findViewById(R.id.zoneSP);
        ncb = (Spinner) findViewById(R.id.ncbSP);
        plan = (Spinner) findViewById(R.id.carPlanSP);
        choice = (Spinner) findViewById(R.id.choiceSP);
        Button result = (Button) findViewById(R.id.generateResult);
        paPass = (TextView) findViewById(R.id.paPassVal);
        seatVal = (EditText) findViewById(R.id.seatcap);
        yearOfManufacture = (EditText) findViewById(R.id.caryom);
        odPremium = (TextView) findViewById(R.id.odPreVal);
        setIdv = (EditText) findViewById(R.id.inpIDV);
        tpRate = (TextView) findViewById(R.id.tpRateVal);
        model = (Spinner) findViewById(R.id.Modelcars);
        segment = (TextView) findViewById(R.id.carSegmentVal);
        disc = (EditText) findViewById(R.id.Disc);
        premium = (TextView) findViewById(R.id.PremVal);


//        int paVal =Integer.parseInt(seatVal.getText().toString());
//        paVal = paVal*50;
        //paPass.setText(paVal);

        final int curYear = Calendar.getInstance().get(Calendar.YEAR);


        //CAR MANUFACTURERS
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Manufacturers,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).toString().equals("Mahindra")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Mahindra,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                            if(carModel.equals("Verito")){
                                carDisc = 20;
                                carSegment="Mid-Size";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Alfa Passenger")){
                                carDisc = 40;
                                carSegment="Mini";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Armada")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Bolero")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("CDR")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Classic")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Commando")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Double Cab")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("E2O")){
                                carDisc = 40;
                                carSegment="Mini";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Genio")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Gio")){
                                carDisc = 40;
                                carSegment="Mid-Size";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Hard")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Imperio")){
                                carDisc = 40;
                                carSegment="Compact";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Jeep")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Kuv")){
                                carDisc = 40;
                                carSegment="Compact";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Marshal")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Maxx")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Maxximo")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);

                            }else if(carModel.equals("MM")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Nuvosport")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("409")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Pick")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Quanto")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Reva")){
                                carDisc = 40;
                                carSegment="Mini";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Savari")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Single")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Top")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Supro")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Trax")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Utility")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Voyager")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Xylo")){
                                carDisc = 40;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Rexton")){
                                carDisc = 50;
                                carSegment="High-End";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Scorpio")){
                                carDisc = 50;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.equals("Thar")){
                                carDisc =50;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Tuv")){
                                carDisc = 50;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }else if(carModel.contains("Xuv")){
                                carDisc = 50;
                                carSegment="MPV-SUV";
                                preVal = odVal -((carDisc/100)*odVal);
                            }
                            segment.setText(carSegment);
                            disc.setText(""+carDisc);
                            premium.setText(""+preVal);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Chevrolet")){
                            ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Chevrolet,android.R.layout.simple_spinner_item);
                            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            model.setAdapter(adapter1);
                            model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                    carModel = adapterView.getItemAtPosition(i).toString();
                                }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Datsun")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Datsun,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Fiat")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Fiat,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Ford")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Ford,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Honda")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Honda,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Hyundai")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Hyundai,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("MahindraRenault")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.MahindraRenault,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Maruti")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Maruti,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Nissan")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Nissan,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Renault")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Renault,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Skoda")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Skoda,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Tata")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Tata,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Toyota")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Toyota,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(adapterView.getItemAtPosition(i).toString().equals("Volkswagen")){
                    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(InputDetails.this,R.array.Volkswagen,android.R.layout.simple_spinner_item);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    model.setAdapter(adapter1);
                    model.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            carModel = adapterView.getItemAtPosition(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


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
                //intent.putExtra("")

            }
        });

        seatVal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!seatVal.getText().toString().equals("")) {
                    int paVal = Integer.parseInt(seatVal.getText().toString());
                    paVal = paVal * 50;
                    paPass.setText("" + paVal);
                }
            }
        });

        yearOfManufacture.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!yearOfManufacture.getText().toString().equals("")){
                    int carAge = Integer.parseInt(yearOfManufacture.getText().toString());
                    curAge = curYear - carAge;
                }

                //odPremium.setText(""+curAge);

            }
        });

        setIdv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!setIdv.getText().toString().equals("")){
                    int idv = Integer.parseInt(setIdv.getText().toString());
                    double irdaRateVal = getIrdaRate("More than 1500cc","Zone-B");
                    odVal = idv * irdaRateVal/100;
                    odPremium.setText(""+odVal);
                }
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Spinner spinner = (Spinner) adapterView;
        if(spinner.getId() == R.id.CC){
             text = adapterView.getItemAtPosition(i).toString();
            if(text.contains("Less")) {
                tpRateVal = 2055;
                tpRate.setText("" + tpRateVal);
            } else if(text.contains("More")){
                tpRateVal = 7890;
                tpRate.setText("" + tpRateVal);
            }else{
                tpRateVal = 2863;
                tpRate.setText("" + tpRateVal);
            }
        } else if (spinner.getId() == R.id.zoneSP){
            zoneCar = adapterView.getItemAtPosition(i).toString();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public double getIrdaRate(String cc,String zone){
        if(curAge < 5 && zone.contains("A") && cc.contains("Less")){
            double irdaRate = 3.127;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("A") && cc.contains("Less")){
            double irdaRate = 3.283;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("A") && cc.contains("Less")){
            double irdaRate = 3.362;
            return irdaRate;
        }else if(curAge < 5 && zone.contains("A") && cc.contains("More")){
            double irdaRate = 3.440;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("A") && cc.contains("More")){
            double irdaRate = 3.612;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("A") && cc.contains("More")){
            double irdaRate = 3.698;
            return irdaRate;
        }else if(curAge < 5 && zone.contains("A") && cc.contains("1000-1500")){
            double irdaRate = 3.283;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("A") && cc.contains("1000-1500")){
            double irdaRate = 3.447;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("A") && cc.contains("1000-1500")){
            double irdaRate = 3.529;
            return irdaRate;
        }else if(curAge < 5 && zone.contains("B") && cc.contains("Less")){
            double irdaRate = 3.039;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("B") && cc.contains("Less")){
            double irdaRate = 3.191;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("B") && cc.contains("Less")){
            double irdaRate = 3.267;
            return irdaRate;
        }else if(curAge < 5 && zone.contains("B") && cc.contains("More")){
            double irdaRate = 3.343;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("B") && cc.contains("More")){
            double irdaRate = 3.510;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("B") && cc.contains("More")){
            double irdaRate = 3.594;
            return irdaRate;
        }else if(curAge < 5 && zone.contains("B") && cc.contains("1000-1500")){
            double irdaRate = 3.191;
            return irdaRate;
        }else if(curAge > 10 && zone.contains("B") && cc.contains("1000-1500")){
            double irdaRate = 3.351;
            return irdaRate;
        }else if(curAge > 5 && curAge <10 && zone.contains("B") && cc.contains("1000-1500")){
            double irdaRate = 3.430;
            return irdaRate;
        }
        return  0;
    }
}
