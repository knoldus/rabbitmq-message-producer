package com.knoldus.rabbitMQ.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class FeedLike {


    private int feedLikeId;

    private String email;

    private boolean likes;

    private boolean dislike;


}
