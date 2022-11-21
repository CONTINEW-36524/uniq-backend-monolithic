package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.dto.ResultDTO;
import com.continew.uniqbackend.entity.Question;
import com.continew.uniqbackend.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResultRepository extends JpaRepository<Question, String> {

//    @Query(value = "(select * from question left join respond on question.id_question = respond.rid_question where question.qid_survey = :surid) ", nativeQuery = true)
//    public List<ResultDTO> getResult(@Param(value = "surid") int surid);

    @Query(value =  "select A.title, count(A.sub_question) as cnt, A.type, A.answer, A.sub_question " +
                    "from (select * " +
                            "from question left join contents on question.id_question = contents.cid_question " +
                            "left join respond on contents.sub_question = respond.answer " +
                            "where question.qid_survey = :surid) A " +
                    "group by A.title, A.sub_question, A.type, A.answer " +
                    "order by min(A.id_question) asc min(A.id_mult) asc"

                    , nativeQuery = true)
    public List<ResultDTO> getResultlist(@Param(value = "surid") int surid);

}