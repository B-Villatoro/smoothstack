package com.company.assignment3;

import java.util.Date;

public final class ImmutableClass /* Would Be priate*/ {

    private final String s;
    private final Date d;

    public ImmutableClass(String s,Date d){
        this.s = s;
        this.d = d;
    }

    public Date getd() {
    return (Date)d.clone();
    }
    public String gets(){
        return s;
    }
}
