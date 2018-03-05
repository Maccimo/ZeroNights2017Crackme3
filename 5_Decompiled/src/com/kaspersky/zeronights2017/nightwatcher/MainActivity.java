package com.kaspersky.zeronights2017.nightwatcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    // $FF: renamed from: a android.widget.EditText
    public static EditText emailEditText;
    // $FF: renamed from: b android.widget.EditText
    public static EditText serialEditText;
    // $FF: renamed from: c java.lang.String
    public static final String SALT = "7F6B45B6E8AC25D6A99E7DB916E40FD0";

    protected void onCreate(Bundle var1) {
        super.onCreate(var1);
        this.requestWindowFeature(1);
        this.getWindow().setFlags(1024, 1024);
        this.setContentView(0x7f09001b);
        Button var2 = (Button)this.findViewById(0x7f070021);

        var2.setOnClickListener(new OnClickListener() {
            public void onClick(View var1) {
                MainActivity.emailEditText = (EditText)MainActivity.this.findViewById(0x7f07002e);
                MainActivity.serialEditText = (EditText)MainActivity.this.findViewById(0x7f070060);
                if (!MainActivity.emailEditText.getText().toString().matches("") && !MainActivity.serialEditText.getText().toString().toUpperCase().matches("")) {
                    if (SerialValidator.validateSerial()) {
                        Toast.makeText(MainActivity.this, "Congratulations! You did it!", 1).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Login Failed.", 1).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed.", 1).show();
                }

            }
        });
    }
}
