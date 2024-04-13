package com.nbscvincent.ktorapp

import android.content.Context
import com.nbscvincent.ktorapp.posts.repository.OnlinePostRepository


interface AppContainer {
     val onlinePostRepository: OnlinePostRepository
}

class AppDataContainer : AppContainer {
    override val onlinePostRepository: OnlinePostRepository by lazy {
        OnlinePostRepository()
    }


}
