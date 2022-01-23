package com.berthold.voltagedivider;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    //
    // The current fragment shown inside the container (e.g. find resistor, divider wtc......)
    //
    public MutableLiveData<String> currentGFragmentShown;
    public MutableLiveData<String> getCurrentGFragmentShown() {
        if (currentGFragmentShown == null) {
            currentGFragmentShown = new MutableLiveData<String>();
            currentGFragmentShown.setValue("FindResistor");
        }
        return currentGFragmentShown;
    }

    //
    // This string holds a text which is meant to be displayed inside
    // of the protocol fragment. E.g. the result of a calculation, an error....
    //
    public MutableLiveData<String> protokollOutput;
    public MutableLiveData<String> getProtokollOutput(){
        if (protokollOutput==null) {
            protokollOutput = new MutableLiveData<String>();
            protokollOutput.setValue("Protocol.....");
        }
        return protokollOutput;
    }
}
