package com.example.hugu.watchmarker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.hugu.watchmarker.R;
import com.example.hugu.watchmarker.model.ServerListener;

public class Marcador extends ActionBarActivity {

    TextView actions;
    ServerListener sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marcador);

        actions = (TextView) findViewById(R.id.actions);

        sv = new ServerListener();
        sv.setActivity(this);
        Log.i("Saber hasta donde llega","");

        sv.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sv.interrupt();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.marcador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setNewAction(String s){
        actions.setText(s);
    }
}
