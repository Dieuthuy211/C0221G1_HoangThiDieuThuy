package com.example.model.repository.impl;

import com.example.model.bean.Comment;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class CommentRepositoryImpl implements ICommentRepository {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Comment> findAll() {
        String queryStr = "SELECT c FROM Comment AS c";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findOne(int id) {
        String queryStr = "SELECT c FROM Comment AS c WHERE c.id = :id";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public Comment addComment(Comment comment) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Comment origin = new Comment();
            origin.setAuthor(comment.getAuthor());
            origin.setFeedback(comment.getFeedback());
            session.save(origin);
            transaction.commit();
            return origin;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public void addLike(Comment comment) {
        Session session = null;
        Transaction transaction = null;
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        comment.setLike(comment.getLike()+1);
        String queryStr="update Comment set like=:newLike where id=:id";
        Query query=session.createQuery(queryStr);
        query.setParameter("newLike",comment.getLike());
        query.setParameter("id",comment.getId());
        query.executeUpdate();
        transaction.commit();
        session.clear();
        session.close();

    }

    @Override
    public void addDislike(Comment comment) {
        Session session = null;
        Transaction transaction = null;
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        comment.setLike(comment.getLike()-1);
        String queryStr="update Comment set like=:newLike where id=:id";
        Query query=session.createQuery(queryStr);
        query.setParameter("newLike",comment.getLike());
        query.setParameter("id",comment.getId());
        query.executeUpdate();
        transaction.commit();
        session.clear();
        session.close();
    }

}
