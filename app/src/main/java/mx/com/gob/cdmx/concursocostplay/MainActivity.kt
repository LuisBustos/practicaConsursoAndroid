package mx.com.gob.cdmx.concursocostplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_cosplay.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.costplay_card.*
import mx.com.gob.cdmx.concursocostplay.adapters.CostplayAdapter
import mx.com.gob.cdmx.concursocostplay.listeners.CosplayListener
import mx.com.gob.cdmx.concursocostplay.models.Persona

class MainActivity : AppCompatActivity(), CosplayListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cosplay = arrayListOf<Persona>(
            Persona( 1, 26,"Luis Enrique","Darius",
                "México","Videojuego",false),
            Persona(2,21,"Elisa","Miss Fortune",
            "Ecuador","Videojuego",false),
            Persona(3,29,"Fatima","Nami",
            "Argentina","Videojuego",false),
            Persona(4,35,"Roberto","Mario",
            "México","Videojuego",true ),
            Persona(5,22,"Alan","MegaMan",
            "Paragay","Videojuego",true),
            Persona(6,30,"Alonso","BatmanLego",
            "Colombia","Videojuego",true)
        )
        val cosplayAdapter = CostplayAdapter(cosplay)
        cosplayAdapter.setCosplayListener(this)
        cosplayRecyclerView.adapter=cosplayAdapter
        val layoutManager = LinearLayoutManager(baseContext,RecyclerView.VERTICAL,false)
        cosplayRecyclerView.layoutManager = layoutManager

    }

    override fun onClickCosplay(cosplay: Persona) {
        Toast.makeText(this,"Click la tarjeta de " + cosplay.nombre, Toast.LENGTH_LONG).show()

    }

    override fun onCLickButton(cosplay: Persona) {
        Toast.makeText(this,"Datos encontrados", Toast.LENGTH_LONG).show()
        val detailIntent = Intent(this,DetailCosplay::class.java).apply{
            val detailBundle = Bundle().apply{
                putInt("id",cosplay.id)
                putString("name",cosplay.nombre)
                putString("edad",cosplay.edad.toString())
                putString("nameCosplay",cosplay.nombreCostplay)
                putString("nacionalidad",cosplay.nacionalidad)
                putString("categoria",cosplay.categoria)
                putString("mascara",cosplay.mascara.toString())
            }
            putExtras(detailBundle)
        }
        startActivity(detailIntent)
    }

}