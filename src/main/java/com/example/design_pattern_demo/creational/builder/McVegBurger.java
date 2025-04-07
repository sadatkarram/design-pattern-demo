package com.example.design_pattern_demo.creational.builder;

public class McVegBurger {
    // Class attribute
    private boolean isPattyRequired;
    private boolean isCheeseRequired;
    private boolean isToppingsRequired;
    private boolean isSaucesRequired;
    private boolean isSpicy;

    // Static Builder class with same attributes
    public static class Builder{
        private boolean isPattyRequired = true;
        private boolean isCheeseRequired = true;
        private boolean isToppingsRequired = true;
        private boolean isSaucesRequired = true;
        private boolean isSpicy = false;

        public Builder isPattyRequired(boolean isPattyRequired) {
            this.isPattyRequired = isPattyRequired;
            return this;
        }

        public Builder isCheeseRequired(boolean isCheeseRequired) {
            this.isCheeseRequired = isCheeseRequired;
            return this;
        }

        public Builder isToppingsRequired(boolean isToppingsRequired) {
            this.isToppingsRequired = isToppingsRequired;
            return this;
        }

        public Builder isSaucesRequired(boolean isSaucesRequired) {
            this.isSaucesRequired = isSaucesRequired;
            return this;
        }

        public Builder isSpicy(boolean isSpicy) {
            this.isSpicy = isSpicy;
            return this;
        }

        // public constructor
        public McVegBurger build() {
            return new McVegBurger(this);
        }
    }

    // private constructor with Builder
    McVegBurger(Builder builder) {
        this.isPattyRequired = builder.isPattyRequired;
        this.isCheeseRequired = builder.isCheeseRequired;
        this.isToppingsRequired = builder.isToppingsRequired;
        this.isSaucesRequired = builder.isSaucesRequired;
        this.isSpicy = builder.isSpicy;
    }

    @Override
    public String toString() {
        return "McVegBurger{" +
                "isPattyRequired=" + isPattyRequired +
                ", isCheeseRequired=" + isCheeseRequired +
                ", isToppingsRequired=" + isToppingsRequired +
                ", isSaucesRequired=" + isSaucesRequired +
                ", isSpicy=" + isSpicy +
                '}';
    }

}
