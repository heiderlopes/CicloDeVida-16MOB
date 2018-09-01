package br.com.heiderlopes.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarViewModel: ViewModel() {

    val placarCasa = MutableLiveData<Int>()
    val placarVisitante = MutableLiveData<Int>()

    init {
        placarCasa.value = 0
        placarVisitante.value = 0
    }

    fun pontoCasa(ponto: Int) {
        placarCasa.value = placarCasa.value?.plus(ponto)
    }

    fun pontoVisitante(ponto: Int) {
        placarVisitante.value = placarVisitante.value?.plus(ponto)
    }

    fun reiniciar() {
        placarCasa.value = 0
        placarVisitante.value = 0
    }
}









