package com.example.ngenge.recyclerviewclicklistener


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_actor_detail.*

class DetailUserActivity : AppCompatActivity() {

    private var name: TextView? = null
    private var about: TextView? = null
    private var photo: ImageView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.item_user)

        name = findViewById(R.id.textViewName)
        about = findViewById(R.id.textViewAbout)
        photo = findViewById(R.id.photoView)




        val intent = intent
        // получаем данные через интент при условии если
        if (intent.hasExtra("name") && intent.hasExtra("about")) {
            val name = intent.getStringExtra("name")
            val about = intent.getStringExtra("about")
            val photoId = intent.getIntExtra("photo", -1) // -1 - это знач. по умолчанию в случае отсутствия resId

            textViewName.setText(name)
            textViewAbout.setText(about)
            imageView.setTag(photoId)


        } else {
            val backToCategory = Intent(this, MainActivity::class.java)
            startActivity(backToCategory)
        }

    }

}