package edu.icet.model;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String id;
    private Date date;
    private String customerId;
}
