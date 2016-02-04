package com.example.rajkiranreddym.loginapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


    public class Login extends AppCompatActivity {


        private static EditText username;
        private static EditText password;
        private static Button login_button;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            LoginButton();

        }
        public void LoginButton() {

            username = (EditText) findViewById(R.id.editText__user);
            password = (EditText) findViewById(R.id.editText_password);
            login_button = (Button) findViewById(R.id.button_login);

            login_button.setOnClickListener(new View.OnClickListener() {

                                                public void onClick(View v) {
                                                    if (username.getText().toString().equals("admin") &
                                                            password.getText().toString().equals("login"))
                                                    {
                                                        Toast.makeText(Login.this, "Username and password is correct",
                                                                Toast.LENGTH_SHORT).show();
                                                        Intent intent = new Intent("com.example.rajkiranreddym.loginapp.WeatherActivity");
                                                        startActivity(intent);
                                                    }
                                                    else
                                                    {
                                                        Toast.makeText(Login.this, "Username and password incorrect", Toast.LENGTH_SHORT).show();
                                                    }
                                                }
                                            }
            );
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_login, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            int id = item.getItemId();


            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }
