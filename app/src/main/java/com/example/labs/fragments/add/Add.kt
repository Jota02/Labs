package com.example.labs.fragments.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.labs.R
import com.example.labs.data.entities.Note
import com.example.labs.data.vm.NoteViewModel

class Add : Fragment(){

    private lateinit var mNoteViewModel: NoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add,container, false)

        ViewModelProvider(this).get(NoteViewModel::class.java).also { this.mNoteViewModel = it }

        val button = view.findViewById<Button>(R.id.save)
        button.setOnClickListener {
            addNote()
        }
        return view
    }
    private fun addNote(){
        val noteText = view?.findViewById<EditText>(R.id.addNote)

        val note = Note(0, noteText?.text.toString())

        mNoteViewModel.addNote(note)

        Toast.makeText(requireContext(), "Gravado com sucesso!", Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.action_add_to_list)
    }

}