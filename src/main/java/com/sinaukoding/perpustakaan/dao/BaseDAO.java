package com.sinaukoding.perpustakaan.dao;

import com.sinaukoding.perpustakaan.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.criterion.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import java.lang.reflect.ParameterizedType;
import java.util.List;


@SuppressWarnings({"uncheckec","ConstanConditions"})
public class BaseDAO<T extends BaseEntity<T>> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> type;

    {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public <I> I singleResult(CriteriaQuery<I> query, List<Predicate> predicates){
        try{
            query.where()
        }
    }


}
