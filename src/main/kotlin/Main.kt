import javafx.collections.ObservableList
import tornadofx.*

class HelloWorld : View() {
    override val root = hbox {
        label("Hello world")
        treeview {

        }
    }
}

class HelloWorldApp : App(HelloWorld::class)

fun main() {
    launch<HelloWorldApp>()
}

class Node(val title:String){
    val children : ObservableList<Node> = observableList()
}