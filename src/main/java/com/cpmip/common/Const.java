package com.cpmip.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String ORGCODE = "orgcode";

    public static final String USERNAME = "username";

    public static final String JOBID = "jobId";

    public static final String ROLE = "role";

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }

    public interface Role{
        int ROLE_COM_JS = 0;
        int ROLE_COM_SG = 1;
        int ROLE_GOV_JG = 2;
        int ROLE_GOV_ZJ = 3;
    }
}
