package HW_2;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(Actor actors);

    void update(Actor actor);
}