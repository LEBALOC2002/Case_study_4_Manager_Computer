package com.codegym.service.cartItem;
import com.codegym.model.Cart;
import com.codegym.model.CartItem;
import com.codegym.service.IGeneralService;

import java.util.List;
import java.util.Optional;


public interface ICartItemService extends IGeneralService<CartItem> {
    Optional<CartItem> findCartItemByProductId(Long productId);

    List<CartItem> findAllByCart(Cart cart);
}
