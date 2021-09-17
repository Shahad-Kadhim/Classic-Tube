package com.example.classictube.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classictube.data.database.MovieSaved
import com.example.classictube.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var database: MovieSaved


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = MovieSaved(applicationContext)

        handleInserts()
        handleDeletes()


    }


    fun clearEditTexts() {
        binding.apply {
            inputid1Text.setText("")
            inputid2Text.setText("")
        }
    }

    fun handleInserts() {
        binding.apply {
            add.setOnClickListener {
            try {
                database.insertMovieSave(listText.toString())
                clearEditTexts()
            } catch (e: Exception) {
                e.printStackTrace()

            }
        }
        }
    }



    fun handleDeletes() {
        binding.apply {
            delet.setOnClickListener {
                try {
                    database.deleteMovieSave(inputid1Text.text.toString())
                    clearEditTexts()
                } catch (e: Exception) {
                    e.printStackTrace()

                }
            }
        }
    }
}




