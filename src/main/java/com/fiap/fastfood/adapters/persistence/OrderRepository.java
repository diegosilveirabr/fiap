package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Order;
import com.fiap.fastfood.application.port.outgoing.SaveOrderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OrderRepository implements SaveOrderPort {

    @Autowired
    //TODO: acabei tendo que colocar o autowired porque ele não reconheceu o required args constructor, não sei se eu fiz algo errado
    private SpringDataMongoOrderRepository repository;

    @Override
    public void saveOrder(Order order) {
        repository.save(order);
    }
}
