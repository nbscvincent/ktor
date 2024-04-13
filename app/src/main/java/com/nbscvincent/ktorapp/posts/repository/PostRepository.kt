package com.nbscvincent.ktorapp.posts.repository

import com.nbscvincent.ktorapp.posts.model.Post


interface PostRepository {

    // Retrieve all posts
    suspend fun getPosts(): List<Post>
}