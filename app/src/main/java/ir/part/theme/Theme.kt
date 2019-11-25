package ir.part.theme

import android.content.Context

object Theme {

    private const val PrefsName = "Theme"
    private const val ThemeName = "ThemeName"

    const val THEME_LIGHT = "Light"
    const val THEME_DARK = "Dark"
    const val THEME_GREEN = "Green"
    const val THEME_BLUE = "Blue"

    fun getTheme(context: Context): Int {
        val themeSaved =
            context
                .getSharedPreferences(
                    PrefsName,
                    Context.MODE_PRIVATE
                )
                .getString(
                    ThemeName,
                    ""
                )
        return when (themeSaved) {
            THEME_LIGHT -> R.style.AppThemeLight
            THEME_DARK -> R.style.AppThemeDark
            THEME_GREEN -> R.style.AppThemeGreen
            THEME_BLUE -> R.style.AppThemeBlue
            else -> R.style.AppThemeLight
        }
    }

    fun setTheme(context: Context, themeName: String) {
        context.getSharedPreferences(
            PrefsName,
            Context.MODE_PRIVATE
        )
            .edit()
            .putString(ThemeName, themeName)
            .apply()
    }
}