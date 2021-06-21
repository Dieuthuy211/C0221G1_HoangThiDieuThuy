package com.example.model.repository;

import com.example.model.entity.Comment;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CommentRepositoryImpl implements ICommentRepository {

    @Override
    public List<Comment> findAll() {
//        String queryStr = "SELECT c FROM Comment c";
//        TypedQuery<Comment> query =BaseRepository.entityManager.createQuery(queryStr, Comment.class);
//        return query.getResultList();
  return BaseRepository.entityManager.createQuery(
          "select c from comment c",Comment.class).getResultList();
    }

    @Override
    public Comment findOne(int id) {
        return BaseRepository.entityManager.find(Comment.class,id);
    }

    @Override
    public void addComment(Comment comment) {
        EntityTransaction entityTransaction=BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();
    }

    @Override
    public void addLike(Comment comment) {
        EntityTransaction entityTransaction=BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(comment);
        entityTransaction.commit();



    }

//    @Override
//    public void addDislike(Comment comment) {
//        Session session = null;
//        Transaction transaction = null;
//        session=sessionFactory.openSession();
//        transaction=session.beginTransaction();
//        comment.setLike(comment.getLike()-1);
//        String queryStr="update Comment set like=:newLike where id=:id";
//        Query query=session.createQuery(queryStr);
//        query.setParameter("newLike",comment.getLike());
//        query.setParameter("id",comment.getId());
//        query.executeUpdate();
//        transaction.commit();
//        session.clear();
//        session.close();
//    }

}
