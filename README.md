MarkdownParser
---

This is a simple POC to parse a subset of markdown and render it in `TextViews` and `Buttons`.

This POC tries to handle the following markdown styles:

- bold: `**bold**`
- underline: `__underline__`
- italic: `_italic_`
- hyperlink: `[link text](http://google.com)`

The logic is divided into two classes:
- [MarkdownParser.kt](/app/src/main/java/com/affirm/markdownparser/MarkdownParser.kt): exposes a parse() method that returns the copy and a list of entities.
- [AndroidMarkdownRenderer.kt](/app/src/main/java/com/affirm/markdownparser/AndroidMarkdownRenderer.kt): exposes a couple of extension methods to add markdown to a `TextView` and `Button`.

Thus, the following copy: `"Some text is **bold**. While some text is _italic_. Other is __underlined__. Lastly we have [link](http://google.com)."`

Is rendered like so:
![screenshot](imgs/sample.png)