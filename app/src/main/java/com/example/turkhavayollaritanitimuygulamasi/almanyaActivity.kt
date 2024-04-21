package com.example.turkhavayollaritanitimuygulamasi

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.turkhavayollaritanitimuygulamasi.databinding.AlmanyaMainBinding
import com.example.turkhavayollaritanitimuygulamasi.ui.theme.TurkHavaYollariTanitimUygulamasiTheme

class almanyaActivity : ComponentActivity() {

    lateinit var listview: ListView
    var sehirler = arrayOf("Berlin", "Bremen", "Düsseldorf", "Frankfurt", "Friedrichshafen", "Hamburg", "Hannover", "Karlsruhe", "Köln", "Leipzig", "Münih", "Nürnberg", "Stuttgart")
    var sehirlerdeneme = mutableListOf<String>("Berlin", "Bremen", "Düsseldorf", "Frankfurt", "Friedrichshafen", "Hamburg", "Hannover", "Karlsruhe", "Köln", "Leipzig", "Münih", "Nürnberg", "Stuttgart")
    lateinit var binding: AlmanyaMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AlmanyaMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val aSinifiGozetmenleri = 2

        val aSinifiGozetmen = sehirlerdeneme.asSequence().shuffled().take(aSinifiGozetmenleri).toList()

        val arrayAdapter: ArrayAdapter<*>

        var listView = findViewById<ListView>(R.id.listView)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, aSinifiGozetmen
        )
        listView.adapter = arrayAdapter



    }
}

