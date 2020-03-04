package com.myyhhuang.hellofeign.beanim;

import com.myyhhuang.hellofeign.beanim.IMCounty;
import java.util.LinkedList;
import java.util.List;

public class IMCountyList {
    private List<IMCounty> imCounties;

    public IMCountyList() { this.imCounties = new LinkedList<IMCounty>(); }
    public IMCountyList(List<IMCounty> imCounties) {
        this.imCounties = imCounties;
    }

    public List<IMCounty> getImCounties() {
        return imCounties;
    }
}
