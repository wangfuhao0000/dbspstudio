package com.github.wangfuhao0000.dbspstudio.services

import com.intellij.openapi.project.Project
import com.github.wangfuhao0000.dbspstudio.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
