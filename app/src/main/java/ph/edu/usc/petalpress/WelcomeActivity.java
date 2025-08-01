package ph.edu.usc.petalpress;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button startWritingBtn = findViewById(R.id.startWritingButton);
        startWritingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomepage = new Intent(WelcomeActivity.this, Homepage.class);
                startActivity(goToHomepage);
                finish(); // Optional: removes WelcomeActivity from back stack
            }
        });
    }
}