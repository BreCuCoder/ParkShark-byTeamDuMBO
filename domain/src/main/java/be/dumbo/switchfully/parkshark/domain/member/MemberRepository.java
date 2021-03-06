package be.dumbo.switchfully.parkshark.domain.member;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Member save(Member member) {
        entityManager.persist(member);
        return member;
    }

}
