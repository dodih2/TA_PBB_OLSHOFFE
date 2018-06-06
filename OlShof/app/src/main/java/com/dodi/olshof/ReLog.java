package com.dodi.olshof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ReLog extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_log);

        btn1 = (Button) findViewById(R.id.btnlogin);
        btn2 = (Button) findViewById(R.id.btnregister);

    }

    public  void btnloginn(View view){
        Intent intent = new Intent(ReLog.this, Login.class);
        startActivity(intent);
    }
    public  void btnregisterr(View view){
        Intent intent = new Intent(ReLog.this, Register.class);
        startActivity(intent);
    }

}
