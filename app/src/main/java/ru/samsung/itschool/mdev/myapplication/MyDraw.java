package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
         paint.setColor(Color.RED);
        //paint.setColor(Color.parseColor("#00ff00"));
        paint.setStrokeWidth(20);
        canvas.drawLine(0,0,500,500,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(700,700,100,paint);

        //BitmapFactory bitmapFactory = Bitmap.createBitmap(getResources().getDrawable(R.drawable.football),);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.football);
        canvas.drawBitmap(bitmap,100,600,paint);

       // super.onDraw(canvas);
    }
}
