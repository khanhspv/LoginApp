package com.pvk.khanhpham.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditiUserActivity extends AppCompatActivity {

    private Button btDone;
    private EditText edUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editi_user);

        edUser=(EditText)findViewById(R.id.edUser);
        btDone=(Button)findViewById(R.id.btDone);

        btDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
            case R.id.btDone:
                onDone();
                break;
            default:
                break;
                }
            }
        });

        Intent intent = getIntent();
        String username = intent.getStringExtra("USER_NAME");
        edUser.setText(username);
    }

//    @Override
//    public void onClick(View view){
//        switch (view.getId()){
//            case R.id.btDone:
//                onDone();
//                break;
//            default:
//                break;
//        }
//    }

    private void onDone(){
        Intent intent = new Intent();
        intent.putExtra("RESULT",edUser.getText().toString());
        setResult(Activity.RESULT_OK,intent);
        finish();
    }

}
