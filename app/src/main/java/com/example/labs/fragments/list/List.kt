package com.example.labs.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.labs.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class List : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val button = view.findViewById<FloatingActionButton>(R.id.btn_add_new_note_from_list)
        button.setOnClickListener(){
            findNavController().navigate(R.id.action_list_to_add)
        }

        return  view    }

}