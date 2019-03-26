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
    Button oui, non;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizzbinaire);
        Textview mytxt=(Textview ) findViewById(R.id.text_id);
        oui = (Button) findViewById(R.id.oui);
        non = (Button) findViewById(R.id.non);

        for(i=0;i<5;i++){

        int question=N();

        mytxt.settext(q(question));

        String r = reponse(question);
        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r==1){
                    new AlertDialog.Builder(context)
                            .setTitle("juste!")
                            .setMessage("juste!")
                            // Specifying a listener allows you to take an action before dismissing the dialog.
                            // The dialog is automatically dismissed when a dialog button is clicked.
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                } else {
                    new AlertDialog.Builder(context)
                            .setTitle("faux!")
                            .setMessage("faux!")
                            // Specifying a listener allows you to take an action before dismissing the dialog.
                            // The dialog is automatically dismissed when a dialog button is clicked.
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            }
        });

        non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r==0){
                    new AlertDialog.Builder(context)
                            .setTitle("juste!")
                            .setMessage("juste!")
                            // Specifying a listener allows you to take an action before dismissing the dialog.
                            // The dialog is automatically dismissed when a dialog button is clicked.
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                } else {
                    new AlertDialog.Builder(context)
                            .setTitle("faux!")
                            .setMessage("faux!")
                            // Specifying a listener allows you to take an action before dismissing the dialog.
                            // The dialog is automatically dismissed when a dialog button is clicked.
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            }
        });
    }

    public static String q(int i) {
        String[] s = {" Pour un triangle AB*AB=AC*AC+ CB*CB ? ", " Un triangle peut-il avoir un angle droit? ", "Le triangle a-t-il 3 cote?", "Le rectangle a-t-il 4 cotes?", "Peut-il avoir un triangle dans un cercle?", "Un cercle est-il compose de 10 points?", "Le nombre de cote d'un triangle est-il impair?", "Un rectangle ayant la meme longueur que largeur est-il un carre?", "Un cercle a-t-il un rayon?"};
        return s[i];
    }

    public static String reponse(int i) {
        int[] s = {1, 1, 1, 1, 1, 0, 1, 1, 1};
        return s[i];
    }

    public static int N(){

        H h = new H(0,9,1);
        int [] n = h.hasard();
        return n[0];
    }
}



public class H{

    private int min;
    private int max;
    private int nombre;

    public H(int min, int max, int nombre){
        this.setMin(min);
        this.setMax(max);
        this.setNombre(nombre);
    }

    public void setNombre(int nombre){
        this.nombre=nombre;
    }

    public void setMin(int min){
        this.min=min;
    }

    public void setMax(int max){
        this.max=max;
    }

    public int getNombre(){
        return this.nombre;
    }

    public int getMin(){
        return this.min;
    }

    public int getMax(){
        return this.max;
    }

    public int [] setTable(int taille){
        int[] t= new int[taille];
        return t;}

    public int [] hasard(){
        int[] t=setTable(this.getNombre());
        for(int i=0; i<this.getNombre(); i++){
            double n=Math.random() * (this.getMax())+this.getMin();
            int r = (int) n;
            t[i]=r;}
        return t;
    }

}