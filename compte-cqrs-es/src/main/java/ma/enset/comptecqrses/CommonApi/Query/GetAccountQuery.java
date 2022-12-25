package ma.enset.comptecqrses.CommonApi.Query;

public class GetAccountQuery {
    private String id;

    public GetAccountQuery() {
    }

    public GetAccountQuery(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
