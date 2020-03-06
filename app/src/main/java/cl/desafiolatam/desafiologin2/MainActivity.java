package cl.desafiolatam.desafiologin2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import static cl.desafiolatam.desafiologin2.R.id.accessButton;
import static cl.desafiolatam.desafiologin2.R.id.registerButton;
import static cl.desafiolatam.desafiologin2.R.id.time;

public class MainActivity extends AppCompatActivity {

    //para implementar tanto imagen o boton es necesario crearlo como atributo
    private ImageView imageView;
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // señalo los atributos de imagen y boton, con los que ya estan creados en activity_main
        imageView=findViewById(R.id.imagen1);
        button=findViewById(accessButton);
        button2=findViewById(registerButton);
        //mensaje para verificar que el proceso llega a dicho punto
        Log.d("MainActivity", "por aqui pasó");
        //incorporo la imagen mediante picasso, utilizando el link de la imagen y reemplazandola con la imagen ya existente en activity_main
        Picasso.get().load("http://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(imageView);

        //Se va a asignar un nuevo evento de Click
        button.setOnClickListener(new View.OnClickListener() {
            // creo nuevo método para darle accion al boton creado mediante onClick
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario ingresado", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ingrese los datos", Toast.LENGTH_SHORT).show();

                //Se define un intent, la intencion de cambiar de actividad
                Intent switchRegistro = new Intent(MainActivity.this, RegistroNuevoUsuario.class);
                // Ahora realizamos StartActivity que es un metodo que permite lanzar el intent que se ha definido
                startActivity(switchRegistro);
            }

        });

        }



}
