package com.example.turkhavayollaritanitimuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.turkhavayollaritanitimuygulamasi.databinding.SehirlerMainBinding
import com.example.turkhavayollaritanitimuygulamasi.ui.theme.TurkHavaYollariTanitimUygulamasiTheme

class sehirlerActivity : ComponentActivity() {
    lateinit var binding: SehirlerMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SehirlerMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun turkiyegecis(view: View){
        val intent = Intent(applicationContext,turkiyeActivity::class.java)
        startActivity(intent)
    }

    fun almanyagecis(view: View){
        val intent = Intent(applicationContext,almanyaActivity::class.java)
        startActivity(intent)
    }
}

