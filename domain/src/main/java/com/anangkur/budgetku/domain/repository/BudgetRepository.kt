package com.anangkur.budgetku.domain.repository

import com.anangkur.budgetku.domain.BaseFirebaseListener
import com.anangkur.budgetku.domain.model.budget.Category
import com.anangkur.budgetku.domain.model.budget.CategoryProject
import com.anangkur.budgetku.domain.model.budget.Project
import com.anangkur.budgetku.domain.model.budget.Spend

interface BudgetRepository {
    fun createProject(
        idProject: String?,
        title: String,
        startDate: String,
        endDate: String,
        category: List<CategoryProject>,
        listener: BaseFirebaseListener<Boolean>
    )

    fun getCategory(
        listener: BaseFirebaseListener<List<Category>>
    )

    fun getProject(
        listener: BaseFirebaseListener<List<Project>>
    )

    fun createSpend(
        spend: Spend,
        listener: BaseFirebaseListener<Boolean>
    )

    fun getListSpend(
        idProject: String,
        idCategory: String?,
        listener: BaseFirebaseListener<List<Spend>>
    )

    fun getProjectDetail(
        projectId: String,
        listener: BaseFirebaseListener<Project>
    )

    fun deleteProject(
        projectId: String,
        listener: BaseFirebaseListener<Boolean>
    )
}