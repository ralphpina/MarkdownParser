package com.affirm.markdownparser

import android.os.Bundle
import android.widget.Button
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
    val button = findViewById<Button>(R.id.button)
    textView.renderMarkdown(markdown)
    button.renderMarkdown(markdown)
  }
}
