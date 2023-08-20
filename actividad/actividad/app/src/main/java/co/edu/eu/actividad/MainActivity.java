package co.edu.eu.actividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG= "Validate";
    private EditText etDocumento;
    private EditText etUsuario;
    private EditText etNombres;
    private EditText etApellidos;
    private EditText etContra;
    private ListView listUsers;
    private int documento;
    String usuario;
    String nombres;
    String apellidos;
    String contra;
    SQLiteDatabase baseDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
