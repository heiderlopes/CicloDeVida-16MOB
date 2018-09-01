package br.com.heiderlopes.ciclodevida

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders
                .of(this)
                .get(MainViewModel::class.java)


        atualizarPlacarCasa()
        atualizarPlacarVisitante()

        btCasa.setOnClickListener {
            mainViewModel.placarCasa = mainViewModel.placarCasa + 1
            atualizarPlacarCasa()
        }

        btVisitante.setOnClickListener {
            mainViewModel.placarVisitante = mainViewModel.placarVisitante + 1
            atualizarPlacarVisitante()
        }
    }

    private fun atualizarPlacarCasa() {
        tvCasa.text = mainViewModel.placarCasa.toString()
    }

    private fun atualizarPlacarVisitante() {
        tvVisitante.text = mainViewModel.placarVisitante.toString()
    }
}
