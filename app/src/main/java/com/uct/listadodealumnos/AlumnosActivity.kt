package com.uct.listadodealumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AlumnosActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var alumnosAdapter: AlumnosAdapter
    private lateinit var alumnosList: List<Alumnos>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumnos)


        alumnosList = listOf(
            Alumnos("Juan Pérez", "3A", "https://img.freepik.com/vector-premium/esbozo-vectorial-nino-acte-diseno-vectorio-nino-animado_772298-35376.jpg"),
            Alumnos("María García", "4B", "https://img.freepik.com/vector-premium/esbozo-vectorial-nina-acte-diseno-vectorio-nina-animada_772298-35377.jpg"),
            Alumnos("Pedro Martínez", "2C", "https://img.freepik.com/vector-premium/dibujos-animados-nino-jugando-aislado_78361-10820.jpg")
        )


        recyclerView = findViewById(R.id.alumnosRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        alumnosAdapter = AlumnosAdapter(alumnosList)
        recyclerView.adapter = alumnosAdapter
    }
}
