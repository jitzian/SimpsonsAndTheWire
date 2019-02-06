package org.com.castcodechallenge.comcastcodechallenge.ui.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.com.castcodechallenge.comcastcodechallenge.R
import org.com.castcodechallenge.comcastcodechallenge.databinding.ContentMainBinding
import org.com.castcodechallenge.comcastcodechallenge.db.model.Character
import org.com.castcodechallenge.comcastcodechallenge.ui.CharactersViewModel

class RVCharactersAdapter: RecyclerView.Adapter<RVCharactersAdapter.ViewHolder>() {
    private lateinit var charactersList:List<Character>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.content_main, parent, false))
    }

    override fun getItemCount(): Int {
        return if(::charactersList.isInitialized) charactersList.size else 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(charactersList[position])
    }

    fun updateCharacterList(charactersList:List<Character>){
        this.charactersList = charactersList
        notifyDataSetChanged()
    }


    inner class ViewHolder(private val binding: ContentMainBinding): RecyclerView.ViewHolder (binding.root){
        private val viewModel = CharactersViewModel()

        fun bind(character: Character){
            viewModel.bind(character)
            binding.viewModel = viewModel
        }
    }


}