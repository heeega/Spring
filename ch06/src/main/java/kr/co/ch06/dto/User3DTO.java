package kr.co.ch06.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User3DTO {
    private String uid;
    private String name;
    private String birth;
    private String hp;
    private String addr;


}
