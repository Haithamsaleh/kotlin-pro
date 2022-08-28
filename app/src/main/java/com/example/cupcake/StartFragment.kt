/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.cupcake.databinding.FragmentStartBinding
import com.example.cupcake.model.OrderViewModel

/**
 * This is the first screen of the Cupcake app. The user can choose how many cupcakes to order.
 */
class StartFragment : Fragment() {

    // Binding object instance corresponding to the fragment_start.xml layout
    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
    // when the view hierarchy is attached to the fragment.
    private var binding: FragmentStartBinding? = null

    // reference to the shared view model
    private val sharedViewModel : OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
    }

    /**
     * Start an order with the desired quantity of cupcakes and navigate to the next screen.
     */
    fun orderCupcake(quantity: Int) {
        sharedViewModel.setQuantity(quantity)
        if (sharedViewModel.hasNoFlavorSet()){
            sharedViewModel.setFlavor(getString(R.string.vanilla))
        }
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_flavorFragment)
    }
    fun goToNextBook1() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_bookFragment2)

    }
    fun goToNextBook2() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_book2Fragment)

    }
    fun goToNextBook3() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_book3Fragment)

    }
    fun goToNextBook4() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_book4Fragment)

    }
    fun goToNextBook5() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_book5Fragment)

    }
    fun getUrlFromIntent() {
        val url = "https://drive.google.com/file/d/1PTG_dMzOuDJ29TWi4Vtei-Ia1D7rCcAP/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    fun getUrlFromIntent2() {
        val url = "https://drive.google.com/file/d/1p-k6oG7ifA-9g_2Sp3YlZwxakC9igbkc/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    fun getUrlFromIntent3() {
        val url = "https://drive.google.com/file/d/1PL-SkLHPzS3RRLcweoqfJ0Hlt33RJAd5/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    fun getUrlFromIntent4() {
        val url = "https://drive.google.com/file/d/1KeYcQ-gN1CK7iZEtC9PN3ID6SCrnAQK7/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    fun getUrlFromIntent5() {
        val url = "https://drive.google.com/file/d/14fwNDiptrvYZ38Xedmry-NzRZGpY3V1n/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    fun getUrlFromIntent6() {
        val url = "https://drive.google.com/file/d/1IiWZwGO0AGKEufqnWNyiX6RMJ-AwuVV_/view?usp=sharing"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}