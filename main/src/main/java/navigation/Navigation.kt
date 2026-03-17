package navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*

@Composable
fun MainNavigation() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBar(navController)
        }
    ) { padding ->

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(padding)
        ) {

            composable(Screen.Home.route) {
                Text("Home Screen")
            }

            composable(Screen.Profile.route) {
                Text("Profile Screen")
            }

            composable(Screen.Settings.route) {
                Text("Settings Screen")
            }

        }
    }
}