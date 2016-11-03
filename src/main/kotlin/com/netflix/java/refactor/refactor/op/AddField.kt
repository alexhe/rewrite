package com.netflix.java.refactor.refactor.op

import com.netflix.java.refactor.ast.AstTransform
import com.netflix.java.refactor.ast.Tr
import com.netflix.java.refactor.refactor.RefactorVisitor

class AddField(val target: Tr.ClassDecl, val clazz: String, val name: String, val init: String?): RefactorVisitor() {

    override fun visitClassDecl(classDecl: Tr.ClassDecl): List<AstTransform<*>> =
        if(classDecl === target) {
            TODO()
        }
        else super.visitClassDecl(classDecl)
}