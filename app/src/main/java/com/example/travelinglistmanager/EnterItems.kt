package com.example.travelinglistmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelinglistmanager.ui.theme.TravelingListManagerTheme

class EnterItems : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var item by remember {
                mutableStateOf("")
            }

            var category by remember {
                mutableStateOf("")
            }

            var quantity by remember {
                mutableStateOf("")
            }

            var comments by remember {
                mutableStateOf("")
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Enter Item Details")
            }

            Spacer(modifier = Modifier.size(30.dp))
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                OutlinedTextField(
                    value = item,
                    onValueChange = { text ->
                        item = text
                    },
                    placeholder = {
                        Text(text = "item")
                    }
                )

                Spacer(modifier= Modifier.size(30.dp))
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                }
                OutlinedTextField(
                    value = category,
                    onValueChange = { text ->
                        category = text
                    },
                    placeholder = {
                        Text(text = "category")
                    }
                )

                Spacer(modifier= Modifier.size(30.dp))
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                }
                OutlinedTextField(
                    value = quantity,
                    onValueChange = { text ->
                        quantity = text
                    },
                    placeholder = {
                        Text(text = "quantity")
                    }
                )

                Spacer(modifier= Modifier.size(30.dp))
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                }
                OutlinedTextField(
                    value = comments,
                    onValueChange = { text ->
                        comments = text
                    },
                    placeholder = {
                        Text(text = "comments")
                    }
                )
            }
        }
    }
}








