package com.xsk.filter.filter;

import java.util.ArrayList;
import java.util.List;

public class OHttpRequestManager {
    private List<OHttpRequestFilter> filters = new ArrayList<>();

    public void add(OHttpRequestFilter filter) {
        if (!filters.contains(filter)) {
            filters.add(filter);
        }
    }

    public boolean requestFilter(Object object) {
        for (OHttpRequestFilter aFilter : filters
                ) {
            if (!aFilter.filter(object)) {
                return false;
            }
        }
        return true;
    }
}
