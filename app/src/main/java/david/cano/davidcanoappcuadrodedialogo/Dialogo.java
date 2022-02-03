package david.cano.davidcanoappcuadrodedialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo extends DialogFragment {
   @Override
   @NonNull
   public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
      AlertDialog.Builder alertaDialogo= new AlertDialog.Builder(getActivity());
      alertaDialogo.setTitle(R.string.mensaje);
      alertaDialogo.setMessage((R.string.mostrarMensaje));
      alertaDialogo.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(){
     public void onClick(DialogInterface dialog, int id){
         new MainActivity().mostrarMensaje(getActivity());

         }
      });
       alertaDialogo.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener(){
           public void onClick(DialogInterface dialog, int id){
              return;
           }
       });
return alertaDialogo.create();
   }
}
