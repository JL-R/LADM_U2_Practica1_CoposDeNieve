package mx.tecnm.tepic.ladm_u2_practica1_coposdenieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import kotlin.random.Random

class Circulo (l:Lienzo) {
    val l= l
    var x1 = 0f
    var x2 = 0f
    var x3 = 0f

    var y1 = 0f
    var y2 = 0f
    var y3 = 0f
    var movX=0f
    var color= Color.rgb(255,255,255)

    init{
        x1=rand(1000)
        movX= rand(6)+2 // generé un movimiento aleatorio para ir de 2 en 2 o hasta de  8 en 8
        y1= rand(1900)
/*
        x2=rand(1000)
        movX= rand(6)+2 // generé un movimiento aleatorio
        y2= rand(1900)

       x3=rand(1000)
        movX= rand(6)+2 // generé un movimiento aleatorio
        y3= rand(1900)*/

        color=Color.rgb(255,255,255)

    }

    private fun rand(hasta:Int): Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun mover(){
        x1 -=movX
        if (x1<0){
            x1=rand(1500)
        }
    }
/*
    fun mover2(){
        x2 -=movX
        if (x2<0){
            x2=rand(1500)
        }
    }
    fun mover3(){
        x3 -=movX
        if (x3<0){
            x3=rand(1500)
        }
    }*/


    fun pintar(canvas: Canvas){
        var p= Paint()
        p.color=color
        canvas.drawCircle(x1,y1,4f,p)
    }
/*
    fun pintar2(canvas: Canvas){
        var p= Paint()
        p.color=color
        canvas.drawCircle(x2,y2,4f,p)
    }
    fun pintar3(canvas: Canvas){
        var p= Paint()
        p.color=color
        canvas.drawCircle(x3,y3,4f,p)
    }*/

}