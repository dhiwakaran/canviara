package org.strategy;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 * Created by zftvs on 4/8/14.
 */

public class StrategyCheck{

    private int Analysis=0;
    private int formulation=0;
    private int implementation=0;
    private int result=0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getImplementation() {
        return implementation;
    }

    public void setImplementation(int implementation) {
        this.implementation = implementation;
    }

    public int getFormulation() {
        return formulation;
    }

    public void setFormulation(int formulation) {
        this.formulation = formulation;
    }


    public int getAnalysis() {
        return Analysis;
    }

    public void setAnalysis(int Analysis) {
        this.Analysis = Analysis;
    }

    public String  CheckStrategyResult()
    {
      //  result = ( Analysis * formulation * implementation) >= 1 ? 1 :0  ;
        return "success";
    }



}
