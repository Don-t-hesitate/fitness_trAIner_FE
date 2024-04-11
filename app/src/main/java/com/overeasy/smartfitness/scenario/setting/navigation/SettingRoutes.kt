package com.overeasy.smartfitness.scenario.setting.navigation

import com.overeasy.smartfitness.scenario.diary.navigation.DiaryRoutes

sealed class SettingRoutes(val route: String) {
    data object Setting : SettingRoutes("setting")
    data object MyInfo : SettingRoutes("myInfo")
    data object Login : SettingRoutes("login")
    data object Logout : SettingRoutes("logout")
    data object Register : SettingRoutes("register")
    data object Withdraw : SettingRoutes("withdraw")
}