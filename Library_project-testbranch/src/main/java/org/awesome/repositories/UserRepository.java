package org.awesome.repositories;

import com.querydsl.core.BooleanBuilder;
import org.awesome.entities.QUser;
import org.awesome.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<User, Long>, QuerydslPredicateExecutor {
    User findByUserId(String userId);

    default boolean isUserExists(String userId) {
        BooleanBuilder builder = new BooleanBuilder();
        QUser user = QUser.user;
        builder.and(user.userId.eq(userId));
        long cnt = count(builder);
        return cnt > 0;
    }

}
