package com.example.turkhavayollaritanitimuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.turkhavayollaritanitimuygulamasi.databinding.ActivityMainBinding
import com.example.turkhavayollaritanitimuygulamasi.ui.theme.TurkHavaYollariTanitimUygulamasiTheme

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Toast.makeText(this, "Türk Hava Yolları Tanıtım Platformuna Hoşgeldiniz", Toast.LENGTH_SHORT).show()
    }

    fun ucaklargecis(view: View){
        val intent = Intent(applicationContext, UcaklarActivity::class.java)
        startActivity(intent)
    }

    fun tarihcegecis(view: View){
        val intent = Intent(applicationContext, TarihceActivity::class.java)
        startActivity(intent)
    }

    fun sehirlergecis(view: View){
        val intent = Intent(applicationContext, sehirlerActivity::class.java)
        startActivity(intent)
    }
}