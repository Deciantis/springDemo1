package com.example.demo.model;

import com.example.demo.util.UTCCalendarType;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
//import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.annotations.*;

@Entity
@Table(
        name = "comments_model",
        indexes = {
                @Index(name = "idx_pageId",
                        columnList = "pageId"
                )
        }
)
@TypeDefs({
        @TypeDef(name = "calendarUTC",
                typeClass = UTCCalendarType.class,
                defaultForType = Calendar.class)
})
public class CommentModel implements Serializable{



        @Id
        @Column(length = 36)
        private String id;

        @Version
        private Integer version;

        @Temporal(TemporalType.TIMESTAMP)
        @Type(type = "calendarUTC")
        private Calendar lastModificationDate;

        @Temporal(TemporalType.TIMESTAMP)
        @Type(type = "calendarUTC")
        private Calendar creationDate;

        @Column(length = 32)
        private String pageId;

        @Column(length = 32)
        private String username;

        @Column(length = 32)
        private String emailAddress;

        @Column
        private boolean spam;

}
