
package com.mytarget.premium

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ScrollView

class MainActivity : Activity() {

    private val bg = Color.rgb(8, 17, 31)
    private val card = Color.rgb(20, 36, 57)
    private val gold = Color.rgb(220, 183, 105)
    private val white = Color.WHITE
    private val muted = Color.rgb(177, 194, 215)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showHome()
    }

    private fun showHome() {
        val scroll = ScrollView(this)
        scroll.setBackgroundColor(bg)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(22, 28, 22, 28)
        scroll.addView(root)

        val title = TextView(this)
        title.text = "♛  MY TARGET"
        title.textSize = 29f
        title.setTextColor(gold)
        title.typeface = Typeface.DEFAULT_BOLD
        root.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "PREMIUM STUDENT EDITION"
        subtitle.textSize = 12f
        subtitle.setTextColor(muted)
        subtitle.setPadding(0, 5, 0, 24)
        root.addView(subtitle)

        addCard(root, "🎯  YOUR DREAM", "JEE MAIN 2027\nCountdown date will be set after official announcement")
        addCard(root, "📚  DAILY PLANNER", "Set today's chapters and question targets.")
        addCard(root, "⏱  FOCUS TIMER", "Track study sessions and daily study hours.")
        addCard(root, "📈  JEE PROGRESS", "Physics  •  Chemistry  •  Mathematics")
        addCard(root, "📝  MOCK TESTS", "Record scores, accuracy and mistakes.")
        addCard(root, "❤️  MY INSPIRATION", "Your family photos and motivation.")
        addCard(root, "🔔  REMINDERS", "Plan study and revision reminders.")
        addCard(root, "🔐  PRIVACY & BACKUP", "PIN lock and data backup options.")

        val footer = TextView(this)
        footer.text = "\nDISCIPLINE BUILDS YOUR DREAM"
        footer.gravity = Gravity.CENTER
        footer.textSize = 14f
        footer.setTextColor(gold)
        footer.setPadding(0, 20, 0, 20)
        root.addView(footer)

        setContentView(scroll)
    }

    private fun addCard(
        root: LinearLayout,
        heading: String,
        description: String
    ) {
        val box = LinearLayout(this)
        box.orientation = LinearLayout.VERTICAL
        box.setPadding(18, 17, 18, 17)
        box.setBackgroundColor(card)

        val title = TextView(this)
        title.text = heading
        title.textSize = 18f
        title.setTextColor(gold)
        title.typeface = Typeface.DEFAULT_BOLD
        box.addView(title)

        val detail = TextView(this)
        detail.text = description
        detail.textSize = 14f
        detail.setTextColor(white)
        detail.setPadding(0, 8, 0, 0)
        box.addView(detail)

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.bottomMargin = 14
        root.addView(box, params)
    }
}
