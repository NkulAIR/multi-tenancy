package model;

import java.util.UUID;

public class Organisation {
    private UUID account_no;
    private String organization_no;
    private String billing_tier;
    private String status;


    public Organisation(UUID account_no, String organization_no, String billing_tier, String status) {
        this.account_no = account_no;
        this.organization_no = organization_no;
        this.billing_tier = billing_tier;
        this.status = status;
    }
}
