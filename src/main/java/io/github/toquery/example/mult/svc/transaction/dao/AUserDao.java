package io.github.toquery.example.mult.svc.transaction.dao;

import io.github.toquery.example.mult.svc.transaction.entity.UserA;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface AUserDao extends CrudRepository<UserA, Integer> {
}
