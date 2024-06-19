package com.example.todo_friend.service;

import com.example.todo_friend.global.entity.RequestList;
import reactor.core.publisher.Mono;

public interface RequestListService {
    Mono<RequestList> respondToRequest(Long id);
    Mono<Void> deleteRequest(Long id);
}
