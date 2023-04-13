package com.example.diagnosticssample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ImageButton button;
    private boolean isResume;
    ListView lvProgram;
    String[] programName={"Available RAM Memory","GPS","Disk Space","Network","Network Quality",
            "Camera","Sensor","Battery"};
    String[] programDescriptio={"Memory OK","Disabled","Used Space","Connected: WiFi",
            "Your connection is poor","Working","Disabled","Charging"};
    int[] programImages={R.drawable.tick,R.drawable.warning,R.drawable.tick,R.drawable.tick,
            R.drawable.alert,R.drawable.tick,R.drawable.warning,R.drawable.tick};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProgram=findViewById(R.id.lvProgram);
        button=findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isResume){
                    isResume=true;
                    button.setImageDrawable(getDrawable(R.drawable.alert));
                }
                else{
                    isResume=false;
                    button.setImageDrawable(getDrawable(R.drawable.warning));
                }
            }
        });
        ProgramAdapter programAdapter=new ProgramAdapter(this,programName,programImages,programDescriptio);
        lvProgram.setAdapter(programAdapter);

    }
}