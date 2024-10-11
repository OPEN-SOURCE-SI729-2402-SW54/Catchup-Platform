package pe.upc.catchupplataform.news.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import pe.upc.catchupplataform.news.domain.model.commands.CreateFavoriteSourceCommand;

@Entity
public class FavoriteSource {
    @Id
    @Getter
    private Long id;

    @Getter
    private String sourceId;

    protected FavoriteSource() {}

    public FavoriteSource(CreateFavoriteSourceCommand command) {
        this.sourceId = command.sourceId();
    }
}
