package com.example.salal.loginassignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Other_Window extends AppCompatActivity {

    Button btnToast;
    EditText etToast;
    String username;
    String ToastMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_window);
        username = getIntent().getStringExtra("username");
        Toast.makeText(this, "Welcome " + username, Toast.LENGTH_LONG).show();
        btnToast = (Button) findViewById(R.id.btn_toast);
        etToast = (EditText) findViewById(R.id.et_toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMsg = etToast.getText().toString();
                Toast.makeText(getApplicationContext(), ToastMsg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
