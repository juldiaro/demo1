package co.edu.usbcali.demoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btinIr;
    private EditText edtDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (getIntent().getSerializableExtra("mensaje2")!=null){
            String mensjaeDevuelta =getIntent().getSerializableExtra("mensaje2").toString();
            Toast.makeText(this, mensjaeDevuelta,Toast.LENGTH_SHORT).show();
        }
        btinIr=findViewById(R.id.btnIr);
        edtDemo=findViewById(R.id.edt_Demo);

        btinIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActivity= new Intent(view.getContext(),Demo.class);
                intentActivity.putExtra("mensaje", "Hola Mundo" );
                startActivity(intentActivity);

                Toast.makeText(view.getContext(),edtDemo.getText(),Toast.LENGTH_SHORT).show();

               // String mensajet = edtDemo.getText().toString();
                //Toast.makeText(view.getContext(),"el Puto de " + mensajet+" es Gay",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
