package com.anangkur.budgetku.budget.view.addProject

import android.view.LayoutInflater
import android.view.ViewGroup
import com.anangkur.budgetku.base.BaseAdapter
import com.anangkur.budgetku.budget.databinding.ItemCategoryProjectBinding
import com.anangkur.budgetku.budget.model.CategoryProjectUiModel
import com.anangkur.budgetku.utils.currencyFormatToRupiah
import com.anangkur.budgetku.utils.setImageUrl

class CategoryProjectAdapter : BaseAdapter<ItemCategoryProjectBinding, CategoryProjectUiModel>() {

    override fun bindView(parent: ViewGroup): ItemCategoryProjectBinding {
        return ItemCategoryProjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun bind(
        data: CategoryProjectUiModel,
        itemView: ItemCategoryProjectBinding,
        position: Int
    ) {
        itemView.apply {
            tvSpendCategory.text = data.title
            ivSpend.setImageUrl(data.image)
            tvBudget.text = data.value.currencyFormatToRupiah()
        }
    }

}