package com.example.zyh.pathtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by zyh on 16-8-13.
 */
public class MyView extends View {
    public  MyView(Context context){
        super(context);
    }
    public  void onDraw(Canvas canvas){
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();
              /*去锯齿*/
        paint.setAntiAlias(true);
              /*设置paint的颜色*/
        paint.setColor(Color.RED);
              /*设置paint的 style 为STROKE：空心*/
        paint.setStyle(Paint.Style.FILL);
              /*设置paint的外框宽度*/
        paint.setStrokeWidth(3);

              /*画一个空心圆形*/
       // canvas.drawCircle(400, 400, 30, paint);

              /*画一个空心正方形*/

      /*  Path path=new Path();
        path.moveTo(10, 330);
        path.lineTo(70,330);
        path.lineTo(40,270);
        path.close();
        canvas.drawPath(path, paint);   这是一个三角形*/


        Shader mShader=new LinearGradient(0,0,100,0, new int[]{Color.BLUE,Color.RED,Color.YELLOW,Color.WHITE},null,Shader.TileMode.MIRROR);
        paint.setShader(mShader);
        canvas.drawCircle(400,400,300, paint);
        //前面四个决定了两点，称之为渐变双点，决定渐变角度
        //Shader.TileMode三种模式
        //REPEAT:沿着渐变方向循环重复
        //CLAMP：
        //MIRROR:与REPEAT一样都是循环重复，但这个会对称重复.真的是对称实测

    }
}
