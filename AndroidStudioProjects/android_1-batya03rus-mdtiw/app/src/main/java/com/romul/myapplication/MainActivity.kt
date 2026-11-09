package com.romul.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.romul.myapplication.ui.theme.MyApplicationTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ayur 564-1pring",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        TodayCard(date = LocalDate.now(), modifier = Modifier.fillMaxSize())
//        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//            Greeting(
//                name = "Name",
//                modifier = Modifier.padding(innerPadding)
//            )
//        }
    }
}

@Composable
fun TodayCard(date: LocalDate, modifier: Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        //todo Добавьте иконку и запустите проект.
//        Icon(Icons.Default.CalendarMonth, contentDescription = null)
        Text(
            text = date.dayOfMonth.toString(),
            style = MaterialTheme.typography.displayMedium
        )
        Text(text = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")))
        Button(onClick = {
            // non
        }) {
            Text(text = "Добавить событие")
        }
    }
}