import SwiftUI
import shared

let markdown = "Some text is **bold**. While some text is _italic_. Other is __underlined__. Lastly we have [link](http://google.com)."

func greet() -> String {
    return Greeting().greeting()
}

struct ContentView: View {
    var body: some View {
        Text(greet())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
