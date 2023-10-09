package com.example.ej1ud3_luis_rodriguezmata;

import android.view.View;
import android.widget.AdapterView;

public class SpinnerActivity extends MainActivity implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item is selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos).
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }


}
