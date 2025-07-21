package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val tasks = mutableListOf(
        TaskManager("wash dishes", false), TaskManager("Walk", true)
    )
    tasks.add(TaskManager("get shower", true))
    //for loop to iterate throw the tasks
    for (task in tasks){
        if (task.isDone)
            println("✅ ${task.title}")
        else
            println("❌ ${task.title}")
    }
}