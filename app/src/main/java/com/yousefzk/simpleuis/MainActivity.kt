package com.yousefzk.simpleuis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.yousefzk.simpleuis.design_system.LoginScreen
import com.yousefzk.simpleuis.design_system.RegisterScreen
import com.yousefzk.simpleuis.ui.theme.SimpleUisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleUisTheme {
                Scaffold { innerpadding ->
                    LoginScreen(modifier = Modifier.padding(innerpadding))
                }
            }
        }
    }
}