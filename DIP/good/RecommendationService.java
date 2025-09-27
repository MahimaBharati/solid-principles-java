public class RecommendationService {
    RecommendationStrategy strategy;
    public RecommendationService(RecommendationStrategy strategy) {
        this.strategy=strategy;
    }

    public void showRecommendations() {
        strategy.recommend();
    }
}
