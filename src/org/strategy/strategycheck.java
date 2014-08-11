package org.strategy;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

/**
 * Created by zftvs on 4/8/14.
 */

@ManagedBean
@SessionScoped

public class strategycheck  {

    private int strategyvalue;

    public int getStrategyvalue() {
        return strategyvalue;
    }

    public void setStrategyvalue(int strategyvalue) {
        this.strategyvalue = strategyvalue;
    }

    public String  CheckStrategyResult()
    {
        if (strategyvalue>=5000) {
            return "success";
        }else {
            return "failed";
        }


    }


    public String  StrategyResultIcon()
    {
        if (CheckStrategyResult() == "success") {
            return "Green";
        }else {
            return "Red";
        }


    }


}
