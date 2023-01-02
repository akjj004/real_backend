package com.develop.realest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Getter
@Setter

public class Images
{
    @Id
    private String id;
    private String title;
    private String url;

    public Images(String title, String url) {
        this.title = title;
        this.url = url;
    }
}

