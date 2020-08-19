package com.pvk.khanhpham.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edUser;
    private EditText edPassword;
    private Button btLogin;

    private void anhxa() {
        edUser = (EditText) findViewById(R.id.edUser);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btLogin = (Button) findViewById(R.id.btLogin);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        anhxa();

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        switch (v.getId()){
            case R.id.btLogin:
                onLogin();
                break;
            default:
                break;
        }
            }
        });
    }

//    @Override
//    public void onClick(View view){
//        switch (view.getId()){
//            case R.id.btLogin:
//                onLogin();
//                break;
//            default:
//                break;
//        }
//    }




    private void onLogin(){
        if (edUser.getText().toString().isEmpty() || edPassword.getText().toString().isEmpty()){
            Toast.makeText(this,"Ban Chua Nhap User hoac Mat Khau",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("USER_NAME",edUser.getText().toString());
            startActivity(intent);
        }
    }



}



