/*
 * This file is generated by jOOQ.
*/
package com.wei.jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book implements Serializable {

    private static final long serialVersionUID = -862690062;

    private Integer id;
    private Integer authorId;
    private String  title;
    private Integer publishedIn;
    private Integer languageId;

    public Book() {}

    public Book(Book value) {
        this.id = value.id;
        this.authorId = value.authorId;
        this.title = value.title;
        this.publishedIn = value.publishedIn;
        this.languageId = value.languageId;
    }

    public Book(
        Integer id,
        Integer authorId,
        String  title,
        Integer publishedIn,
        Integer languageId
    ) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.publishedIn = publishedIn;
        this.languageId = languageId;
    }

    public Integer getId() {
        return this.id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }

    public Book setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getPublishedIn() {
        return this.publishedIn;
    }

    public Book setPublishedIn(Integer publishedIn) {
        this.publishedIn = publishedIn;
        return this;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public Book setLanguageId(Integer languageId) {
        this.languageId = languageId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(authorId);
        sb.append(", ").append(title);
        sb.append(", ").append(publishedIn);
        sb.append(", ").append(languageId);

        sb.append(")");
        return sb.toString();
    }
}