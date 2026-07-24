package model;

import java.util.UUID;

public class Project {
    private UUID project_id;
    private UUID account_id;
    private String name;
    private String description;

    public Project(String name) {
        this.name = name;
        this.project_id = project_id;
        this.account_id = account_id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public UUID getAccount_id() {
        return account_id;
    }

    public UUID getProject_id() {
        return project_id;
    }
}
