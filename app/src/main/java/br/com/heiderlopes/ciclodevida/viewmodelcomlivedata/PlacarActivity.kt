package br.com.heiderlopes.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.ciclodevida.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    var placarViewModel: PlacarViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        placarViewModel = ViewModelProviders.of(this)
                .get(PlacarViewModel::class.java)


        placarViewModel?.placarVisitante?.observe(this, Observer {
            tvPlacarVisitante.text = it?.toString()
        })

        placarViewModel?.placarCasa?.observe(this, Observer {
            tvPlacarCasa.text = it?.toString()
        })


        btCasa1.setOnClickListener {
            placarViewModel?.pontoCasa(1)
        }

        btCasa2.setOnClickListener {
            placarViewModel?.pontoCasa(2)
        }

        btCasa3.setOnClickListener {
            placarViewModel?.pontoCasa(3)
        }

        btVisitante1.setOnClickListener {
            placarViewModel?.pontoVisitante(1)
        }

        btVisitante2.setOnClickListener {
            placarViewModel?.pontoVisitante(2)
        }

        btVisitante3.setOnClickListener {
            placarViewModel?.pontoVisitante(3)
        }

        btReiniciar.setOnClickListener {
            placarViewModel?.reiniciar()
        }
    }
}
