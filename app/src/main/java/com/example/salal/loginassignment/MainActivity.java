package com.example.salal.loginassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnlogin, btnclear;
    EditText etuser, etpass;
    TextView tvUser, tvPass;
    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclear = (Button) findViewById(R.id.btn_clear);
        btnlogin = (Button) findViewById(R.id.btn_login);
        etpass = (EditText) findViewById(R.id.et_password);
        etuser = (EditText) findViewById(R.id.et_username);
        tvUser = (TextView) findViewById(R.id.tv_user);
        tvPass = (TextView) findViewById(R.id.tv_pass);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = etuser.getText().toString();
                pass = etpass.getText().toString();
                if (user.equals("admin")) {
                    tvUser.setText("");
                    if (pass.equals("123")) {
                        tvPass.setText("");
                        Intent intent = new Intent(getApplicationContext(), Other_Window.class);
                        intent.putExtra("username", user);
                        startActivity(intent);
                    } else {
                        tvPass.setText("Wrong password");
                    }
                } else {
                    tvUser.setText("Wrong Username");
                }

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etpass.setText("");
                etuser.setText("");
                tvPass.setText("");
                tvUser.setText("");
            }
        });

    }
}
