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

    public static final String DIRNAME_WHOAMI = "/whoami/";
    public static final String LANGANAME_WHO = "who";
    public static final String LANGANAME_AM = "am";
    public static final String LANGANAME_I = "i";

    // $FF: renamed from: a android.widget.EditText
    public static EditText emailEditText;
    // $FF: renamed from: b android.widget.EditText
    public static EditText serialEditText;
    // $FF: renamed from: c java.lang.String
    public static String SALT;
    // $FF: renamed from: d java.lang.String
    private String dataPath;
    // $FF: renamed from: e java.lang.String
    private final String DIRNAME_TESSDATA;

    public MainActivity() {
        this.dataPath = "";
        this.DIRNAME_TESSDATA = "tessdata/";
    }

    // $FF: renamed from: a () void
    private void computeSalt() {
        // 0x7f060062 = type="drawable" name="owl"
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), 0x7f060062);
        TessBaseAPI tessBaseAPI;

        if (VERSION.SDK_INT > 19) {

            this.dataPath = this.getFilesDir() + DIRNAME_WHOAMI;
            tessBaseAPI = new TessBaseAPI();

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "d9hvLnRyYWkuZWRlYXRh", "who.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_WHO);
            tessBaseAPI.setImage(bitmap);
            SALT = tessBaseAPI.getUTF8Text();

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "YW5udHJhaW0kZGRhdGE=", "am.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_AM);
            tessBaseAPI.setImage(bitmap);
            SALT = SALT + tessBaseAPI.getUTF8Text();

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "aS05cmFpbmUlZGF5YQ==", "i.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_I);
            tessBaseAPI.setImage(bitmap);
            SALT = SALT + tessBaseAPI.getUTF8Text();

        } else {

            this.dataPath = this.getFilesDir() + DIRNAME_WHOAMI;
            tessBaseAPI = new TessBaseAPI();

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "d9hvLnRyYWkuZWRlYXRh", "who.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_WHO);
            tessBaseAPI.setImage(bitmap);
            SALT = tessBaseAPI.getUTF8Text().split("\n")[0];

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "YW5udHJhaW0kZGRhdGE=", "am.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_AM);
            tessBaseAPI.setImage(bitmap);
            SALT = SALT + tessBaseAPI.getUTF8Text().split("\n")[0];

            this.method_1299(new File(this.dataPath + this.DIRNAME_TESSDATA), "aS05cmFpbmUlZGF5YQ==", "i.traineddata");
            tessBaseAPI.init(this.dataPath, LANGANAME_I);
            tessBaseAPI.setImage(bitmap);
            SALT = SALT + tessBaseAPI.getUTF8Text().split("\n")[0];

        }

    }

    // $FF: renamed from: a (java.io.File, java.lang.String) void
    private void method_1299(File destDir, String resourceName, String outputFileName) {
        if (!destDir.exists() && destDir.mkdirs()) {
            this.method_1300(resourceName, outputFileName);
        }

        if (destDir.exists() && !(new File(this.dataPath + this.DIRNAME_TESSDATA + resourceName)).exists()) {
            this.method_1300(resourceName, outputFileName);
        }

    }

    // $FF: renamed from: a (java.lang.String) void
    private void method_1300(String resourceName, String outputFileName) {
        try {
            String var12 = this.dataPath + this.DIRNAME_TESSDATA + outputFileName;
            AssetManager assets = this.getAssets();
            InputStream inputStream = assets.open(this.DIRNAME_TESSDATA + resourceName);
            FileOutputStream outputStream = new FileOutputStream(var12);
            byte[] bytes = new byte[8192];

            while(true) {
                int var3 = inputStream.read(bytes);
                if (var3 == -1) {
                    outputStream.flush();
                    outputStream.close();
                    inputStream.close();
                    File var10 = new File(var12);
                    if (!var10.exists()) {
                        throw new FileNotFoundException();
                    }
                    break;
                }

                for(int var2 = 0; var2 < var3; ++var2) {
                    bytes[var2] = (byte)(bytes[var2] ^ 0x14);
                }

                outputStream.write(bytes, 0, var3);
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
                MainActivity.this.computeSalt();
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
