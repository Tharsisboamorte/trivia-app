package com.project.triviaapp.presentation.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.project.triviaapp.presentation.home.HomeViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryCard(
    title: String,
    bottomSheetState: BottomSheetScaffoldState,
    viewModel: HomeViewModel,
    categoryId: Int,
) {
    val scope = rememberCoroutineScope()

    Card(
        modifier = Modifier
            .padding(start = 5.dp, end = 5.dp, bottom = 15.dp)
            .clickable {
                scope.launch {
                    bottomSheetState.bottomSheetState.expand()
                }
                viewModel.onCategorySelected(categoryId)
            },
        shape = CardDefaults.elevatedShape,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        border = BorderStroke(width = 5.dp, color = Color.Gray),
        elevation = CardDefaults.cardElevation(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge, color = Color.Gray)
        }
    }
}