package com.affirm.markdownparser

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val markdown =
  "Some text is **bold**. While some text is _italic_. Other is __underlined__. Lastly we have [link](http://google.com)."

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    testParser()
  }

  private fun testParser() {
    val textView = findViewById<TextView>(R.id.text_view)
    val button = findViewById<TextView>(R.id.button)
    val result = parse(markdown)
    textView.renderMarkdown(markdown)
    button.renderMarkdown(markdown)
  }
}
