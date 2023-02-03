package com.example.demo2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "form")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String yegan ;
    @JoinColumn(name = "role_group")
    private String roleGroup ;
    private String title ;
    @JoinColumn(name = "is_exclusive")
    private int isExclusive ;


}
