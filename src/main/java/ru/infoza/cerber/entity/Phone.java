package ru.infoza.cerber.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "phones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {
    public Phone(String number, String remark) {
        this.number = number;
        this.remark = remark;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String number;
    private String remark;
}
