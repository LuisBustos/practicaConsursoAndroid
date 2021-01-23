package mx.com.gob.cdmx.concursocostplay.listeners

import mx.com.gob.cdmx.concursocostplay.models.Persona

interface CosplayListener {

    fun onClickCosplay(costplay : Persona)
    fun onCLickButton(costplay : Persona)

}