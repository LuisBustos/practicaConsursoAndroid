package mx.com.gob.cdmx.concursocostplay.adapters.viewholders

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.costplay_card.view.*
import mx.com.gob.cdmx.concursocostplay.listeners.CosplayListener
import mx.com.gob.cdmx.concursocostplay.models.Persona

class CostplayViewHolder (val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var cosplayListener : CosplayListener?= null
    private var cosplayObject : Persona ? = null
    private var nombre : TextView = itemView.costplayNamePerson
    private var edad : TextView = itemView.costplayAge
    private var nombreCosplay : TextView = itemView.costplayName
    private var nacionalidad : TextView = itemView.costplayCountry
    private var shareButton : Button = itemView.moreButton

    fun blindCostplay(costplay:Persona){
        this.cosplayObject = costplay
        nombre.text = this.cosplayObject?.nombre
        edad.text = this.cosplayObject?.edad.toString()
        nombreCosplay.text= this.cosplayObject?.nombreCostplay
        nacionalidad.text = this.cosplayObject?.nacionalidad

        itemView.setOnClickListener{
            view -> cosplayListener?.onClickCosplay(this.cosplayObject!!)
        }

        shareButton.setOnClickListener{
                view -> cosplayListener?.onCLickButton(this.cosplayObject!!)
        }

    }
    fun setCosplayListener(listener : CosplayListener?){
        this.cosplayListener=listener
    }

}