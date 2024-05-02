package builder;
import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {SMALL, BIG, MEDIUM}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private Size size;

        public Builder size(Size size){
            this.size = Objects.requireNonNull(size);
            return this;
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
