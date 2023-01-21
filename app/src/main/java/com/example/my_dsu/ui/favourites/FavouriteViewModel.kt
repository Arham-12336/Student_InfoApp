package com.example.my_dsu.ui.favourites

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_dsu.R
import com.example.my_dsu.model.datamodel.FavouriteRecord
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FavouriteViewModel : ViewModel() {

    private var recordList :MutableLiveData<List<FavouriteRecord>> = MutableLiveData()

//    @SuppressLint("SuspiciousIndentation")
    fun getallRecords(): LiveData<List<FavouriteRecord>>{

        viewModelScope.launch(Dispatchers.IO) {

            val records = arrayListOf<FavouriteRecord>()
            for (i in 0..10){
                if (i%2==0)
                {
                    records.add(FavouriteRecord(R.drawable.image_avatar,"Student -$i","Computer science department",true))
                }
                else {
                    records.add(
                        FavouriteRecord(
                            R.drawable.image_avatar,
                            "Student -$i",
                            "Computer science department",
                            false
                        )
                    )

                }
                recordList.postValue(records)
            }
        }
        return recordList
    }
}