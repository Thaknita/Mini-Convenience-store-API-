package com.springboot.minimartapi.order.dto;

import com.springboot.minimartapi.user.UserDto;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record OrderDto(
        Long orderNumber,
        Double totalPrice,
        Double vat,
        Double grandTotal,
        UserDto userId,
        String orderStatus,
        LocalDateTime orderDate,
        List<OrderItemDto> orderItemDtoList


) {
}
