package david.cano.davidcanoappcuadrodedialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarDialogo(View v){
    Dialogo d=new Dialogo();
    d.show(getSupportFragmentManager(), "tagDialogo");
    }

    public void mostrarMensaje(Context contexto){
    Toast toast= Toast.makeText(contexto, R.string.mensaje,Toast.LENGTH_LONG);
    toast.show();
    }
}