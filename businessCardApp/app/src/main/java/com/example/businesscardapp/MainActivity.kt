package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

import androidx.compose.foundation.layout.*

import androidx.compose.material.icons.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayUserInformationCard("Jennifer Doe", "Android Developer Extraordinare", "+11 (123) 444 555 66", "@AndroidDev", "jen.doe@gmail.com")
                }
            }
        }
    }
}

@Composable
fun DisplayUserInformationCard(name: String, skills: String , phoneNumber: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDCF4E0)),

    ) {

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
            )

        Text(
            text = name,
            fontSize = 50.sp,
            modifier = modifier,
        )

        Text(
            text = skills,
            color = Color(0xFF006400)
        )
    }

    Column(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 16.dp),

        ) {
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "Phone Icon",
                tint = Color.Black,
                modifier = Modifier.padding(end = 14.dp)
            )

            Text(text = phoneNumber)
        }

        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = "Phone Icon",
                tint = Color.Black,
                modifier = Modifier.padding(end = 14.dp)
            )

            Text(text = socialMedia)
        }

        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Phone Icon",
                tint = Color.Black,
                modifier = Modifier.padding(end = 14.dp)
            )

            Text(text = email)
        }

    }}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        DisplayUserInformationCard("Jennifer Doe", "Android Developer Extraordinare", "+11 (123) 444 555 66", "@AndroidDev", "jen.doe@gmail.com")
    }
}