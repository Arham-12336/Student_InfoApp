package com.example.my_dsu.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.my_dsu.databinding.FragmentAddRecordBinding
import com.example.my_dsu.databinding.FragmentSettingBinding
import com.example.my_dsu.ui.addRecords.AddRecordViewModel

class SettingFragment:Fragment() {
    private var _binding:FragmentSettingBinding?=null
    private val binding get() =_binding !!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val settingBinding =
            ViewModelProvider(this).get(SettingViewModel::class.java)
        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSetting
        settingBinding.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}