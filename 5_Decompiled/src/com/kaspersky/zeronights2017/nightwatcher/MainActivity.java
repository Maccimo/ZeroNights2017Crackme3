package com.kaspersky.zeronights2017.nightwatcher;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.googlecode.tesseract.android.TessBaseAPI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity {

    public static final String field_1353 = "dGUzc9RhdGEv";
    public static final String field_1354 = "/whoami/";
    public static final String field_1355 = "who";
    public static final String field_1356 = "am";
    public static final String field_1357 = "i";
    public static final String field_1358 = "d9hvLnRyYWkuZWRlYXRh";
    public static final String field_1359 = "YW5udHJhaW0kZGRhdGE=";
    public static final String field_1360 = "aS05cmFpbmUlZGF5YQ==";

    // $FF: renamed from: a android.widget.EditText
    public static EditText emailEditText;
    // $FF: renamed from: b android.widget.EditText
    public static EditText serialEditText;
    // $FF: renamed from: c java.lang.String
    public static String field_1179;
    // $FF: renamed from: d java.lang.String
    private String field_1180;
    // $FF: renamed from: e java.lang.String
    private final String field_1181;

    public MainActivity() {
        this.field_1180 = "";
        this.field_1181 = class_87.decode(field_1353);
    }

    // $FF: renamed from: a () void
    private void method_1297() {
        // 0x7f060062 = type="drawable" name="owl"
        Bitmap var1 = BitmapFactory.decodeResource(this.getResources(), 0x7f060062);
        TessBaseAPI var2;
        if (VERSION.SDK_INT > 19) {
            this.field_1180 = this.getFilesDir() + field_1354;
            var2 = new TessBaseAPI();
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1358);
            var2.method_997(this.field_1180, field_1355);
            var2.method_996(var1);
            field_1179 = var2.method_995();
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1359);
            var2.method_997(this.field_1180, field_1356);
            var2.method_996(var1);
            field_1179 = field_1179 + var2.method_995();
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1360);
            var2.method_997(this.field_1180, field_1357);
            var2.method_996(var1);
            field_1179 = field_1179 + var2.method_995();
        } else {
            this.field_1180 = this.getFilesDir() + field_1354;
            var2 = new TessBaseAPI();
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1358);
            var2.method_997(this.field_1180, field_1355);
            var2.method_996(var1);
            field_1179 = var2.method_995().split("\n")[0];
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1359);
            var2.method_997(this.field_1180, field_1356);
            var2.method_996(var1);
            field_1179 = field_1179 + var2.method_995().split("\n")[0];
            this.method_1299(new File(this.field_1180 + this.field_1181), field_1360);
            var2.method_997(this.field_1180, field_1357);
            var2.method_996(var1);
            field_1179 = field_1179 + var2.method_995().split("\n")[0];
        }

    }

    // $FF: renamed from: a (java.io.File, java.lang.String) void
    private void method_1299(File var1, String var2) {
        if (!var1.exists() && var1.mkdirs()) {
            this.method_1300(var2);
        }

        if (var1.exists() && !(new File(this.field_1180 + this.field_1181 + var2)).exists()) {
            this.method_1300(var2);
        }

    }

    // $FF: renamed from: a (java.lang.String) void
    private void method_1300(String var1) {
        try {
            StringBuilder var5 = new StringBuilder();
            String var12 = var5.append(this.field_1180).append(this.field_1181).append(class_87.decode(var1)).toString();
            AssetManager var6 = this.getAssets();
            StringBuilder var7 = new StringBuilder();
            InputStream var9 = var6.open(var7.append(this.field_1181).append(var1).toString());
            FileOutputStream var14 = new FileOutputStream(var12);
            byte[] var13 = new byte[class_44.field_391];

            while(true) {
                int var3 = var9.read(var13);
                if (var3 == class_44.field_369) {
                    var14.flush();
                    var14.close();
                    var9.close();
                    File var10 = new File(var12);
                    if (!var10.exists()) {
                        FileNotFoundException var11 = new FileNotFoundException();
                        throw var11;
                    }
                    break;
                }

                for(int var2 = class_44.field_368; var2 < var3; ++var2) {
                    var13[var2] = (byte)(var13[var2] ^ class_44.field_379);
                }

                var14.write(var13, class_44.field_368, var3);
            }
        } catch (IOException var8) {
            var8.printStackTrace();
        }

    }

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
                MainActivity.this.method_1297();
                if (!MainActivity.emailEditText.getText().toString().matches("") && !MainActivity.serialEditText.getText().toString().toUpperCase().matches("")) {
                    if (class_46.method_502()) {
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
