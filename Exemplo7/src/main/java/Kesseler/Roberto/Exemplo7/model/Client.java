package Kesseler.Roberto.Exemplo7.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Classe cliente!");
    }

}
