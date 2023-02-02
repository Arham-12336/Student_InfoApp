package com.example.my_dsu.ui.addRecords

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.my_dsu.databinding.FragmentAddRecordBinding
import com.example.my_dsu.model.database.RecordDatabase
import com.example.my_dsu.model.datamodel.Record
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class AddRecordFragment: Fragment() {

    private var _binding :FragmentAddRecordBinding? =null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val addRecordViewModel =
            ViewModelProvider(this).get(AddRecordViewModel::class.java)
        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val writeRecordBtn: Button = binding.btnWriteData
        writeRecordBtn.setOnClickListener {
            val addName = binding.et_first_name
            val addDescription = binding.et_last_name
            if(addName.text.isNotBlank()) {
                val newRecord = Record(
                    Random.nextInt(0, 10000000),
                    1,
                    addName.text.toString(),
                    addDescription.text.toString(),
                );
                GlobalScope.launch(Dispatchers.IO) {
                    Log.d("In Corutine", "addRecord: ")
                    val db = RecordDatabase.getInstance(requireContext());
                    db.recordDao().insert(newRecord)
                }

                addName.setText("")
                addDescription.setText("")

            }
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
