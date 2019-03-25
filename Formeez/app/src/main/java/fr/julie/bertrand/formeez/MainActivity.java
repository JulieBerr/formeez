package fr.julie.bertrand.formeez;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    int forme=1;

    ImageButton carre;
    ImageButton cercle;
    ImageButton triangle;

    ImageButton blanc1;
    ImageButton blanc2;
    ImageButton blanc3;
    ImageButton blanc4;
    ImageButton blanc5;
    ImageButton blanc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carre);

        addListenerOnButton();
    }


    public void addListenerOnButton() {

        carre = (ImageButton) findViewById(R.id.carre);
        cercle = (ImageButton) findViewById(R.id.cercle);
        triangle = (ImageButton) findViewById(R.id.triangle);

        blanc1=(ImageButton) findViewById(R.id.blanc1);
        blanc2=(ImageButton) findViewById(R.id.blanc2);
        blanc3=(ImageButton) findViewById(R.id.blanc3);
        blanc4=(ImageButton) findViewById(R.id.blanc4);
        blanc5=(ImageButton) findViewById(R.id.blanc5);
        blanc6=(ImageButton) findViewById(R.id.blanc6);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.carre:
                        forme=4; //Si forme égale à 4 c'est un carré.
                        break;

                    case R.id.cercle:
                        forme=0;
                        break;

                    case R.id.triangle:
                        forme=3;
                        break;

                    case R.id.blanc1:
                        if (forme==4){
                            blanc1.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc1.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc1.setImageResource(R.drawable.triangle);
                        }
                        break;

                    case R.id.blanc2:
                        if (forme==4){
                            blanc2.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc2.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc2.setImageResource(R.drawable.triangle);
                        }
                        break;

                    case R.id.blanc3:
                        if (forme==4){
                            blanc3.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc3.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc3.setImageResource(R.drawable.triangle);
                        }
                        break;

                    case R.id.blanc4:
                        if (forme==4){
                            blanc4.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc4.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc4.setImageResource(R.drawable.triangle);
                        }
                        break;

                    case R.id.blanc5:
                        if (forme==4){
                            blanc5.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc5.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc5.setImageResource(R.drawable.triangle);
                        }
                        break;

                    case R.id.blanc6:
                        if (forme==4){
                            blanc6.setImageResource(R.drawable.carre);
                        }
                        if (forme==0){
                            blanc6.setImageResource(R.drawable.cercle);
                        }
                        if (forme==3){
                            blanc6.setImageResource(R.drawable.triangle);
                        }
                        break;
                }

            }

        };

    }

}
