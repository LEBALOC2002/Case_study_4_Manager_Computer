package com.codegym.service.cart;
import com.codegym.model.Cart;
import com.codegym.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CartServiceImpl implements ICartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public Cart getById(Long id) {
        return null;
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Optional<Cart> findCartByCreatedBy(String createdBy) {
        return cartRepository.findCartByCreatedBy(createdBy);
    }
}
