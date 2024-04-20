package com.losevskiyfz.service;

import com.losevskiyfz.domain.Order;
import com.losevskiyfz.domain.User;

import java.util.List;
import java.util.Map;

public class TaskFunctionsService {

    List<Long> usersToIds(List<User> users){
        return null;
    }

    List<User> filterUsersWithoutOrders(List<User> users){
        return null;
    }

    List<Order> getAndSortAllOrdersOfUsers(List<User> users){
        return null;
    }

    boolean checkIfOrdersAreExpensive(User user, int minPrice){
        return false;
    }

    boolean hasAnyExpensiveOrder(User user, int minPrice){
        return false;
    }

    Map<Integer, List<Order>> groupOrdersByPrice(List<Order> orders){
        return null;
    }

    void filterSimilarAddressesAndPrint(List<User> users){

    }

    int getTheMostExpensiveOrderPrice(List<Order> orders){
        return 0;
    }

    Order getTheMostExpensiveOrder(List<Order> orders){
        return null;
    }

    int getAveragePriceOfOrders(List<Order> orders){
        return 0;
    }

}
