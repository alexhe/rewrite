package com.netflix.java.refactor.refactor.op

import com.netflix.java.refactor.ast.AstTransform
import com.netflix.java.refactor.ast.Tr
import com.netflix.java.refactor.refactor.RefactorVisitor

data class DeleteField(val cu: Tr.CompilationUnit, val decls: Tr.VariableDecls) : RefactorVisitor() {

    override fun visitMultiVariable(multiVariable: Tr.VariableDecls): List<AstTransform<*>> =
        if(multiVariable === decls) {
            listOf(AstTransform<Tr.Block<*>>(cursor().parent()) {
                it.copy(statements = it.statements - decls)
            })
        } else emptyList()
}