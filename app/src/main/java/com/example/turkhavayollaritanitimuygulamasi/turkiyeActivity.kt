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
import com.example.turkhavayollaritanitimuygulamasi.databinding.TurkiyeMainBinding
import com.example.turkhavayollaritanitimuygulamasi.ui.theme.TurkHavaYollariTanitimUygulamasiTheme

class turkiyeActivity : ComponentActivity() {

    lateinit var listview: ListView
    var sehirler = arrayOf(
        "Adana", "Adıyaman", "Alanya", "Amasya", "Ankara", "Antalya", "Ağrı", "Balıkesir", "Batman", "Bingöl", "Denizli", "Diyarbakır", "Elazığ", "Erzincan", "Erzurum", "Gaziantep",
        "Hakkari", "Hatay", "Isparta", "Iğdır", "Kahramanmaraş", "Kars", "Kastamonu", "Kayseri", "Konya", "Kütahya", "Malatya", "Mardin", "Muğla", "Bodrum", "Dalaman", "Muş", "Nevşehir",
        "Ordu-Giresun", "Rize", "Samsun", "Siirt", "Sinop", "Sivas", "Tokat", "Trabzon", "Van", "Zonguldak", "İstanbul", "İzmir", "Şanlıurfa", "Şırnak")

    lateinit var binding: TurkiyeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TurkiyeMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val arrayAdapter: ArrayAdapter<*>

        var listView = findViewById<ListView>(R.id.listView)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, sehirler
        )
        listView.adapter = arrayAdapter
    }
}

