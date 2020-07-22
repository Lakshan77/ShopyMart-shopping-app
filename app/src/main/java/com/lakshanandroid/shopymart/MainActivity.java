package com.lakshanandroid.shopymart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

//import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lakshanandroid.shopymart.Model.Users;
import com.lakshanandroid.shopymart.Prevalent.Prevalent;

import java.net.PasswordAuthentication;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    private Button JoinNowButton, LoginButton;
   // private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JoinNowButton = (Button) findViewById(R.id.main_join_btn);
        LoginButton = (Button) findViewById(R.id.main_login_btn);
       // loadingBar = new ProgressDialog(this);



        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        JoinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


    }



}
