package com.careerdevs.fullstacknasav1.repos;

import com.careerdevs.fullstacknasav1.custom.CustomCommentResult;
import com.careerdevs.fullstacknasav1.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    /*
    Select child nodes from a parent node
     */
    @Query("SELECT NEW  com.careerdevs.fullstacknasav1.custom.CustomCommentResult(c.id, c.name, c.content, c.parent_id)" +
            "FROM Comment as c WHERE parent_id = :parent_id")
    public List<CustomCommentResult> findByParent(@Param("parent_id") Long parent_id);
}