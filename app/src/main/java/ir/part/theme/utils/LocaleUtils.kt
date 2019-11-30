package ir.part.theme.utils

import android.content.Context
import java.util.*

fun localizedContext(baseContext: Context, locale: Locale = Locale("en")): Context {
    val configuration = baseContext.resources.configuration
    configuration.setLocale(locale)
    return baseContext.createConfigurationContext(configuration)
}