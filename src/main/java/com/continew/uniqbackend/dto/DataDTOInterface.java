package com.continew.uniqbackend.dto;

import java.util.List;

public interface DataDTOInterface {

    String getDid();
    String getType();
     String getTitle() ;
     Integer getSurvey_id() ;
   List<Content> getContent();

}
