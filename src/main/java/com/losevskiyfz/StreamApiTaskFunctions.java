package com.losevskiyfz;

import com.losevskiyfz.domain.Order;
import com.losevskiyfz.domain.User;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTaskFunctions {

    List<Long> usersToIds(List<User> users){
        return users.stream()
                .map(User::getId)
                .collect(Collectors.toList());
    }

    List<User> filterUsersWithoutOrders(List<User> users){
        return users.stream()
                .filter(user -> user.getOrders().isEmpty())
                .collect(Collectors.toList());
    }

    List<Order> getAndSortAllOrdersOfUsers(List<User> users){
        return users.stream()
                .map(User::getOrders)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Order::getPrice))
                .collect(Collectors.toList());
    }

    boolean checkIfOrdersAreExpensive(User user, int minPrice){
        return user.getOrders().stream()
                .allMatch(order -> order.getPrice() > minPrice);
    }

    boolean hasAnyExpensiveOrder(User user, int minPrice){
        return user.getOrders().stream()
                .anyMatch(order -> order.getPrice() > minPrice);
    }

    Map<Integer, List<Order>> groupOrdersByPrice(List<Order> orders){
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getPrice));
    }

    void filterSimilarAddressesAndPrint(List<User> users){
        users.stream()
                .map(User::getDeliveryAddresses)
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);
    }

    int getTheMostExpensiveOrderPrice(List<Order> orders){
        return orders.stream()
                .map(Order::getPrice)
                .max(Integer::compareTo)
                .orElseThrow();
    }

    Order getTheMostExpensiveOrder(List<Order> orders){
        return orders.stream()
                .max(Comparator.comparingInt(Order::getPrice))
                .orElseThrow();
    }

    int getAveragePriceOfOrders(List<Order> orders){
        return orders.stream()
                .collect(Collectors.averagingInt(Order::getPrice))
                .intValue();
    }

}