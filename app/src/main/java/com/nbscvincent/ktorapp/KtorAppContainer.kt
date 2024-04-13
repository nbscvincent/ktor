package com.nbscvincent.ktorapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.nbscvincent.ktorapp.routes.PostRoutes
import com.nbscvincent.ktorapp.routes.Routes
import com.nbscvincent.ktorapp.posts.PostsScreen
import com.nbscvincent.ktorapp.posts.viewmodel.PostViewModel

@Composable
fun KtorAppContainer(
    postViewModel: PostViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val navController: NavHostController = rememberNavController()

    Scaffold  (content = { padding->
        Box (modifier = Modifier.padding(padding)){
            NavHost(navController = navController, startDestination = Routes.POSTS.name) {
                navigation(
                    startDestination = PostRoutes.PostsScreen.name,
                    route = Routes.POSTS.name
                ) {
                    composable(route = PostRoutes.PostsScreen.name) {
                        PostsScreen(postViewModel)
                    }
                }
            }
        }
    })
}
