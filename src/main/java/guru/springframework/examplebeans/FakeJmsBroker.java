package guru.springframework.examplebeans;

public class FakeJmsBroker {

    private String username;
    private String password;
    private String url;


    @Override
    public String toString() {
        return "FakeJmsBroker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static final class Builder {
        private String username;
        private String password;
        private String url;

        private Builder() {
        }

        public static Builder aFakeJmsBroker() {
            return new Builder();
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public FakeJmsBroker build() {
            FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
            fakeJmsBroker.url = this.url;
            fakeJmsBroker.password = this.password;
            fakeJmsBroker.username = this.username;
            return fakeJmsBroker;
        }
    }
}
