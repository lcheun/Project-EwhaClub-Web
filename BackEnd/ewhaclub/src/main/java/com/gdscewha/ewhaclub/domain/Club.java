package com.gdscewha.ewhaclub.domain;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "club_id")
    private Long id;

    @Column(nullable = false)
    private Long category_id;

    @Column(nullable = false, length = 45)
    private String name;

    @Column(nullable = false, length = 45)
    private String engName;

    @Column(nullable = false, length = 255)
    private String short_description;

    @Column(nullable = false, length = 255)
    private String detail_description;

    @Column(nullable = false, length = 255)
    private String detail_activity;

    @Column(nullable = false)
    private LocalDateTime recruit_start;

    @Column(nullable = false)
    private LocalDateTime recruit_end;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean is_recruiting;

    @Column(nullable = false, length = 255)
    private String recruit_requirement;

    @Column(nullable = false, length = 255)
    private String how_to_apply;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Long view_cnt;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String main_img_url;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String poster_img_url;

    @Column(columnDefinition = "TEXT")
    private String insta_url;

    @Column(columnDefinition = "TEXT")
    private String facebook_url;

    @Column(columnDefinition = "TEXT")
    private String youtube_url;

    public void updateView(){
        Long view = this.getView_cnt();
        view++;
        this.setView_cnt(view);
    }
}
