package com.example.hugu.watchmarker.model;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by hugu on 27/01/15. lñjsfoh
 */
public class DataAcces {

    Connection connectionMySQL;
    Statement sentence = null;
    ResultSet result = null;

    public boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connectionMySQL = DriverManager.getConnection("jdbc:mysql:thin:@192.168.56.101:3306:fbmoll", "alumne", "alumne");
            return true;

        }catch (Exception e){
            Log.i("Connection error ", e.toString());
            return false;
        }
    }
}
