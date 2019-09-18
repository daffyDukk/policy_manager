package rule.engine;

public class RuleEngineFactory {

    public static RuleEngine newInstance(String engine, RuleEngineConfig config) {
        if ("jeasy".equals(engine)) {
            return new JEasyRuleEngine(config);
        } else {
            throw new IllegalArgumentException("Unknown rule engine \"" + engine + "\"!");
        }
    }
}


