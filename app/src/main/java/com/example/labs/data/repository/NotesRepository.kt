package com.example.labs.data.repository

import androidx.lifecycle.LiveData
import com.example.labs.data.entities.Note
import com.example.labs.data.dao.NoteDao

class NotesRepository(private val noteDao: NoteDao) {
    val readALLNotes: LiveData<List<Note>> = noteDao.readALLNotes()

    suspend fun addNote(note: Note){
        noteDao.addNote(note)
    }

    suspend fun updateNote(note: Note){
        noteDao.updateNote(note)
    }

    suspend fun deleteNote(note: Note){
        noteDao.deleteNote(note)
    }

}