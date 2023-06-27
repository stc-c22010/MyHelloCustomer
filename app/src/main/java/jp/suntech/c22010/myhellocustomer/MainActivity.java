package jp.suntech.c22010.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonListener listener = new ButtonListener();

        Button btShow = findViewById(R.id.btShow);
        btShow.setOnClickListener(listener);

        Button btClrAddress = findViewById(R.id.btClrAddress);
        btClrAddress.setOnClickListener(listener);

        Button btClrName = findViewById(R.id.btClrName);
        btClrName.setOnClickListener(listener);
    }

    private class ButtonListener implements View.OnClickListener{
        @Override
        public void  onClick(View view){
            EditText in_address = findViewById(R.id.etAddress);
            EditText in_name = findViewById(R.id.etName);

            int id = view.getId();

            if(id == R.id.btShow) {
                String in_address_str = in_address.getText().toString();
                String in_name_str = in_name.getText().toString();
                String toast1 = getString(R.string.toast1);
                String toast2 = getString(R.string.toast2);
                String output = in_address_str + toast1 + in_name_str + toast2;
                Toast.makeText(MainActivity.this, output, Toast.LENGTH_LONG).show();
            }else if(id == R.id.btClrAddress) {
                in_address.setText("");
            }else if(id == R.id.btClrName){
                in_name.setText("");
            }
        }
    }

}