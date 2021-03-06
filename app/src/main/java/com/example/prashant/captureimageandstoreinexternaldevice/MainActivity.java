package com.example.prashant.captureimageandstoreinexternaldevice;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    static int TAKE_PIC =1;
    Uri outPutfileUri;

    // THIS JUST DEMO PROJECT WORK
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CameraClick(View v) {

        Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file = new File(Environment.getExternalStorageDirectory(),
                "MyPhoto.jpg");
        outPutfileUri = Uri.fromFile(file);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, outPutfileUri);
        startActivityForResult(intent, TAKE_PIC);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == TAKE_PIC && resultCode == RESULT_OK) {
            Toast.makeText(this, outPutfileUri.toString(), Toast.LENGTH_LONG).show();

        }
    }
}
