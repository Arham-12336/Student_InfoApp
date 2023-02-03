package com.example.testing.model.datamodel

import androidx.room.*
import java.io.Serializable


@Entity
data class Record(@PrimaryKey val id: Int,@ColumnInfo(name = "image")  val image: Int,@ColumnInfo(name = "name") val name: String,
                  @ColumnInfo(name = "description") val description: String?) : Serializable {

    companion object {

        fun createRecordList(numRecords: Int): ArrayList<Record> {
            val records = ArrayList<Record>()
            for (i in 1..numRecords) {
                records.add(
                    Record(
                        i+1,
                        i *2,
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam nulla porttitor massa id neque aliquam vestibulum morbi. Etiam sit amet nisl purus in mollis nunc sed id. Leo in vitae turpis massa sed elementum tempus. Egestas dui id ornare arcu odio ut sem. Blandit libero volutpat sed cras ornare arcu. Ullamcorper sit amet risus nullam eget felis. Ornare aenean euismod elementum nisi. Nullam non nisi est sit. Ac turpis egestas integer eget aliquet nibh.",
                        "https://picsum.photos/${200+i}"
                    )
                )
            }
            return records
        }
    }
}