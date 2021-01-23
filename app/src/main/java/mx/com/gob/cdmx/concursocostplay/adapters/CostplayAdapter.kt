package mx.com.gob.cdmx.concursocostplay.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mx.com.gob.cdmx.concursocostplay.R
import mx.com.gob.cdmx.concursocostplay.adapters.viewholders.CostplayViewHolder
import mx.com.gob.cdmx.concursocostplay.listeners.CosplayListener
import mx.com.gob.cdmx.concursocostplay.models.Persona

class CostplayAdapter (val costplays:List<Persona>) : RecyclerView.Adapter<CostplayViewHolder>() {

    private var cosplayListener : CosplayListener?= null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CostplayViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.costplay_card,parent,false)
        val costplayViewHolder = CostplayViewHolder(itemView)
        costplayViewHolder.setCosplayListener(cosplayListener)
        return costplayViewHolder
    }

    override fun onBindViewHolder(holder: CostplayViewHolder, position: Int) {
       holder.blindCostplay(costplays[position])
    }

    override fun getItemCount(): Int {
        return costplays.size
    }

    fun setCosplayListener(listener : CosplayListener){
        this.cosplayListener = listener
    }

}