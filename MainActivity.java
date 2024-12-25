
package com.example.combineearpods;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // TODO: Implement Bluetooth synchronization logic
        Toast.makeText(this, "App initialized", Toast.LENGTH_SHORT).show();
    }
}
