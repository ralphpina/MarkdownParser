package com.affirm.markdownparser

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

fun TextView.renderMarkdown(copy: String) {
    text = parse(copy).toSpannableStringBuilder()
}

fun Button.renderMarkdown(copy: String) {
    text = parse(copy).toSpannableStringBuilder()
}

private fun Result.toSpannableStringBuilder(): SpannableStringBuilder {
    val sb = SpannableStringBuilder(copy)
    for (entity in entities) {
        when (entity) {
            is Entity.Bold -> sb.setBoldSpan(entity.start, entity.end)
            is Entity.Underline -> sb.setUnderlineSpan(entity.start, entity.end)
            is Entity.Italic -> sb.setItalicSpan(entity.start, entity.end)
            is Entity.Hyperlink -> sb.setHyperlinkSpan(entity.start, entity.end, entity.url)
        }
    }
    return sb
}

private fun SpannableStringBuilder.setBoldSpan(start: Int, end: Int) =
    setSpan(StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

private fun SpannableStringBuilder.setUnderlineSpan(start: Int, end: Int) =
    setSpan(UnderlineSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

private fun SpannableStringBuilder.setItalicSpan(start: Int, end: Int) =
    setSpan(StyleSpan(Typeface.ITALIC), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

private fun SpannableStringBuilder.setHyperlinkSpan(start: Int, end: Int, url: String) {
    Log.e("MainActivity", "setting hyperlink url = $url")
    val clickable: ClickableSpan = object : ClickableSpan() {
        override fun onClick(view: View) {
            Log.e("MainActivity", "url = $url")
        }
    }
    setSpan(clickable, start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
}