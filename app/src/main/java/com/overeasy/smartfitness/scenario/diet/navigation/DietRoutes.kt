package com.overeasy.smartfitness.scenario.diet.navigation

sealed class DietRoutes(val route: String) {
    data object Diet : DietRoutes("diet")
    data object DietResult : DietRoutes(
        route = "result?" +
                "user_menu={user_menu}"
    ) {
        const val USER_MENU = "user_menu"

        fun createRoute(
            userMenu: String
        ) = route
            .replace("{${USER_MENU}}", userMenu)
    }
    /*

    data object DiaryDetail : DiaryRoutes(
        route = "diary_detail?" +
                "note_id={note_id}&" +
                "date={date}"
    ) {
        const val NOTE_ID = "note_id"
        const val DATE = "date"

        fun createRoute(
            noteId: Int,
            date: String
        ) = route
            .replace("{${NOTE_ID}}", noteId.toString())
            .replace("{${DATE}}", date)
    }
     */
}