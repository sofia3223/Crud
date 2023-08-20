package co.edu.eu.actividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.eu.actividad.clases.User;
import co.edu.eu.actividad.model.UserDAO;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Validate";
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
        begin();
        userList();
    }

    private void begin() {
        etDocumento = findViewById(R.id.etDocumento);
        etApellidos = findViewById(R.id.etApellidos);
        etNombres = findViewById(R.id.etNombres);
        etUsuario = findViewById(R.id.etUsuario);
        etContra = findViewById(R.id.etContra);
        listUsers = findViewById(R.id.lvLista);
    }
    private boolean checkFields() {
        documento = Integer.parseInt(etDocumento.getText().toString());
        usuario = etUsuario.getText().toString();
        nombres = etNombres.getText().toString();
        apellidos = etApellidos.getText().toString();
        contra = etContra.getText().toString();
        Log.i(TAG, "checkFields: "+documento);
        return true;
    }

    public void registerUser(View view){
        if (checkFields()){
            UserDAO userDAO = new UserDAO(this, view);
            User user = new User(documento,usuario,nombres,apellidos,contra,1);
            userDAO.insertUser(user);
            userList();
        }
    }
    public void callUserList(View view){ userList(); }

    private void userList(){
        UserDAO userDAO = new UserDAO(this, listUsers);
        ArrayList<User> userArrayList = userDAO.getUserList();
        ArrayAdapter<User> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,userArrayList);
        listUsers.setAdapter(adapter);
    }

    public void limpiar(View v){
        etDocumento.setText("");
        etUsuario.setText("");
        etNombres.setText("");
        etApellidos.setText("");
        etContra.setText("");
    }

}