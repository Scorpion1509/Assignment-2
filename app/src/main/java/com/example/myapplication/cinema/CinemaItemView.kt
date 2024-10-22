package com.example.myapplication.cinema

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun CinemaItemView(item: CinemaItem, onClick: (CinemaItem) -> Unit) {
    Column(
        modifier = Modifier
            .width(120.dp)
            .padding(8.dp)
            .clickable { onClick(item) }
    ) {
        Image(
            painter = painterResource(item.imageRes),
            contentDescription = item.title,
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = item.title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
