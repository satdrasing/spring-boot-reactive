package io.satendra.reactivedemo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hello")
public class HelloDocument {

    @Id
    private Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloDocument{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
