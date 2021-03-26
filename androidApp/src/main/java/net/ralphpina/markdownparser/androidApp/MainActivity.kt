package net.ralphpina.markdownparser.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import net.ralphpina.markdownparser.shared.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

const val markdown =
    "Some text is **bold**. While some text is _italic_. Other is __underlined__. Lastly we have [link](http://google.com)."

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testParser()
//        val tv: TextView = findViewById(R.id.text_view)
//        tv.text = greet()
    }

    private fun testParser() {
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        textView.renderMarkdown(markdown)
        button.renderMarkdown(markdown)
    }
}
