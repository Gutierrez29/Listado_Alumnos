package com.uct.listadodealumnos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlumnosAdapter(private val alumnosList: List<Alumnos>) :
    RecyclerView.Adapter<AlumnosAdapter.AlumnosViewHolder>() {

    inner class AlumnosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.nombreTextView)
        val gradoSeccionTextView: TextView = itemView.findViewById(R.id.gradoSeccionTextView)
        val imagenAlumno: ImageView = itemView.findViewById(R.id.imagenAlumno)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnosViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_alumno, parent, false)
        return AlumnosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AlumnosViewHolder, position: Int) {
        val currentItem = alumnosList[position]
        holder.nombreTextView.text = currentItem.nombre
        holder.gradoSeccionTextView.text = currentItem.gradoyseccion

    }

    override fun getItemCount() = alumnosList.size
}
