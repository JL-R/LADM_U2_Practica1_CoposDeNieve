package mx.tecnm.tepic.ladm_u2_practica1_coposdenieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo (este:MainActivity): View(este) {
    val este= este
    val circulos= Array<Circulo>(25,{Circulo(this)})
    //val circulos2= Array<Circulo>(25,{Circulo(this)})
    //val circulos3= Array<Circulo>(25,{Circulo(this)})
    var fondo= Color.BLACK

    val corutina = GlobalScope.launch {
        while (true){
            este.runOnUiThread {
                invalidate()
            }
            delay(20L)
        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p= Paint()
        c.drawColor(fondo)
        p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(-350f,500f,375f,1800f,p) // ovalo central


        p.color = Color.rgb(76,175,80)
        c.drawOval(-300f,-100f,275f,900f,p) //ovalo izquierdo


        p.color = Color.rgb(32,120,35)
        c.drawOval(-150f,1300f,350f,2200f,p) // ovalo derecho


        p.color = Color.rgb(103,95,66)
        c.drawRect(150f,150f,300f,225f,p) //tronco en medio


        p.color = Color.rgb(43,149,46)
        c.drawOval(280f,90f,410f,285f,p) //hojas


        p.color = Color.rgb(43,149,46)
        c.drawOval(390f,90f,520f,285f,p) //hojas


        p.color = Color.rgb(43,149,46)
        c.drawOval(500f,90f,630f,285f,p) //hojas


        p.color = Color.rgb(103,95,66)
        c.drawRect(280f,710f,380f,760f,p) //tronco lejos

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(325f,660f,400f,820f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(380f,660f,455f,820f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(435f,660f,505f,820f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(103,95,66)
        c.drawRect(-100f,1750f,200f,2000f,p) //tronco cerca

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(115f,1600f,350f,2200f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(300f,1600f,535f,2200f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(43,149,46)
        c.drawOval(485f,1600f,715f,2200f,p) //hojas

        //p.style=Paint.Style.FILL
        p.color = Color.rgb(133,203,220)
        c.drawRect(300f,1000f,515f,1450f,p) //casa


        p.color = Color.rgb(115,99,94)
        p.strokeWidth=6f
        val path = Path()
        path.moveTo(500f,940f)
        path.lineTo(650f, 1040f)
        path.lineTo(650f, 1410f)
        path.lineTo(500f, 1510f)
        path.close()
        c.drawPath(path,p) //techo


        p.color = Color.rgb(145,156,106)
        c.drawRect(300f,1050f,425f,1140f,p) //puerta


        p.color = Color.rgb(145,156,106)
        c.drawRect(370f,1160f,425f,1400f,p) //ventana

        p.color = Color.rgb(177,146,93)
        c.drawRect(560f,1060f,680f,1135f,p) //chimenea

        p.color = Color.rgb(168,161,149)
        c.drawOval(720f,1055f,775f,1145f,p) //humo1

        p.color = Color.rgb(168,161,149)
        c.drawOval(780f,1140f,840f,1240f,p) //humo2

        p.color = Color.rgb(168,161,149)
        c.drawOval(845f,1230f,930f,1360f,p) //humo3

        for(circ in circulos){
            circ.mover()
            circ.pintar(c)
        }


    }

}