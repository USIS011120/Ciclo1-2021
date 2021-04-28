package com.example.calculador;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;



public class DB extends SQLiteOpenHelper {
    Context miContext;
    static String nombreDB = "db_peliculas";
    static String tblPeliculas = "CREATE TABLE tblpeliculas(idAmigo integer primary key autoincrement, nombre text, sinopsis text, duracion text, precio text, urlPhoto text, urlvideo)";

    public DB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, nombreDB, factory, version); //CREATE DATABASE db_peliculas; -> MySQL, SQL Server, Oracle, PostGreeSQL, other...
        miContext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tblPeliculas);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //NO, porque es para migrar o actualizar a una nueva version...
    }
    public Cursor administracion_peliculas(String accion, String[] datos){
        try {
            Cursor datosCursor = null;
            SQLiteDatabase sqLiteDatabaseW = getWritableDatabase();
            SQLiteDatabase sqLiteDatabaseR = getReadableDatabase();
            switch (accion) {
                case "consultar":
                    datosCursor = sqLiteDatabaseR.rawQuery("select * from tblpeliculas order by nombre", null);
                    break;
                case "nuevo":
                    sqLiteDatabaseW.execSQL("INSERT INTO tblpeliculas(nombre,sinopsis,duracion,precio,urlPhoto,urlvideo) VALUES ('" + datos[1] + "','" + datos[2] + "','" + datos[3] + "','" + datos[4] + "','" + datos[5] + datos[6] + "')");
                    break;
                case "modificar":
                    sqLiteDatabaseW.execSQL("UPDATE tblpeliculas SET nombre='" + datos[1] + "',sinopsis='" + datos[2] + "',duracion='" + datos[3] + "',precio='" + datos[4] + "',urlPhoto='" + datos[5] + "', urlvideo='" + datos[6] + "' WHERE idPelicula='" + datos[0] + "'");
                    break;
                case "eliminar":
                    sqLiteDatabaseW.execSQL("DELETE FROM tblpeliculas WHERE idpelicula='" + datos[0] + "'");
                    break;
            }
            return datosCursor;
        }catch (Exception e){
            Toast.makeText(miContext, "Error en la administracion de la BD "+ e.getMessage(), Toast.LENGTH_LONG).show();
            return null;
        }
    }
}
