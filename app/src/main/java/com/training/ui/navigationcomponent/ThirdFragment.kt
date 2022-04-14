package com.training.ui.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<CardView>(R.id.cardId).setOnClickListener {

            findNavController().navigate(R.id.fromThirtToFirst)

        }

    }

}