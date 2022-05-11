package demo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {
    private TextView textViewReceiveMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        textViewReceiveMsg = findViewById(R.id.textViewRecievedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceiveMsg.setText(msg);

    }
}