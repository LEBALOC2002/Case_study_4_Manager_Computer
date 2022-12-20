package com.codegym.service.cart;

import com.codegym.model.Cart;
import com.codegym.model.CartItem;
import com.codegym.service.IGeneralService;

import java.util.Optional;

public interface ICartService extends IGeneralService<Cart> {

    Optional<Cart> findCartByCreatedBy(String createdBy);
}
