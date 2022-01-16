package com.rajitha.app.weatherapp.core

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VM : BaseViewModel, DB : ViewDataBinding>(
    @LayoutRes private val layoutResId: Int,
    viewModelClass: Class<VM>
) : AppCompatActivity() {

    protected lateinit var binding: DB

    val viewModel: VM by lazy {
        ViewModelProvider(this).get(viewModelClass)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId) as DB
        binding.run {
            setVariable(BR.viewModel, viewModel)
            lifecycleOwner = this@BaseActivity
        }
    }

}
