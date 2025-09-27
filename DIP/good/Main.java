public class Main {
    public static void main(String[] args) {
        RecommendationService recentRecommendations = new RecommendationService(new RecentRecommendation());
        recentRecommendations.showRecommendations();
        RecommendationService trendingRecommendations = new RecommendationService(new TrendingRecommendation());
        trendingRecommendations.showRecommendations();
        RecommendationService genreRecommendations = new RecommendationService(new GenreRecommendation());
        genreRecommendations.showRecommendations();
    }
}
