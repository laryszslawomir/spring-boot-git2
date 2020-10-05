package pl.testBranch;

import java.util.Objects;

public class TestBranch {
    private String name;
    private String master;

    public TestBranch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
