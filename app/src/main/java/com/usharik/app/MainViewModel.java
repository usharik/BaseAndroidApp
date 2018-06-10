package com.usharik.app;

import android.databinding.Bindable;

import com.usharik.app.framework.ViewModelObservable;
import com.usharik.app.BR;

import javax.inject.Inject;

/**
 * Created by macbook on 07/03/2018.
 */

public class MainViewModel extends ViewModelObservable {
    private final AppState appState;
    private String text;

    @Inject
    public MainViewModel(final AppState appState) {
        this.appState = appState;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
}
