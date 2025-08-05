package com.example.questadvancelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout.ui.theme.QuestAdvanceLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestAdvanceLayoutTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TataletakColumn()
                }
            }
        }
    }
}

// Layout utama menggunakan Column
@Composable
fun TataletakColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Modifier: Padding
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Data Mahasiswa", fontSize = 25.sp)
        Text(text = "Teknologi Informasi", fontSize = 17.sp)

        Spacer(modifier = Modifier.height(20.dp)) // Untuk memberi jarak

        // Mahasiswa 1
        TataletakRow(
            imageId = R.drawable.pikachu,
            name = "Pikachu",
            telp = "+628123456666"
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Mahasiswa 2
        TataletakRow(
            imageId = R.drawable.bulbasaur,
            name = "Bulbasaur",
            telp = "+628987654795"
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "© 2077 LordAAI", fontSize = 13.sp)
    }
}

// Layout horizontal untuk tiap mahasiswa
@Composable
fun TataletakRow(imageId: Int, name: String, telp: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(), // Modifier: Layout
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .width(70.dp)
                .height(70.dp)
        )

        Column(
            modifier = Modifier.padding(start = 16.dp) // Modifier: Padding
        ) {
            Text(text = name)
            Text(text = "Tlp : $telp")
        }
    }
}
