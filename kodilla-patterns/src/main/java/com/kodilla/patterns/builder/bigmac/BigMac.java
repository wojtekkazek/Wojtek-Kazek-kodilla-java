package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public static final String WITHSESAME = "with sesame";
        public static final String NOSESAME = "no sesame";

        public BigMacBuilder bun(String bun) {
            if (bun.equals(WITHSESAME) || bun.equals(NOSESAME)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun should be WITHSESAME or NOSESAME!");
            }
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public static final String STANDARD = "standard";
        public static final String ISLANDS1000 = "1000 islands";
        public static final String BARBECUE = "BARBECUE";

        public BigMacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(ISLANDS1000) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
            }
            return this;
        }

        public static final String SALAD = "salad";
        public static final String ONION = "onion";
        public static final String BECON = "becon";
        public static final String CHILLI = "chili";
        public static final String MUSHROOMS = "mushrooms";
        public static final String PRAWNS = "prawns";
        public static final String CHEESE = "cheese";

        public BigMacBuilder ingredient(String ingredient) {
            if (ingredient.equals(SALAD) || ingredient.equals(ONION) || ingredient.equals(BECON) ||
                    ingredient.equals(CHILLI) || ingredient.equals(MUSHROOMS) || ingredient.equals(PRAWNS) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
