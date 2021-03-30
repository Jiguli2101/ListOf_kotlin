package com.example.ngenge.recyclerviewclicklistener

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity(),OnItemClickListener {
    private lateinit var adapter: RecyclerAdapter

    override fun onItemClicked(user: User) {
        val nextIntent = Intent(this, DetailUserActivity::class.java)
        intent.putExtra("name", user.name) // передаем информацию о конкретной модели
        intent.putExtra("about", user.about) // передаем информацию о конкретной модели
        intent.putExtra("photo", user.photo) // передаем информацию о конкретной модели

        startActivity(nextIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usersList = findViewById<RecyclerView>(R.id.usersList)
        usersList.layoutManager = LinearLayoutManager(this)
        adapter = RecyclerAdapter(users, this)
        usersList.adapter = adapter

    }

    val users = mutableListOf<User>(
            User("Бенисио Дель Торо", "Описание ", R.drawable.benicio),
            User("Роберт Неппер", "Описание ",R.drawable.knepper ),
            User("Уильям Фихтнер", "Описание ",R.drawable.fichtner),
            User("Оливье Рабурден", "Описание ", R.drawable.rabourdin ),
            User("Пьер Ришар", "Описание", R.drawable.richard),
            User("Жерар Депардье", "Описание ", R.drawable.depardieu ),
            User("Боб Оденкёрк", "Описание", R.drawable.odenkirk ),
            User("Оливер Стоун", "Описание", R.drawable.stone ),
            User("Джимми Симпсон", "Описание", R.drawable.simpson ),
            User("Стив Бушеми", "Описание", R.drawable.buscemi),
            User("Майкл Питт", "Описание", R.drawable.pitt),
            User("Майкл Уэтерли", "Описание", R.drawable.weatherly),
            User("Вин Дизель", "Описание", R.drawable.diesel),
            User("Кевин Спейси", "Описание",R.drawable.spacey ),
            User("Розамунд Пайк", "Описание", R.drawable.pike),
            User("Джонни Депп", "Описание",R.drawable.depp ),
            User("Леонардо ДиКаприо", "Описание", R.drawable.dicaprio),
            User("Том Хэнкс", "Описание", R.drawable.hanks),
            User("Рассел Кроу ", "Описание", R.drawable.crowe),
            User("Роберт Дауни мл.", "Описание",R.drawable.downey ),
            User("Джон Кьюсак", "Описание", R.drawable.cusack),
            User("Джеймс Мэй", "Описание",R.drawable.may ),
            User("Сергей Чонишвили", "Описание", R.drawable.chonoshvili))

}
