package co.edu.usbcali.demoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by usuario on 18/11/17.
 */

public class Demo extends AppCompatActivity {

    private TextView txtDemo;
    private Button btnVolver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);

        String mensaje = getIntent().getSerializableExtra("mensaje").toString();
        txtDemo=findViewById(R.id.text1);
        txtDemo.setText(mensaje);

        btnVolver=findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMainActivity =new Intent(view.getContext(),MainActivity.class);
                intentMainActivity.putExtra("mensaje2", "Recibido");
                startActivity(intentMainActivity);
            }
        });

    }
}
