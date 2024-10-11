package pe.upc.catchupplataform.news.domain.model.commands;

public record CreateFavoriteSourceCommand(String newsApiKey, String sourceId) {
}
