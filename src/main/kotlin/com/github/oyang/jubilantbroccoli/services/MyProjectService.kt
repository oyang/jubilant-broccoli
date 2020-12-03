package com.github.oyang.jubilantbroccoli.services

import com.intellij.openapi.project.Project
import com.github.oyang.jubilantbroccoli.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
