package algonquin.cst2335.soha0222.ui.ui;

import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;


import algonquin.cst2335.soha0222.databinding.ActivityMainBinding;
import algonquin.cst2335.soha0222.ui.data.MainViewModel;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        model = new ViewModelProvider(this).get(MainViewModel.class);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());




    }
}