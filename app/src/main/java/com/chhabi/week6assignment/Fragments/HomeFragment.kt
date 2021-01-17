package com.chhabi.week6assignment.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chhabi.week6assignment.R
import com.chhabi.week6assignment.adapter.studentAdapter
import com.chhabi.week6assignment.lstStudent
import com.chhabi.week6assignment.model.Student

class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    lateinit var ccontext: Context
    override fun onAttach(context: Context) {
        super.onAttach(context!!)
        ccontext = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_home, container, false)
        storyRecyclerView(view)
return view
    }

    private fun storyRecyclerView(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        val adapter = studentAdapter(lstStudent, ccontext)
        recyclerView.layoutManager = LinearLayoutManager(ccontext, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter


    }
    private fun loadStudent() {
        lstStudent.add(Student("", "chhabi bista", 22, "Male", "imadol"))

    }
    companion object{
        fun newInstance():HomeFragment=HomeFragment()
    }
    }
