package com.sinaukoding.perpustakaan.dao;

import com.sinaukoding.perpustakaan.entity.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class BookDAO extends BaseDAO<Book> {
    @Override
    public List<Predicate> predicates(Book param, CriteriaBuilder builder, Root<Book> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        if(param != null){

            if(param.getTitle() != null){
                predicates.add(builder.like(root.get("title"),"%"+ param.getTitle() +"%"));
            }

            if(param.getPublisher() != null){
                predicates.add(builder.like(root.get("publisher"),"%"+ param.getPublisher() +"%"));
            }
        }

        return  predicates;
    }
}
