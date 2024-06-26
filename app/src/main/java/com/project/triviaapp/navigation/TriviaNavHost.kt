package com.project.triviaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.triviaapp.presentation.home.HomePage
import com.project.triviaapp.presentation.question.QuestionPage
import com.project.triviaapp.presentation.ranking.RankPage
import com.project.triviaapp.presentation.userschoice.UsersChoicePage

@Composable
fun TriviaNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(
            route = Screens.Home.route
        ){
            HomePage(
                navController = navController
            )
        }
        composable(
            route = Screens.Question.route
        ){
            QuestionPage(navController = navController)
        }
        composable(
            route = Screens.Rank.route
        ){
            RankPage(navController = navController)
        }
        composable(
            route = Screens.UsersChoice.route
        ){
            UsersChoicePage(navController = navController)
        }
    }
}