package com.careerit.lsdj.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public class UserRequestService {

    private static final Map<Long, String> userMap = Map.of(1001L, "Krish", 1002L, "Manoj", 1003L, "Charan");
    private static final List<Long> userIds = userMap.keySet().stream().toList();

    public static String getUserName(long id) {
        return userMap.getOrDefault(id, "");
    }

    public static long getRandomUser() {
        int count = userMap.size();
        int randomInt = ThreadLocalRandom.current().nextInt(0, count);
        return userIds.get(randomInt);
    }

}
