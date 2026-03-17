package navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {

    val screens = listOf(
        Screen.Home,
        Screen.Profile,
        Screen.Settings
    )

    NavigationBar {

        screens.forEach { screen ->

            NavigationBarItem(
                selected = false,
                onClick = {
                    navController.navigate(screen.route)
                },
                icon = {
                    Icon(screen.icon, contentDescription = screen.title)
                },
                label = {
                    Text(screen.title)
                }
            )
        }
    }
}