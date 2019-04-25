package org.primefaces.test;

import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@RequestScoped
public class TestViewCdi {

    private DualListModel<String> dualListModel;
    private DualListModel<String> dualListModel2;

    private String testString;
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces (from CDI!) !!!";

        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        List<String> list3 = new ArrayList<>();
        dualListModel = new CollectionDualListModel<>(list1, list3);
        dualListModel2 = new CollectionDualListModel<>(list1, list3);
        System.out.println("TestViewCdi init() done.");
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public DualListModel<String> getDualListModel() {
        return dualListModel;
    }

    public void setDualListModel(DualListModel<String> dualListModel) {
        this.dualListModel = dualListModel;
    }

    public DualListModel<String> getDualListModel2() {
        return dualListModel2;
    }

    public void setDualListModel2(DualListModel<String> dualListModel2) {
        this.dualListModel2 = dualListModel2;
    }

    public void action1() {
        System.out.println("action1 called!");
    }

    public void action2() {
        System.out.println("action2 called!");
    }
}
