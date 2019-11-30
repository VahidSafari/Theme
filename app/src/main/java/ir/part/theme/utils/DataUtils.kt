package ir.part.theme.utils

import android.content.Context
import ir.part.theme.R
import ir.part.theme.view.StudentEntity

fun createStudents(): List<StudentEntity> {
    return ArrayList<StudentEntity>().apply {
        add(
            StudentEntity(
                0,
                R.drawable.image_student_one,
                "Johnson",
                "The fact of a person isn’t the same that the person shows, haply the fact is same that the person can’t show it,if you want to identify a person listen to his unsaid not said."
            )
        )
        add(
            StudentEntity(
                1,
                R.drawable.image_student_two,
                "Jackson",
                "If you don’t design your own life plan, chances are you’ll fall into someone else’s plan. And guess what they have planned for you? Not much."
            )
        )
        add(
            StudentEntity(
                2,
                R.drawable.image_student_three,
                "Kelly",
                "Overrate to your behavior more that your prestige, because behaviors are the sign of your facts but prestige is what others thought about you."
            )
        )
        add(
            StudentEntity(
                3,
                R.drawable.image_student_four,
                "Marshall",
                "Who looses today, won’t find tomorrow There is nothing important as today."
            )
        )
        add(
            StudentEntity(
                4,
                R.drawable.image_student_five,
                "Nicholson",
                "There is an American proverb that says: If you face a problem try to find the solution not the reason"
            )
        )
        add(
            StudentEntity(
                5,
                R.drawable.image_student_six,
                "Roberts",
                "We upwell with our thoughts and rise from the stile of our imagination that we have from ourselves"
            )
        )
        add(
            StudentEntity(
                6,
                R.drawable.image_student_seven,
                "Thomas",
                "When you catch in a calumny, you know your real friends"
            )
        )
    }
}

fun createThemes(context: Context): List<ThemeModel> {
    return ArrayList<ThemeModel>().apply {
        add(
            ThemeModel(
                0,
                R.style.AppThemeLight,
                context.getString(R.string.theme_light),
                R.color.lightColorPrimary,
                R.color.lightTextColor
            )
        )
        add(
            ThemeModel(
                1,
                R.style.AppThemeDark,
                context.getString(R.string.theme_dark),
                R.color.darkColorPrimary,
                R.color.darkTextColor
            )
        )
        add(
            ThemeModel(
                2,
                R.style.AppThemeGreen,
                context.getString(R.string.theme_green),
                R.color.greenColorPrimary,
                R.color.greenTextColor
            )
        )
        add(
            ThemeModel(
                3,
                R.style.AppThemeBlue,
                context.getString(R.string.theme_blue),
                R.color.blueColorPrimary,
                R.color.blueTextColor
            )
        )
    }
}