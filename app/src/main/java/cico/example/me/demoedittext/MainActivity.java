package cico.example.me.demoedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private  EditText edtFilter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init(){
        edtFilter = (EditText) findViewById(R.id.edtFilter);
        edtFilter.setFilters(new InputFilter[]{ new InputFilterMinMax("00.000", "20.000")});
        edtFilter.setMaxEms(6);
    }
}
