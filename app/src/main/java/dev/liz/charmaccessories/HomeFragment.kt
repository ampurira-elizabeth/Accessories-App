package dev.liz.charmaccessories

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.liz.charmaccessories.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
class HomeFragment : Fragment() {
  lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(layoutInflater)
        (R.layout.activity_main)
        return inflater.inflate(R.layout.fragment_home, container, false)
//        setMenuVisibility(binding.btntop)
    }



}