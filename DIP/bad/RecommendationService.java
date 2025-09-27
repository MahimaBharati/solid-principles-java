public class RecommendationService {
    void showRecommendations() {
        TrendingRecommendation trendingRecommendations = new TrendingRecommendation();
        trendingRecommendations.recommend();
        GenreRecommendation genreRecommendations = new GenreRecommendation();
        genreRecommendations.recommend();
        RecentRecommendation recentRecommendations = new RecentRecommendation();
        recentRecommendations.recommend();
    }
}
