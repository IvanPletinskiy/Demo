package com.betterlifeapps.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.betterlifeapps.demo.ui.theme.DemoTheme
import com.betterlifeapps.std.BaseActivity
import com.betterlifeapps.std.components.feedback.FeedbackActivity
import com.betterlifeapps.std.components.rating.RatingDialogFragment
import com.betterlifeapps.std.ui.composables.UiButton
import com.betterlifeapps.std.ui.composables.VSpacer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        UiButton(text = "Rating", onClick = {
                            RatingDialogFragment.newInstance().show(supportFragmentManager, null)
                        })
                        VSpacer(height = 16)
                        UiButton(text = "Feedback", onClick = {
                            FeedbackActivity.start(this@MainActivity)
                        })
                    }
                }
            }
        }
    }
}