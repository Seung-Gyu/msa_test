package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileName;
    private Long fileSize;
    private Boolean isCreated;
    private Boolean isIndexed;
    private String videoUrl;
    private Boolean isUploaded;
}
