package com.cpmip.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String ORGCODE = "orgcode";

    public static final String USERNAME = "username";

    public static final String JOBID = "jobId";

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }
}
