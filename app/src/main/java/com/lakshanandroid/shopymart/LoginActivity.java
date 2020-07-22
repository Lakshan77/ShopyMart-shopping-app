package com.lakshanandroid.shopymart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lakshanandroid.shopymart.Model.Users;
import com.lakshanandroid.shopymart.Prevalent.Prevalent;

import io.paperdb.Paper;

public class LoginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;
    private String ParentDbName = "Users";
    private TextView AdminLink, NotAdminLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);
        InputPhoneNumber = (EditText) findViewById(R.id.login_Phone_number);
        InputPassword = (EditText) findViewById(R.id.login_password);
        loadingBar = new ProgressDialog(this);

        AdminLink = (TextView)findViewById(R.id.admin_panel);
        NotAdminLink = (TextView)findViewById(R.id.Not_admin_panel);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                LoginUser();
            }
        });

        AdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                LoginButton.setText("Login Admin");
                AdminLink.setVisibility(View.INVISIBLE);
                NotAdminLink.setVisibility(View.VISIBLE);
                ParentDbName = "Admins";
            }
        });

        NotAdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                LoginButton.setText("Login");
                AdminLink.setVisibility(View.VISIBLE);
                NotAdminLink.setVisibility(View.INVISIBLE);
                ParentDbName = "Users";
            }
        });
    }



    private void LoginUser(){

        String phone = InputPhoneNumber.getText().toString();
        String password = InputPassword.getText().toString();

         if (TextUtils.isEmpty(phone)){
            Toast.makeText(this, "Please enter your phone number..", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter your password..", Toast.LENGTH_SHORT).show();
        }
        else {

            loadingBar.setTitle("Login to Account");
            loadingBar.setMessage("please wait, while we a creating a credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            AllowAccessToAccount(phone, password);
         }

    }

    private void AllowAccessToAccount(final String phone, final String password) {

        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {

                if (dataSnapshot.child(ParentDbName).child(phone).exists()){

                    Users usersData = dataSnapshot.child(ParentDbName).child(phone).getValue(Users.class);

                    if (usersData.getPhone().equals(phone)){

                        if (usersData.getPassword().equals(password)){

                            if (ParentDbName.equals("Admins")){

                                Toast.makeText(LoginActivity.this, "Welcome Admin ", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();

                                Intent intent = new Intent(LoginActivity.this, AdminCategoryActivity.class);
                                startActivity(intent);
                            }

                            else if (ParentDbName.equals("Users")){

                                Toast.makeText(LoginActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();

                                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                Prevalent.currentOnlineUsers = usersData;
                                startActivity(intent);
                            }
                        }
                    }
                }

                else {

                    Toast.makeText(LoginActivity.this, "Account with this"+ phone + "number do not exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull final DatabaseError databaseError) {

            }
        });


    }

}





