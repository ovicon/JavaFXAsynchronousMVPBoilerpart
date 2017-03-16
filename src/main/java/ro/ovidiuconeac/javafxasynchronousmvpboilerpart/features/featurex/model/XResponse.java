package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model;

/**
 * Created by www.ovidiuconeac.ro on 3/16/17.
 */
public class XResponse {

    private String result;

    public XResponse(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof XResponse)) return false;

        XResponse xResponse = (XResponse) o;

        return result != null ? result.equals(xResponse.result) : xResponse.result == null;
    }

    @Override
    public int hashCode() {
        return result != null ? result.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "XResponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
