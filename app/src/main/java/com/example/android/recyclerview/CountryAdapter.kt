package com.example.android.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// le ViewHolder permet d'éviter de réallouer otut le temps des nouveau éléments graphique
// conserve en mémoire les éléments graphique
class CountryAdapter(val countries: Array<String>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    // cette classe conserve les références vers les éléments graphique(icon et name)
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        // stocker des références vers les éléments graphiques qui ont été passé en paramètre dans itemView
        val icon = itemView.findViewById<ImageView>(R.id.icon);
        val name = itemView.findViewById<TextView>(R.id.name);
    }

    // appelé à chaque fois qu'un nouvel élément graphique doit être crée
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // permet de convertir un fichier xml layout en code manipulable kotlin
        val inflater = LayoutInflater.from(parent.context);
        // créer l'élément graphique(item) en utilisant l'inflater
        val viewItem = inflater.inflate(R.layout.item_country, parent, false);
        // créer un viewholder pour être associé à celui ci
        return ViewHolder(viewItem);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // récupérer el pays
        val country = countries[position];
        // met à jour le holder
        holder.icon.setImageResource(R.mipmap.ic_launcher_round);
        holder.name.text = country;
    }

    // renvoi la taille totale du tableau
    override fun getItemCount(): Int {
        return countries.size;
    }



}