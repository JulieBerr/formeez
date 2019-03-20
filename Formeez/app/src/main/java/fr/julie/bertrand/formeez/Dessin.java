package fr.julie.bertrand.formeez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Dessin extends View {

    private Paint paint = new Paint(); {
        paint.setColor(Color.BLACK);

    }

    public Dessin(Context context) {
        super(context);
    }

    public Dessin(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Dessin(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Dessin(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);

        c.drawLine(0, 0, 150, 150, paint);
    }
}
