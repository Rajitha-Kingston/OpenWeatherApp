package com.rajitha.app.weatherapp.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

abstract class BaseFragment<VM : BaseViewModel, DB : ViewDataBinding>(
    @LayoutRes private val layoutResId: Int,
    viewModelClass: Class<VM>
) : Fragment() {

    abstract val it: Any
    protected lateinit var binding: DB
        private set

    open fun init() {}

    protected val viewModel: VM by lazy {
        ViewModelProvider(this).get(viewModelClass)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        binding.run {
            setVariable(BR.viewModel, viewModel)
            lifecycleOwner = viewLifecycleOwner
        }
        init()
        return binding.root
    }

    open fun refresh() {}

    open fun navigate(action: Int) {
        view?.let { _view ->
            Navigation.findNavController(_view).navigate(action)
        }
    }

    abstract fun initForecastAdapter()
}
