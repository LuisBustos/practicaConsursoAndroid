package mx.com.gob.cdmx.concursocostplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_cosplay.*
import kotlinx.android.synthetic.main.costplay_card.*

class DetailCosplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_cosplay)

        id_Person.text = intent.getStringExtra("id")
        namePerson.text = intent.getStringExtra("name")
        nameCosplay.text = intent.getStringExtra("nameCosplay")
        edad.text = intent.getStringExtra("edad")
        mascara.text = intent.getStringExtra("mascara")
        nationality.text = intent.getStringExtra("nacionalidad")
        categoria.text = intent.getStringExtra("categoria")

    }
}