package com.konstantin.sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DietActivity extends AppCompatActivity {
/*
Составление схем питания, отслеживвание калорийности  и контроль веса
 */
    //TODO сделать контроль чит-милов для тех кто на сушке(можно это как-то отмечать в календаре)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_layout);
    }
}
