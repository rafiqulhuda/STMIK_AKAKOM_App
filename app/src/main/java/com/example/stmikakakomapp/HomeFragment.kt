package com.example.stmikakakomapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var nav: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        imageView5.setOnClickListener {
            nav.navigate(R.id.action_homeFragment3_to_dosenFragment3)
        }
            imageView6.setOnClickListener {
                nav.navigate(R.id.action_homeFragment3_to_fasilitasFragment2)

            }
        imageView.setOnClickListener {
            nav.navigate(R.id.action_homeFragment3_to_prodiFragment)

        }
        imageView2.setOnClickListener {
            nav.navigate(R.id.action_homeFragment3_to_ukmFragment3)

        }
        }
    }



