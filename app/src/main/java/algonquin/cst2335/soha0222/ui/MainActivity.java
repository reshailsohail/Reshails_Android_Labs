package algonquin.cst2335.soha0222.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import algonquin.cst2335.soha0222.data.MainActivityModel;
import algonquin.cst2335.soha0222.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding variableBinding;
    private MainActivityModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        TextView mytext = variableBinding.textview;
        Button btn = variableBinding.mybutton;
        EditText myedit = variableBinding.myedittext;
        model = new ViewModelProvider(this).get(MainActivityModel.class);

        model.isSelected.observe(this, selected -> {
            variableBinding.checkbox.setChecked(selected);
            variableBinding.switchButton.setChecked(selected);
            variableBinding.radioButton.setChecked(selected);
            variableBinding.checkbox.setOnCheckedChangeListener((checkbox, isChecked) -> {
                model.isSelected.postValue(variableBinding.checkbox.isChecked());
            });
            variableBinding.switchButton.setOnCheckedChangeListener((switchButton, isChecked) -> {
                model.isSelected.postValue(variableBinding.switchButton.isChecked());
            });
            variableBinding.radioButton.setOnCheckedChangeListener((radioButton, isChecked) -> {
                model.isSelected.postValue(variableBinding.radioButton.isChecked());
            });

            String message = "The value is now: " + selected;
            Toast.makeText(getApplicationContext(), "ImageView clicked", Toast.LENGTH_SHORT).show();
        });

        variableBinding.myimagebutton.setOnClickListener(view -> {
            int width = view.getWidth();
            int height = view.getHeight();
            String message = "The width = " + width + " and height = " + height;
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editString = myedit.getText().toString();
                    mytext.setText("Your edit text has: " + editString);
                }

        });
    });
}}
