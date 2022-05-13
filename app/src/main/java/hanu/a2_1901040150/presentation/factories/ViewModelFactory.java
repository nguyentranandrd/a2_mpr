package hanu.a2_1901040150.presentation.factories;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import hanu.a2_1901040150.App;
import hanu.a2_1901040150.domain.ProductRepository;
import hanu.a2_1901040150.presentation.modules.cart.CartViewModel;
import hanu.a2_1901040150.presentation.modules.main.MainViewModel;


public class ViewModelFactory implements ViewModelProvider.Factory {
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        ViewModel viewModel = null;
        if (MainViewModel.class.equals(modelClass)) {
            ProductRepository productRepository = App.getInstance().getSingletonModules().getCartRepository();
            viewModel = new MainViewModel(productRepository);
        } else if (CartViewModel.class.equals(modelClass)) {
            ProductRepository productRepository = App.getInstance().getSingletonModules().getCartRepository();
            viewModel = new CartViewModel(productRepository);
        }
        return (T) viewModel;
    }
}
