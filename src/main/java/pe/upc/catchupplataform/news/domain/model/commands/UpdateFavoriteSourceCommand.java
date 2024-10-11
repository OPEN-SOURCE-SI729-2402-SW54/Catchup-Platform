package pe.upc.catchupplataform.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(long id, String newsApiKey, String sourceId) {
}
