package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.BaseEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseCrudRepository <T extends BaseEntity,ID> extends JpaRepository<T,ID> {

        @Override
        @Query("select e from #{#entityName} e where e.deleted = false")
        List<T> findAll();

        @Override
        @Query("select e from #{#entityName} e where e.id = ?1 and e.deleted = false")
        Optional<T> findById(ID id);

        @Override
        @Query("select e from #{#entityName} e where e.id in ?1 and e.deleted = false")
        List<T> findAllById(Iterable<ID> ids);

        @Override
        @Query("select count(e) from #{#entityName} e where e.deleted = false")
        long count();

        @Override
        @Query("update #{#entityName} e set e.deleted = true where e.id= ?1")
        @Modifying
        @Transactional
        void deleteById(ID id);
}
