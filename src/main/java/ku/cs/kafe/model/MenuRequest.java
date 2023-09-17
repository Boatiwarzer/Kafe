//6410450206 Puttipong Srina

package ku.cs.kafe.model;


import lombok.Data;


import java.util.UUID;


@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}

