package co.edu.eu.actividad.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ManageDB extends SQLiteOpenHelper {
    private static final String DATA_BASE_USERS = "dbUsers";
    private static final int VERSION = 1 ;
    private  static final String TABLE_USERS="users";



    public ManageDB( Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
