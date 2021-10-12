package com.zeek.zeek123

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img0 = findViewById<ImageView>(R.id.img0)
        img0.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.zero)
            mediaPlayer.start()
        }

        val img1 = findViewById<ImageView>(R.id.img1)
        img1.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.one)
            mediaPlayer.start()
        }

        val img2 = findViewById<ImageView>(R.id.img2)
        img2.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.two)
            mediaPlayer.start()
        }

        val img3 = findViewById<ImageView>(R.id.img3)
        img3.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.three)
            mediaPlayer.start()
        }

        val img4 = findViewById<ImageView>(R.id.img4)
        img4.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.four)
            mediaPlayer.start()
        }

        val img5 = findViewById<ImageView>(R.id.img5)
        img5.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.five)
            mediaPlayer.start()
        }

        val img6 = findViewById<ImageView>(R.id.img6)
        img6.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.six)
            mediaPlayer.start()
        }

        val img7 = findViewById<ImageView>(R.id.img7)
        img7.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.seven)
            mediaPlayer.start()
        }

        val img8 = findViewById<ImageView>(R.id.img8)
        img8.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.eight)
            mediaPlayer.start()
        }

        val img9 = findViewById<ImageView>(R.id.img9)
        img9.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.nine)
            mediaPlayer.start()
        }

        val img10 = findViewById<ImageView>(R.id.img10)
        img10.setOnClickListener{
            mediaPlayer = MediaPlayer.create(applicationContext,R.raw.ten)
            mediaPlayer.start()
        }

        val quit = findViewById<ImageView>(R.id.quit)
        quit.setOnClickListener{
            this.moveTaskToBack(true);
        }



    }
}