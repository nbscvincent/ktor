package com.nbscvincent.ktorapp

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.nbscvincent.ktorapp.posts.viewmodel.PostViewModel


object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer {
            PostViewModel(ktorapp().container.onlinePostRepository)
        }
    }
}

fun CreationExtras.ktorapp(): KtorApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KtorApplication)