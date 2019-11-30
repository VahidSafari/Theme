package ir.part.theme.utils

import android.content.Context
import android.content.SharedPreferences
import ir.part.theme.R

class Theme(context: Context) {

    // Prefs
    var sharedPreferences: SharedPreferences

    // Constants
    private val prefsName = "theme"
    private val themeName = "themeName"
    val themeChanged = "themeChanged"

    var themes: List<ThemeModel>

    init {
        sharedPreferences = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
        themes = createThemes(context)
    }

    fun getTheme(): Int {
        return sharedPreferences.getInt(themeName, themes[0].theme)
    }

    fun setTheme(theme: Int) {
        sharedPreferences.edit().putInt(themeName, theme).apply()
    }
}
