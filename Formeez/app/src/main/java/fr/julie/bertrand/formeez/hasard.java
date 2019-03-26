package fr.julie.bertrand.formeez;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;

public class quizzbinaire extends ActionBarActivity {
        Button oui,non;
        int reponse=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.quizzbinaire);

            oui=(Button)findViewById(R.id.oui);
            oui.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reponse=1;
                }
            });

            non=(Button)findViewById(R.id.oui);
            non.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reponse=2;
                }
            });
        }
    }
}
