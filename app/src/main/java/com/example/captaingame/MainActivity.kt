package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme

import android.widget.Toast
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
//import androidx.compose.material3.DropdownMenuItem
//import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

//import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    CaptainGame()
                }
            }
        }
    }
    @Composable
    fun CaptainGame(){
        var treasuresFound = remember {
            mutableStateOf(value = 0)
        }
        val direction = remember {
            mutableStateOf(value = "North")
        }
        val stormOrTreasure = remember {
            mutableStateOf("")
        }
        Column {
            //Spacer(modifier = Modifier.height(16.dp))
            Text(text = "treasures found : ${treasuresFound.value }")
            Text(text = "current direction : ${direction.value }")
            Text(text = stormOrTreasure.value)
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value+=1
                    stormOrTreasure.value = "Found a treasure"
                }
                else {
                    stormOrTreasure.value = "Storm ahead"
                }
            }) {
                Text(text = "Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value+=1
                    stormOrTreasure.value = "Found a treasure"
                }
                else {
                    stormOrTreasure.value = "Storm ahead"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value+=1
                    stormOrTreasure.value = "Found a treasure"
                }
                else {
                    stormOrTreasure.value = "Storm ahead"
                }
            }) {
                Text(text = "Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value+=1
                    stormOrTreasure.value = "Found a treasure"
                }
                else {
                    stormOrTreasure.value = "Storm ahead"
                }
            }) {
                Text(text = "Sail South")
            }
        }
    }
}

